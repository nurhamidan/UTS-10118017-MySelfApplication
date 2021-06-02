package com.nurhamidan.myselfapplication.ui.dailyactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.nurhamidan.myselfapplication.InterestFragment;
import com.nurhamidan.myselfapplication.ProfileFragment;
import com.nurhamidan.myselfapplication.R;
import com.nurhamidan.myselfapplication.ViewPagerAdapter;

/*
    Tanggal Pengerjaan: 19 Mei 2021
    Nim: 10118017
    Nama: Agung Nurhamidan
    Kelas: IF-1
 */
public class DailyActivityFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily_activity, container, false);
        return root;
    }
}