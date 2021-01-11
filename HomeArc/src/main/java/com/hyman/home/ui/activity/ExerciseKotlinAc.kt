package com.hyman.home.ui.activity

import android.content.DialogInterface
import android.content.Intent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.hyman.home.R
import kotlinx.android.synthetic.main.ac_exercise.*

class ExerciseKotlinAc : AppCompatActivity(), View.OnClickListener {

    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        setContentView(R.layout.ac_exercise)
        dealClick()
    }

    private fun dealClick() {
        bt.setOnClickListener (this)
        bt2.setOnClickListener(this)
        bt3.setOnClickListener(this)
        iv.setImageResource(R.drawable.ic_launcher_foreground)
    }

    companion object{
        @JvmStatic
        fun startMe(context:AppCompatActivity){
            val intent= Intent(context,ExerciseKotlinAc::class.java)
            context.startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.bt->{
               tv.text = ed.text
               Toast.makeText(this,tv.text,Toast.LENGTH_SHORT).show()
           }
           R.id.bt2->{
               progress_bar.progress=progress_bar.progress+10
           }
           R.id.bt3->{
               showDialog()
           }
       }
    }

    /**
     *
     */
    private fun showDialog() {
        AlertDialog.Builder(this).apply {
            setTitle("This is Dialog")
            setMessage("Somthing important")
            setPositiveButton("Ok"){ _: DialogInterface?, _: Int ->

            }
            setNegativeButton("Cancel") { _: DialogInterface, _: Int ->

            }
            show()
        }
    }

}