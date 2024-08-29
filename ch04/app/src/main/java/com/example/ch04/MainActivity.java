package com.example.ch04;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test = (ImageView)findViewById(R.id.test);
        //test 이미지를 눌렀을 때
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //팝업 메시지 출력
                //getApplicationContext(): 본인의 MainActivity를 뜻함
                Toast.makeText(getApplicationContext(), "세 번째 연습입니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}