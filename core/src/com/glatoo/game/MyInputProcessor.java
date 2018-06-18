package com.glatoo.game;

import com.badlogic.gdx.InputAdapter;

public class MyInputProcessor extends InputAdapter {
    private boolean scrollUp = false;
    private boolean scrollDown = false;


    public boolean scrolled (int amount) {
        if (amount == 1){
            return true;

        }
        return false;


    }

}
