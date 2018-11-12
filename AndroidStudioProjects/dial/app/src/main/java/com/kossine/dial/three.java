package com.kossine.dial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class three extends BroadcastReceiver {
    public three() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "three", Toast.LENGTH_LONG).show();
    }
}
