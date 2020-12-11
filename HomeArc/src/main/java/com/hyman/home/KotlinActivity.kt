package com.hyman.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyman.home.bean.User

/**
 * kotlin的协程和伴生对象、主次构造函数、枚举类、注解类、Lambda 表达式、星投影、扩展函数和扩展属性、类委托、高阶函数。还有kotlin的语法糖。
 */

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

    }

    /**
     * 主次构造函数
     */

    /**
     * 伴生对象
     * 静态函数和静态属性都会 生成伴生对象来管理
     */
//    companion object {
//
//        private var INSTANCE: Repository? = null
//
//        val instance: Repository
//            get() {
//                if (INSTANCE == null) {
//                    synchronized(Repository::class.java) {
//                        if (INSTANCE == null) {
//                            INSTANCE = Repository()
//                        }
//                    }
//                }
//                return INSTANCE
//            }
//    }

    /**
     * 单利 用 object 代替class
     */


    /**
     * 针对集合的操作 for可以用map代替
     */
    private var users=mutableListOf<User>()


    val formattedUserNames: List<String>
    get() {
        val userNames = ArrayList<String>(users.size)
        //集合方法一
        for (user in users) {
            val name = user.firstName
            userNames.add(name)
        }
        //集合方法二 (这里可以再简化)
        users.map { user ->
            val name = user.firstName
            userNames.add(name)
        }
        return userNames
    }


}