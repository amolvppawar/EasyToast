package com.ams.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ams.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.EasyToast(this,"Im fine");
    }
}