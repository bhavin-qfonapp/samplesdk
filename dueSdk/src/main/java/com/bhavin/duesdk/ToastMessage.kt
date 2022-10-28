package com.bhavin.duesdk

import android.content.Context
import android.widget.Toast

/**
 * @Author: Bhavin
 * @Date: 28-Oct-22
 */
class ToastMessage {
    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}