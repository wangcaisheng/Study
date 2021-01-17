

//抛开infix；这是String类的扩展函数
infix fun String.beginWith(prefix:String)=startsWith(prefix)

infix fun <T> Collection<T>.has(element:T)=contains(element)


