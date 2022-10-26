package com.example.attraction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

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

        arrayList.add(new Model(R.drawable.object_one, "Могилёвская ратуша", "информация1"));
        arrayList.add(new Model(R.drawable.object_two, "Памятник Бобру", "информация2"));
        arrayList.add(new Model(R.drawable.object_three, "Бобруйская крепость", "информация3"));
        arrayList.add(new Model(R.drawable.object_four, "Костел Святого Станислава", "информация4"));
        arrayList.add(new Model(R.drawable.object_five, "Буйничское поле", "информация5"));
        arrayList.add(new Model(R.drawable.object_six, "Cвято-Никольский женский монастырь", "информация6"));
        arrayList.add(new Model(R.drawable.object_seven, "Часовня в деревне Лесная", "информация7"));
        arrayList.add(new Model(R.drawable.object_eight, "Площадь Звезд", "информация8"));
        arrayList.add(new Model(R.drawable.object_nine, "Памятник-танк генералу Б.С.Бахарова", "информация9"));
        arrayList.add(new Model(R.drawable.object_ten, "Скульптура Станционный смотритель", "информация10"));

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