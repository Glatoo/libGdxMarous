package com.glatoo.game;

import com.badlogic.gdx.InputAdapter;

public class MyInputProcessor extends InputAdapter {

    private int amount = 0;
    public int getScrollValue(){return this.amount;}
    public void setScrollValue(int amount){this.amount = amount;}

    public boolean scrolled (int amount) {
        setScrollValue(amount);
        return false;
    }

}
