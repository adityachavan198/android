package com.kossine.connecting2components;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText name, age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ok(View v){
        name = (EditText) findViewById(R.id.NameEditText);
        age = (EditText) findViewById(R.id.AgeEditText);
        String n = name.getText().toString();
        String a = age.getText().toString();
        Intent in = new Intent(this, second.class);
        in.putExtra("msg", n + " " + a);
        startActivityForResult(in, 10);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        String msg = data.getStringExtra("newmsg").toString();
        String a[] = msg.split(" ");
        name.setText(a[0]);
        age.setText(a[1]);

    }
}
