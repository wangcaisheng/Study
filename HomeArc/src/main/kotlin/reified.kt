import android.content.Context
import android.content.Intent

//**********************A********************************
//调用：startActivity<TestActivity>（context）
inline fun<reified T> startActivity(context: Context){
    val intent= Intent(context,T::class.java)
    context.startActivity(intent)
}
//---------上面的调用方式startActivity<TestActivity>（context）原本写法：
// val intent=Intent(context,TestActivity::class.java)
//context.startActivity(intent)

//******************************************************



//********************上面的A方式无法传参，解决如下：**********************************
inline fun<reified T> startActivity(context: Context,block:Intent.()->Unit){
    val intent= Intent(context,T::class.java)
    intent.block()
    context.startActivity(intent)
}
//--------------调用方式：
// startActivity<TestActivity>(context){
//    putExtra("","")
//}
//************************************************************