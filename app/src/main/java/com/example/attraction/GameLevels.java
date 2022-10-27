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

        arrayList.add(new Model(R.drawable.object_one, "Могилёвская ратуша", "Могилевская ратуша возводилась в 1679–1681 гг. местными мастерами Феской и Афанасом с участием «дойлидов» Игнатия, Недосеки, Васьки, Андрея и Гришки.\n" +
                "\n" +
                "Выполненная в стиле барокко, ратуша считалась лучшим произведением гражданской архитектуры Беларуси XVII века. Высота ее восьмигранной башни со шпилем составляла 46 метров. В 1780 году с этой башни осматривали город российская императрица Екатерина II и австрийский император Иосиф II, встретившиеся в Могилеве, чтобы решить судьбу Речи Посполитой.\n" +
                "\n" +
                "После реформы 1870 года в ратуше разместились отдельные службы городской управы. Во время нахождения в Могилеве Ставки Верховного Главнокомандующего здесь находилась военная радиостанция. Позднее башня ратуши использовалась как пожарная вышка города.\n" +
                "\n" +
                "В 1957-м ратушу, пострадавшую в годы Великой Отечественной войны, взорвали, но в начале ХХI века ее удалось восстановить на прежнем месте по старым чертежам. Строительство было завершено в 2008 году. Теперь в ратуше находится Музей истории Могилева. \n" +
                "\n" +
                "Адрес: г. Могилёв, улица Ленинская, 1А", "https://www.youtube.com/watch?v=s6Pd5j0CnQo&t=95s&ab_channel=%D0%92%D0%B7%D0%B3%D0%BB%D1%8F%D0%B4"));
        arrayList.add(new Model(R.drawable.object_two, "Памятник Бобру", "информация2", "https://www.youtube.com/watch?v=KXkUKRP6Fi0&ab_channel=%D0%91%D0%95%D0%9B%D0%90%D0%A0%D0%A3%D0%A1%D0%AC4%D0%9C%D0%BE%D0%B3%D0%B8%D0%BB%D0%B5%D0%B2"));
        arrayList.add(new Model(R.drawable.object_three, "Бобруйская крепость", "информация3", "https://www.youtube.com/watch?v=e56ZqcRIEuQ&t=1s&ab_channel=%D0%A1%D0%B0%D0%BD%D0%B0%D1%82%D0%BE%D1%80%D0%B8%D0%B8%D0%91%D0%B5%D0%BB%D0%B0%D1%80%D1%83%D1%81%D0%B8"));
        arrayList.add(new Model(R.drawable.object_four, "Костел Святого Станислава", "информация4", "https://www.youtube.com/watch?v=7ocQd6lE0nw"));
        arrayList.add(new Model(R.drawable.object_five, "Буйничское поле", "информация5", "https://www.youtube.com/watch?v=2QbK1VTO63o"));
        arrayList.add(new Model(R.drawable.object_six, "Cвято-Никольский женский монастырь", "информация6", "https://www.youtube.com/watch?v=L18ymMZGHgs"));
        arrayList.add(new Model(R.drawable.object_seven, "Часовня в деревне Лесная", "информация7", "https://www.youtube.com/watch?v=Pr22T1QmHN4"));
        arrayList.add(new Model(R.drawable.object_eight, "Площадь Звезд", "информация8", "https://www.youtube.com/watch?v=su3mUQJAZko"));
        arrayList.add(new Model(R.drawable.object_nine, "Памятник-танк генералу Б.С.Бахарова", "информация9", "https://www.youtube.com/watch?v=GOZ98sK3ZmY"));
        arrayList.add(new Model(R.drawable.object_ten, "Скульптура Станционный смотритель", "информация10", "https://www.youtube.com/shorts/-Oi6wpokPT8"));

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