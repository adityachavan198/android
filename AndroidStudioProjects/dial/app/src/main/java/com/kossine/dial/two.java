package com.kossine.dial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class two extends BroadcastReceiver {
    public two() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Two", Toast.LENGTH_LONG).show();
    }
}
