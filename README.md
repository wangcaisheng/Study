Displays the top public gists from Github.
![Demo](http://i.giphy.com/3o7TKW0nrNSwdar7Ms.gif)

项目结构：
app依赖common、network_api，common和network_api根据配置依赖base
(common、network_api作为基础依赖被所有的Model依赖)
知识点：
1，DataBinding的使用
第一：
android {
    ...
    dataBinding {
        enabled = true
    }
}

第二：布局文件根布局是layout;layout 中同时存放要绑定的数据及布局
<layout xmlns:android="http://schemas.android.com/apk/res/android">
​  部分一：绑定的数据
    <data>
        <variable name="title" type="java.lang.String" />
    </data>
​
    部分二：布局
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{title}" />
    </LinearLayout>
</layout>

第三步：不是setContentView,而是 viewDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
返回的是DataBinding对象。

具体参考MvvmActivity类。

2，MVVM搭建

3，CC组件化改造






