/**
 * 高阶函数
 */

fun main(){
    val num1=100
    val num2=80

    //高阶函数使用一
    //这是函数引用的方式在使用高级函数(需要定义函数plus minus)
    val result1=num1AndNum2(num1,num2,::plus)
    val result2=num1AndNum2(num1,num2,::minus)
    println("result1 is $result1")
    println("result2 is $result2")

    //高阶函数使用二
    //Lambda表达式，不需要定义函数，直接用Lambda
    val result3=num1AndNum2(num1,num2){ n1: Int, n2: Int ->
        n1+n2
    }
    val result4=num1AndNum2(num1,num2){ n1: Int, n2: Int ->
        n1-n2
    }
    println("result3 is $result3")
    println("result4 is $result4")
}

//定义高阶函数
fun num1AndNum2(num1:Int,num2:Int,operation:(Int,Int)->Int):Int{
    return operation(num1,num2)
}

//定义函数，作为参数传入高阶函数
fun plus(num1: Int,num2: Int):Int{
    return num1+num2
}

fun minus(num1: Int,num2: Int):Int{
    return num1-num2
}


