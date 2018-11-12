package com.kossine.dial;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter inf = new IntentFilter(Intent.ACTION_POWER_DISCONNECTED);
        registerReceiver(new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "Power Disconnected", Toast.LENGTH_LONG).show();
            }
        }, inf);

        

    }

    public void fun(View V){
        Intent ie = new Intent("counting.begins");
        sendOrderedBroadcast(ie, null);
//        Intent in = new Intent(Intent.ACTION_DIAL);
//        Uri uri = Uri.parse("tel:8779238410");
//        in.setData(uri);
//        startActivity(in);
    }

}
