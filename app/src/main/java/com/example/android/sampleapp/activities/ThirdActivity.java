package com.example.android.sampleapp.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import com.example.android.sampleapp.R;
import com.example.android.sampleapp.adapters.FragmentAdapter;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Get a reference to ViewPager
        ViewPager viewPager = findViewById(R.id.viewpager);

        // set fragment adapter to ViewPager
        viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager(), this));

        // Set TabLayout
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
