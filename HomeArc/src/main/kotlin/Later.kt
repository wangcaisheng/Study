import kotlin.reflect.KProperty

/**
 * 自己实现 lazy函数
 * 委托类方法要用operator关键字
 */


fun main() {
    val p by later{
        println("我被调用啦")
        "我是返回值"
    }
    println(p)
}

//顶层函数
fun <T> later(block: () -> T) = Later(block)//这个函数的作用：创建Later类的实例，并将接收的函数类型的参数传给Later类的构造函数

class Later<T>(val block: () -> T) {
    var value: Any? = null  //使用这个变量对值进行缓存
    operator fun getValue(any: Any?, prop: KProperty<*>): T {
        if (value == null) {
            value = block()
        }
        return value as T
    }
}