package com.hyman.home.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.hyman.home.R
import com.hyman.home.bean.User
import com.hyman.home.databinding.ActivityKotlinBinding
import com.hyman.home.ktx.alert
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * kotlin的协程和伴生对象、主次构造函数、枚举类、注解类、Lambda 表达式、星投影、扩展函数和扩展属性、类委托、高阶函数。还有kotlin的语法糖。
 */

class KotlinActivity : AppCompatActivity() {
    
    lateinit var binding: ActivityKotlinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_kotlin)
        dealClick()
        binding.jdView.setData("1,爱工作 \n 2，爱生活 \n 3,要阳光 \n 4,要阳光")
    }

    private fun dealClick() {
       binding.bt1.setOnClickListener {
           GlobalScope.launch {
               val value = alert("Warming","do you want this?")
               Toast.makeText(this@KotlinActivity, "My choice is ${value}", Toast.LENGTH_SHORT).show()
           }
       }
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

    /**
     * 属性与支持属性
     *
     * 支持属性为了解决属性可以被使用者修改问题
     */

    // TODO: 2020/12/11 扩展函数 扩展属性 

}