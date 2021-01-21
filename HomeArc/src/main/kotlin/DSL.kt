/**
 *@author: Hyman
 *time: 2021/1/20 下午9:32
 *des: 讲解SDL：实现build.gradle中添加依赖库的"语法结构"
 */

fun main(){
    val libraries=dependencies{
        implementation("com.hyman.retrofit")
        implementation("com.hyman.arch.mvvm")
    }
    for(lib in libraries){
        println(lib)
    }
}


class Dependency{
    val libs=ArrayList<String>()
    fun implementation(lib:String){
        libs.add(lib)
        println("implementation方法被调用")
    }
}

//定义一个高阶函数，返回一个集合
fun dependencies(block:Dependency.()->Unit) : List<String>{  //Dependency.表示这个函数类型 的参数是定义在Dependency类中的
    val dependency=Dependency()
    println("dependencies方法被调用")
    dependency.block()
    return dependency.libs
}