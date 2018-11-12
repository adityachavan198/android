package com.kossine.input;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void fun(View v){
        name = (EditText) findViewById(R.id.Name);
        String n = name.getText().toString();
        Intent ie = new Intent("first.intent.input.msg");
        ie.putExtra("msg", n);
        startActivityForResult(ie, 10);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        String msg = data.getStringExtra("newmsg").toString();
        name.setText(msg);
    }
}
