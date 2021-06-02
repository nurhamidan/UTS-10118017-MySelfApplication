package com.nurhamidan.myselfapplication.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/*
    Tanggal Pengerjaan: 19 Mei 2021
    Nim: 10118017
    Nama: Agung Nurhamidan
    Kelas: IF-1
 */
public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}