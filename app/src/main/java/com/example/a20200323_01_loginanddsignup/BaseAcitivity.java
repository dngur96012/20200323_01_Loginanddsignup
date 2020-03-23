package com.example.a20200323_01_loginanddsignup;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseAcitivity extends AppCompatActivity {
    public Context mContext = this;

    public abstract  void  setEvents();
    public abstract  void setValues();

}
