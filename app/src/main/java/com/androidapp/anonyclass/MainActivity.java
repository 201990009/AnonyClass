package com.androidapp.anonyclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mButton1;
    Button mButton2;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mTextView = findViewById(R.id.textView);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {
                switch(v.getId())
                {
                    case R.id.button1: mTextView.setText("You clicked button 1");
                    break;
                    case R.id.button2: mTextView.setText("You clicked button 2");
                    break;
                    default: break;
                }
            }
    }