package com.leo.androidriskshow;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ExportedBroadCastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.e("AndroidRiskShow","Received BroadCast");
        String name = intent.getStringExtra("name");
        Log.e("AndroidRiskShow","Hello " + name);
    }
}
