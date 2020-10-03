package com.example.kotlinenter;

public class StateGui {
    private boolean button = true;
    private String text = "";

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
}
