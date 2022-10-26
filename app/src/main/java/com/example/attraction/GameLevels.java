package com.example.attraction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

public class GameLevels extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.gamelavels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerView = findViewById(R.id.recycelrView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация1"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация2"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация3"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация4"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация5"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация6"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация7"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация8"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация9"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша", "информация10"));

        ModelRecycelrView modelRecycelrView = new ModelRecycelrView(this, arrayList);
        recyclerView.setAdapter(modelRecycelrView);


       Button button_back = (Button) findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // конструкция try - catch - это ловитель ошибок
                try {
                    Intent intent = new Intent(GameLevels.this, MainActivity.class); //есть намерение перейти с Gamelevels в окно MainActivity
                    startActivity(intent);
                    finish(); //запуск процедуры перехода и команда finish закрывает текущее окно
                } catch (Exception e) {

                }
            }
        });
    }

    //Системная кнопка "Назад" - начало
    @Override
    public void onBackPressed(){
        try {
            Intent intent = new Intent(GameLevels.this, MainActivity.class); //есть намерение перейти с Gamelevels в окно MainActivity
            startActivity(intent); finish(); //запуск процедуры перехода и команда finish закрывает текущее окно
        }catch (Exception e){
        }
    }
    //Системная кнопка "Назад" - конец
}