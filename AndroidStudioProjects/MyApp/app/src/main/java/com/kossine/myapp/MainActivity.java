package com.kossine.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public   void fun(View v)
    {
        CheckBox checkBox = (CheckBox) findViewById(R.id.CcheckBox);
        CheckBox checkBox1=(CheckBox) findViewById(R.id.CppcheckBox);
        CheckBox checkBox2=(CheckBox) findViewById(R.id.javacheckBox);
        TextView tv= (TextView)findViewById(R.id.textView);

        tv.setText("Selected "+
                (checkBox.isChecked()?checkBox.getText():"")
                +" "+
                (checkBox1.isChecked()?checkBox1.getText():"")
                +" "+
                (checkBox2.isChecked()?checkBox2.getText():""));


    }
}
