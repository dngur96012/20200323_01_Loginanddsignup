package com.example.a20200323_01_loginanddsignup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.a20200323_01_loginanddsignup.databinding.ActivityMainBinding;

public class MainActivity extends BaseAcitivity {


    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
         setEvents();
         setValues();
    }

    @Override
    public void setEvents() {

    }

    @Override
    public void setValues() {

    }
}
