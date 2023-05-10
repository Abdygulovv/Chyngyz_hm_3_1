package com.example.chyngyz_hm_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvSurName;
    TextView tvAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViews();
        setText();
    }

    private void findViews() {
        tvName = findViewById(R.id.tv_name);
        tvSurName = findViewById(R.id.tv_surname);
        tvAge = findViewById(R.id.tv_age);
    }

    private void setText() {
        tvName.setText(getIntent().getStringExtra("firstName"));
        tvSurName.setText(getIntent().getStringExtra("lastName"));
        tvAge.setText(getIntent().getStringExtra("age"));
    }
}