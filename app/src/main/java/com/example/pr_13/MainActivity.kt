package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.pr_13.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText1.requestFocus()
    }
    private val editText1:EditText=findViewById(R.id.editText1)
    private val editText2:EditText=findViewById(R.id.editText2)
    private val textView3: TextView =findViewById(R.id.textView3)
    fun changeButton_Click() {
        if(editText1.text==null)
        {
            val toast1:Toast= Toast.makeText(applicationContext,"Введите курс обмена!",Toast.LENGTH_SHORT)
            toast1.show()
            editText1.requestFocus()
        }
        else if (editText2.text==null)
        {
            val toast2:Toast= Toast.makeText(applicationContext,"Введите сумму для обмена!",Toast.LENGTH_SHORT)
            toast2.show()
            editText2.requestFocus()
        }
        else{
            val res:Double=editText1.getText().toString().toDouble()*editText2.getText().toString().toDouble()
            textView3.setText(R.string.result.toString()+res.toString())
        }
    }
}
