package com.example.ch02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //특정 아이디를 et_id에 부여해라
        et_id = findViewById(R.id.et_id);
        btn_test = findViewById(R.id.btn_test);

        //버튼을 눌렀을 대 "김채은" 텍스트가 나오게 해라.
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_id.setText("김채은");
            }
        });

    }
}