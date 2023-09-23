package androidx.appcompat.app

import android.content.DialogInterface
import android.widget.TextView
import androidx.appcompat.R
import androidx.appcompat.widget.AlertDialogLayout

/**
 * Extension functions to set ThemeColors to AlertDialog views
 *
 * We cannot access AlertDialog.mAlert outside of its package (androidx.appcompat.app),
 * so created a new package 'androidx.appcompat.app' to access mAlert: AlertController variable.
 */

fun AlertDialog.setBackgroundAndTextColors(backgroundColor: Int, titleTextColor: Int, messageTextColor: Int) {
    getAlertDialogRootView(this)?.apply {
        setBackgroundColor(backgroundColor)
        findViewById<TextView?>(R.id.alertTitle)?.setTextColor(titleTextColor)
        findViewById<TextView?>(android.R.id.message)?.setTextColor(messageTextColor)
    }
}

private fun getAlertDialogRootView(alertDialog: AlertDialog): AlertDialogLayout? {
    return alertDialog.mAlert.mScrollView.parent.parent as? AlertDialogLayout
}

fun AlertDialog.setPositiveButtonTextColor(textColor: Int) {
    this.mAlert.getButton(DialogInterface.BUTTON_POSITIVE)?.setTextColor(textColor)
}

fun AlertDialog.setNegativeButtonTextColor(textColor: Int) {
    this.mAlert.getButton(DialogInterface.BUTTON_NEGATIVE)?.setTextColor(textColor)
}

fun AlertDialog.setBackgroundColor(backgroundColor: Int) {
    getAlertDialogRootView(this)?.setBackgroundColor(backgroundColor)
}

fun AlertDialog.setTitleTextColor(titleTextColor: Int) {
    getAlertDialogRootView(this)?.findViewById<TextView?>(R.id.alertTitle)
        ?.setTextColor(titleTextColor)
}

fun AlertDialog.setMessageTextColor(textColor: Int) {
    getAlertDialogRootView(this)?.findViewById<TextView?>(android.R.id.message)
        ?.setTextColor(textColor)
}