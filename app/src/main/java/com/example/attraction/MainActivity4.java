package com.example.attraction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        List<SliderItems> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItems(R.drawable.ratusha));
        sliderItems.add(new SliderItems(R.drawable.object_one));
        sliderItems.add(new SliderItems(R.drawable.object_two));
        sliderItems.add(new SliderItems(R.drawable.object_three));
        sliderItems.add(new SliderItems(R.drawable.object_four));
        sliderItems.add(new SliderItems(R.drawable.object_five));
        sliderItems.add(new SliderItems(R.drawable.object_six));
        sliderItems.add(new SliderItems(R.drawable.object_seven));
        sliderItems.add(new SliderItems(R.drawable.object_eight));
        sliderItems.add(new SliderItems(R.drawable.object_nine));
        sliderItems.add(new SliderItems(R.drawable.object_ten));
        sliderItems.add(new SliderItems(R.drawable.bobr));
        sliderItems.add(new SliderItems(R.drawable.chas));
        sliderItems.add(new SliderItems(R.drawable.kost));
        sliderItems.add(new SliderItems(R.drawable.krep));
        sliderItems.add(new SliderItems(R.drawable.mon));
        sliderItems.add(new SliderItems(R.drawable.pol));
        sliderItems.add(new SliderItems(R.drawable.smotr));
        sliderItems.add(new SliderItems(R.drawable.zvezd));
        sliderItems.add(new SliderItems(R.drawable.bober));


        viewPager2.setAdapter(new SliderAdapter(sliderItems,viewPager2));

        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        viewPager2.setPageTransformer(compositePageTransformer);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 10000); // slide duration 2 seconds
            }
        });
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 10000);
    }
}