package com.ytl.diyfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.ytl.diyfont.base.BaseAct;

public class MainActivity<T> extends BaseAct
{
    private TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_title = (TextView)findByFontId(R.id.tv_title);
        tv_title.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this,"hello", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public TextView findByFontId(int id)
    {
        TextView view = (TextView) findViewById(id);
        Typeface customFont = Typeface.createFromAsset(this.getAssets(), "fonts/hwxk.ttf");
        view.setTypeface(customFont);
        return view;
    }
}
