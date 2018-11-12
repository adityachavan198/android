package com.kossine.output;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent in = getIntent();
        String m = in.getStringExtra("msg");
        setContentView(R.layout.activity_main);
        e = (EditText) findViewById(R.id.editText);
        e.setText(m);

    }
    public void ok(View v){
        EditText t = (EditText) findViewById(R.id.editText);
        String msg = t.getText().toString();
        Intent i = new Intent();
        i.putExtra("newmsg", msg);
        setResult(2, i);
        super.onBackPressed();

    }

}
