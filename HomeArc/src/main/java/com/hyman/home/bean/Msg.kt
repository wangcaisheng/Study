package com.hyman.home.bean

/**
 *@author: Hyman
 *time: 2021/1/13 下午8:56
 *des:
 */
class Msg(context: String,val type: Int) {

    //定义了两个常量。定义常量的关键字是const
    //只有在单利类、companion object 或顶层方法中才能使用const关键字
    companion object {
        const val TYPE_RECEIVE = 0
        const val TYPE_SEND = 1
    }
}