package com.example.broadcastreciever2


import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class BroadCast : BroadcastReceiver() {

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action.equals(Intent.ACTION_POWER_CONNECTED))
            Toast.makeText(context, "دمت گرم شارژمون کردی", Toast.LENGTH_LONG).show()
        if (intent?.action.equals(Intent.ACTION_POWER_DISCONNECTED))
            Toast.makeText(context, "خدا خیرت بده", Toast.LENGTH_LONG).show()
    }

}