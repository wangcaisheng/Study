package com.hyman.home.base

import android.util.Log
import androidx.fragment.app.Fragment

/**
 * Author: tom
 * Date: 2021/1/15
 * Description: 用于实现Fragment和ViewPager2 嵌套时实现懒加载
 *  注意：FragmentStateAdapter 构造时传入Fragment实例
 */
abstract class BaseLazyFragment : BaseLifecycleFragment() {
    protected open var TAG1 = "LL-${this.javaClass.simpleName}"
    private var currentVisible = false
    private var isFirstLoad = true

    /**
     * 当前为顶层Fragment时是否处于显示状态（父Fragment不是BaseLazyFragment得情况）
     * 情况1：Activity-Viewpager-BaseLazyFragment 没有嵌套一般都是处于显示状态 true
     * 情况2：当前fragment处于DrawerLayout中，默认不可见 false
     */
    private var defaultVisible = true


    override fun onResume() {
        super.onResume()
        dispatchVisible(true)
    }

    /**
     * 非嵌套情况下，getUserVisibleHint() = true 即可带边当前fragment是显示的
     */
    override fun onPause() {
        super.onPause()
        dispatchVisible(false)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        isFirstLoad = true
    }


    /**
     * 该方法与 setUserVisibleHint 对应，调用时机是 show，hide 控制 Fragment 隐藏的时候，
     * 注意的是，只有当 Fragment 被创建后再次隐藏显示的时候才会调用，第一次 show 的时候是不会回调的。
     */
    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        if (hidden) {
            dispatchVisible(false)
        } else {
            dispatchVisible(true)
        }
    }

    open fun dispatchVisible(isVisible: Boolean) {
        //要将当前Fragment设为可见状态，必须先检查父Fragment是否显示
        if (isVisible && !getParentFragmentVisible()) return
        //这种情况发生在 onPause调用时，当前Fragment已经将状态置位不可见，父Fragment又将不可见的状态分发到当前Fragment
        if (isVisible == currentVisible) return
        currentVisible = isVisible
        if (isVisible) {
            if (isFirstLoad) {
                onFirstVisibleRun()
                Log.d( TAG1,"firstVisibleRun")
                isFirstLoad = false
            }
            onFragmentVisible()
            Log.d( TAG1,"onFragmentVisible")
        } else {
            onFragmentHidden()
            Log.d(TAG1, "onFragmentHidden")
        }
        dispatchChildVisible(isVisible)
    }


    private fun dispatchChildVisible(isVisible: Boolean) {
        val fragmentList: List<Fragment> =
            childFragmentManager.fragments
        for (fragment in fragmentList) {
            //子Fragment处于可见时才分发状态
            if (fragment is BaseLazyFragment && !fragment.isHidden() && fragment.isResumed) {
                fragment.dispatchVisible(isVisible)
            }
        }
    }

    /**
     * 判断父Fragment是否处于可见状态
     */
    private fun getParentFragmentVisible(): Boolean {
        return if (parentFragment is BaseLazyFragment) {
            (parentFragment as BaseLazyFragment).getVisible()
        } else defaultVisible
    }

    fun getVisible(): Boolean {
        return currentVisible
    }

    /**
     * 一般不用设置，fragment在DrawerLayout中时需要设置
     * @param isVisible
     */
    private fun setDefaultVisible(isVisible: Boolean) {
        defaultVisible = isVisible
    }


    /**
     * fragment第一次可见时会调用该方法
     */
    open fun onFirstVisibleRun(){}

    /**
     * fragment每次可见时会调用该方法
     */
    open fun onFragmentVisible(){}

    /**
     * fragment每次由可见变为不可见时会调用该方法
     */
    open fun onFragmentHidden(){}

}