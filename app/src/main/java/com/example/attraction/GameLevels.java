package com.example.attraction;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
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
        setContentView(R.layout.gamelavels);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        recyclerView = findViewById(R.id.recycelrView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));
        arrayList.add(new Model(R.drawable.ratusha, "Могилёвская ратуша"));

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