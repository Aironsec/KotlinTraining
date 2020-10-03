package com.example.kotlinenter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private final MutableLiveData<StateGui> stateGui = new MutableLiveData<>();

    public void setStateGui(StateGui stateGui) {
        this.stateGui.setValue(stateGui);
    }

    public LiveData<StateGui> getStateGui() {
        return stateGui;
    }

    public void buttonClick(String text) {
        StateGui stateGui = new StateGui();
        stateGui.setText(text);
        stateGui.setButton(false);
        setStateGui(stateGui.getState());
    }
}
