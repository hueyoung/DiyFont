package com.ytl.diyfont.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public abstract class BaseAct<T> extends AppCompatActivity
{
     @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }

    public abstract TextView findByFontId(int id);
}
