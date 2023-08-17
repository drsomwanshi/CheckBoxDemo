package com.example.checkboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun1(View view) {

        CheckBox ch1=findViewById(R.id.ch1);
        CheckBox ch2=findViewById(R.id.ch2);
        CheckBox ch3=findViewById(R.id.ch3);
        String msg="";
        if(ch1.isChecked())
        {
            msg= " "+ch1.getText().toString();

        }
        if(ch2.isChecked())
        {
            msg= " "+ch2.getText().toString();

        }
        if(ch3.isChecked())
        {
            msg= " "+ch3.getText().toString();

        }
        Toast.makeText(this, "You Selected:"  +msg, Toast.LENGTH_SHORT).show();



    }
}