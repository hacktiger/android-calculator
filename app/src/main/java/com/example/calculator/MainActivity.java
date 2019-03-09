package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapVar();
    }

    private void mapVar() {
        mTextView = findViewById(R.id.text_view);
        mBtn = findViewById(R.id.btn_c);
        mBtn.setOnClickListener(v -> {
            mTextView.setText("AAAAA");
        });
    }
}
