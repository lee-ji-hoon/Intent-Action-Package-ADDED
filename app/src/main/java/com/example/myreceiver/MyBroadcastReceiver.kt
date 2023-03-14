package com.example.myreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log


class MyBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent) {
        if (Intent.ACTION_PACKAGE_ADDED == intent.action) {
            val packageName = intent.data!!.schemeSpecificPart
            Log.d("MyBroadcastReceiver", "Package added: $packageName")
        }
    }
}
