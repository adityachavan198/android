package com.kossine.broadcastreciever;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver2 extends BroadcastReceiver {
    public MyReceiver2() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification note = new Notification.Builder(context).setContentTitle("New mail from ")
                .setContentText("hello")
                .setSmallIcon(R.mipmap.ic_launcher)
                .build();
        nm.notify(101, note);
    }
}
