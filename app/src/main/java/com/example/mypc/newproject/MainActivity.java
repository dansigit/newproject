package com.example.mypc.newproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"message",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"my mesrsage",Toast.LENGTH_LONG).show();

    }
}
