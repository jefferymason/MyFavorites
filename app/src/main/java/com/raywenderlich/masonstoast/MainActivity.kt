package com.raywenderlich.masonstoast

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun toastMsg(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg(v: View?) {
        toastMsg("My favorite color is red.")
    }

    private fun toastMsg2(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg2(v: View?) {
        toastMsg("My favorite food is pizza.")
    }

    private fun toastMsg3(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg3(v: View?) {
        toastMsg("My favorite tv show is Frasier.")
    }

    private fun toastMsg4(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg4(v: View?) {
        toastMsg("My favorite artist is Prince.")
    }

    private fun toastMsg5(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg5(v: View?) {
        toastMsg("My favorite day of the week is Wednesday.")
    }

    private fun toastMsg6(msg: String?) {
        val toast = Toast.makeText(this, msg, Toast.LENGTH_LONG)
        toast.show()
    }

    fun displayToastMsg6(v: View?) {
        toastMsg("My favorite season is summer.")
    }
}