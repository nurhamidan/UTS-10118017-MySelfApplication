package com.nurhamidan.myselfapplication.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/*
    Tanggal Pengerjaan: 19 Mei 2021
    Nim: 10118017
    Nama: Agung Nurhamidan
    Kelas: IF-1
 */
public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}