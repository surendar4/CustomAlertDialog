package com.surendar4.custom.message.customalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.setBackgroundAndTextColors
import androidx.appcompat.app.setNegativeButtonTextColor
import androidx.appcompat.app.setPositiveButtonTextColor
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_show_alert_dialog).setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showAlertDialog() {
        val alertDialog = AlertDialog.Builder(this)
            .setTitle("This is the title")
            .setMessage("This is the message")
            .setPositiveButton("Positive button") { dialog, _ ->
                dialog.dismiss()
            }
            .setNegativeButton("Negative button") { dialog, _ ->
                dialog.dismiss()
            }
            .show()

        alertDialog.setBackgroundAndTextColors(
            backgroundColor = ContextCompat.getColor(this, R.color.alert_background_color),
            titleTextColor = ContextCompat.getColor(this, R.color.alert_title_color),
            messageTextColor = ContextCompat.getColor(this, R.color.alert_message_color)
        )

        alertDialog.setPositiveButtonTextColor(ContextCompat.getColor(this, R.color.alert_positive_button_color))
        alertDialog.setNegativeButtonTextColor(ContextCompat.getColor(this, R.color.alert_negative_button_color))
    }
}