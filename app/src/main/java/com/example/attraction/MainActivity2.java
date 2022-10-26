package com.example.attraction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.iv3);
        tv1 = findViewById(R.id.tv1);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("Name");
        int image = intent.getExtras().getInt("Image");

        img.setImageResource(image);
        tv1.setText(name);

        Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // конструкция try - catch - это ловитель ошибок
                try {
                    Intent intent = new Intent(MainActivity2.this, GameLevels.class); //есть намерение перейти с Gamelevels в окно MainActivity
                    startActivity(intent);
                    finish(); //запуск процедуры перехода и команда finish закрывает текущее окно
                } catch (Exception e) {

                }
            }
        });
    }
}