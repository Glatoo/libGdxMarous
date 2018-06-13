package com.glatoo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private int x;
	private int y;
	private int adder;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		x = 0;
		y = 0;
		adder = 5;
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, x, y);
		batch.end();
		if (y >= 600-img.getHeight() || y < 0){adder = -adder;}
		x+=adder;
		y+=adder;
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
