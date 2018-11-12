package com.kossine.dial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class one extends BroadcastReceiver {
    public one() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "One", Toast.LENGTH_LONG).show();
    }
}
