package com.example.android.travelapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListInformationCreator.Init(MainActivity.this);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TourAppPagerAdapter adapter = new TourAppPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
