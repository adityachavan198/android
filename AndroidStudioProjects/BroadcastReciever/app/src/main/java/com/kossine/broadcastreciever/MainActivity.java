package com.kossine.broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter one = new IntentFilter("counting.begins");
        one.setPriority(1);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "one", Toast.LENGTH_LONG).show();
            }
        }, one);
        IntentFilter two = new IntentFilter("counting.begins");
        two.setPriority(10);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "Two", Toast.LENGTH_LONG).show();
            }
        }, one);
        IntentFilter three = new IntentFilter("counting.begins");
        three.setPriority(5);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "Three", Toast.LENGTH_LONG).show();
            }
        }, one);
    }
    public void fun(View V){
        Intent ie = new Intent("counting.begins");
        sendOrderedBroadcast(ie, null);
    }
}
