package com.nurhamidan.myselfapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class WalkthroughActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        viewPager = (ViewPager) findViewById(R.id.view_pager_walkthrough);
        addTabs(viewPager);

    }

    public void showMain(View v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new WalkthroughFirstFragment());
        adapter.addFrag(new WalkthroughSecondFragment());
        adapter.addFrag(new WalkthroughThirdFragment());
        viewPager.setAdapter(adapter);
    }
}