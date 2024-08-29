package com.example.ch03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent(); //어디선가 날라오는 데이터를 받겠다.
        String str = intent.getStringExtra("str"); //스트링 형태의 데이터가 날라오는 것을 받을거다.

        tv_sub.setText(str); //str 데이터를 넣는 것임

    }
}
