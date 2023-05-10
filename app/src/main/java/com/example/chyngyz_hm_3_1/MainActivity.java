package com.example.chyngyz_hm_3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etSurname;
    EditText etAge;
    AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setClick();
    }

    private void findViews() {
        etName = findViewById(R.id.et_name);
        etSurname = findViewById(R.id.et_surname);
        etAge = findViewById(R.id.et_age);
        button = findViewById(R.id.button);
    }

    private void setClick() {
        button.setOnClickListener(v ->{
                    if (!etName.getText().toString().isEmpty() && !etSurname.getText().toString().isEmpty() && !etAge.getText().toString().isEmpty()){
                        navigateToSecond();
                    }else {
                        Toast.makeText(MainActivity.this,"Заполните поле: " + WhichIsEmpty(),Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    private String WhichIsEmpty() {
        String string = "";
        if(etName.getText().toString().isEmpty()){
            string = string + " Имя, ";
        }
        if (etSurname.getText().toString().isEmpty()) {
            string = string + " Фамилия, ";
        }
        if (etAge.getText().toString().isEmpty()) {
            string = string + " Возраст.";
        }
        return string;
    }

    private void navigateToSecond() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("firstName", etName.getText().toString());
        intent.putExtra("lastName", etSurname.getText().toString());
        intent.putExtra("age", etAge.getText().toString());
        startActivity(intent);
    }
}