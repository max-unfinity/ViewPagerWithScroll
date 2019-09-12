package com.example.myapplication;

import android.graphics.Point;
import android.os.Bundle;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewGroup scrollView = findViewById(R.id.top_scroll);

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.addOnPageChangeListener(new ScrollListener(scrollView));
        viewPager.setAdapter(new MyAdapter(getApplicationContext(), 3));

        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);

        ((ConstraintLayout) findViewById(R.id.top_container)).setMinWidth(size.x + 400);
        ((TabLayout) findViewById(R.id.sliding_tabs)).setupWithViewPager(viewPager);
    }
}

class ScrollListener implements ViewPager.OnPageChangeListener {
    private ViewGroup scrollView;

    ScrollListener(ViewGroup scrollView) {
        this.scrollView = scrollView;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        scrollView.setScrollX(scrollView.getWidth() * position + positionOffsetPixels);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}