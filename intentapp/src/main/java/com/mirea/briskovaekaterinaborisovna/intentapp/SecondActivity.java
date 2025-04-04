package com.mirea.briskovaekaterinaborisovna.intentapp;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Получаем intent, который запустит эту активность
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        //Поиск TextView и вставка текста
        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText(message);
    };
}