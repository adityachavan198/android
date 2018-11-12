package com.kossine.connecting2components;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class second extends AppCompatActivity {

    EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent x = getIntent();
        String m = x.getStringExtra("msg");
        setContentView(R.layout.activity_second);
        t = (EditText) findViewById(R.id.editText2);
        t.setText(m);
    }
    @Override
    public void onBackPressed(){
        String s = t.getText().toString();
        Intent ie = new Intent();
        ie.putExtra("newmsg", s);
        setResult(2, ie);
        super.onBackPressed();
    }
}
