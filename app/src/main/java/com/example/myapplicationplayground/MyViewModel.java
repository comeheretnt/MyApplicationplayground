package com.example.myapplicationplayground;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> numbers;

    public LiveData<Integer> getNumbers() {
        if(numbers == null) {
            numbers =  new MutableLiveData<>();
            numbers.setValue(0);
        }
        return numbers;
    }

    public void increaseNumber() {
        numbers.setValue(numbers.getValue() + 1);
    }

    public void decreaseNumber() {
        numbers.setValue(numbers.getValue() - 1);
    }
}
