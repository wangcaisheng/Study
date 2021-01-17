import android.content.ContentValues

/**
 * contentValues简化
 */
fun main(){
    // A to B语法结构 组成键、值对，创建出Pair类型
    val values=cvOf("name" to "Hyman","author" to "hh")
}
//vararg:vararg修饰代表是可变参数
//Pair类型是键、值对数据结构。通过泛型置顶key value 分别是什么类型
//在Kotlin中，Any是所有类的基类。 Any?表示可以是任何类型，且可以为空
fun cvOf(vararg pairs:Pair<String,Any?>):ContentValues{
    val cv=ContentValues()
    for (pair in pairs){
        val key=pair.first
        val value=pair.second
        when(value){//ContentValues的value支持的类型
            is Short ->cv.put(key,value)
            is Int -> cv.put(key,value)
            is Long ->cv.put(key,value)
            is Float ->cv.put(key,value)
            is Double -> cv.put(key,value)
            is Boolean -> cv.put(key,value)
            is String -> cv.put(key,value)
            is Byte ->cv.put(key,value)
            is ByteArray ->cv.put(key,value)
            null -> cv.putNull(key)
        }
    }
    return cv
}