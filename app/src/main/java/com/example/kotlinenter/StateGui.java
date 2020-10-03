package com.example.kotlinenter;

public class StateGui implements IStateGui {
    private boolean button;
    private String text;

    public boolean isButton() {
        return button;
    }

    public void setButton(boolean button) {
        this.button = button;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public StateGui getState() {
        return this;
    }
}
