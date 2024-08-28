package com.example.ch03;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;

    //onCreate: MainActivity가 처음 실행될 때 이 안에 있는 구문을 한번 다 실행시켜라
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test);



        btn_move = findViewById(R.id.btn_move);
        //btn_move를 클릭했을 때
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class); //현재 액티비티, 이동하고 싶은 액티비티
                intent.putExtra("str", str); //별명, 실제 들어가는 데이터
                startActivity(intent); //액티비티 이동
            }
        });
    }
}