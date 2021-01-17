/**
 * 内联函数
 * 在定义高阶函数时加上inline关键字声明就是内联函数
 */

fun main(){
    val num1=100
    val num2=80
    val result=n1AndN2(num1,num2){ n1: Int, n2: Int ->
        n1+n2
    }
    //最终替换结果：
//    val result=num1+num2
}

//定义内联函数
inline fun n1AndN2(num2:Int, num1:Int, operation:(Int,Int)->Int):Int{
    return operation(num1,num2)
}

