package com.androidapp.anonyclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mTextView = findViewById(R.id.textView);

        mButton1.setOnClickListener(new MyOnClickListener());
    }

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v)
        {
            mTextView.setText("You clicked button 1");
        }
    }
}