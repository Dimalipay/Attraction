package com.example.attraction;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView tv1, tv3;
    Button btn_video;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.iv3);
        tv1 = findViewById(R.id.tv1);
        tv3 = findViewById(R.id.tv3);
        btn_video = findViewById(R.id.button_video);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("Name");
        String info = intent.getExtras().getString("Info");
        String video = intent.getExtras().getString("Video");
        int image = intent.getExtras().getInt("Image");

        img.setImageResource(image);
        tv1.setText(name);
        tv3.setText(info);

        btn_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(video));
                    startActivity(intent1);
                } catch (Exception e){

                }
            }
        });

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