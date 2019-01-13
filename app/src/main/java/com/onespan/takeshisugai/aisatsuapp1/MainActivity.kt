package com.onespan.takeshisugai.aisatsuapp1


import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.app.TimePickerDialog
import android.widget.TimePicker
//import android.support.v4.app.DialogFragment


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener, TimePickerDialog.OnTimeSetListener {
    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button1.setOnClickListener(this)

        button1.setOnClickListener {
            Log.d("UI_PARTS", "ボタンをタップしました")
        }

    }
    */
    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
            //showTimePickerDialog()
            //textView.text = editText.text.toString()
        }
    }

    // showTimePickerDialog"

    @SuppressLint("SetTextI18n")
    private fun showTimePickerDialog() {

        // val hour1 = ""
       // val messageView: TextView = findViewById(R.id.textView)

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")


                val messageView: TextView = findViewById(R.id.textView)

                //         2:00 ~ 9:59
                if (2 <= hour && hour <= 9) {
                    run({

                        messageView.text = "おはよう"

                    })
                } else if (10 <= hour && hour <= 17) {

                    messageView.text = "こんにちは"

                } else if (18 <= hour && hour <= 24) {
                    messageView.text = "こんばんわ"

                } else if (0 <= hour && hour <= 1) {
                    messageView.text = "こんばんわ"
                }
            },
                13, 0, true


                               // val messageView: TextView = findViewById(R.id.textView)
        )

      


        timePickerDialog.show()

        // textView.text = editText.text.toString()
        //  textView.text = hour.toString() + ":" + minute
       // this.textView.text = "$hour:$minute"
        // this.textView.show()

        // dateViewのテキストを変更
        /*
        val test = findViewById<TextView>(R.id.textView)
         test.text = "${hour}時${minute}分"
         //this.textView.show()
*/

       // val messageView: TextView = findViewById(R.id.textView)

        // val hour3 = timePickerDialog.


        // val newFragment = TimePick()
       // newFragment.show(supportFragmentManager, "datePicker")

        // messageView.text = "$hour" + ":"

       // messageView.text = "test ++++ :"

        // messageView.text =  timePickerDialog + ":" // + minute.toString()
        // messageView.text = "サンプルメッセージ表示"
        // messageView.text = "${hour}時${minute}分"





        // override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {


    }
/*
    fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = getInstance()

        // at the first, to get the system current hour and minute
        val hour1 = c.get(Calendar.HOUR_OF_DAY)
        val minute1 = c.get(Calendar.MINUTE)

        /*
        var timePickerDialog = TimePickerDialog(
            activity,
            // in order to return parameters to MainActivity
            activity as MainActivity?,
            hour1,
            minute1,
            true
        )

        */

        return hour1
    }
*/
        // textView.text = "テキスト"
        //val button
        // button1.setOnClickListener(this)


}

/*
private val TimePickerDialog.hour: Unit
    get()


    {}
*/

