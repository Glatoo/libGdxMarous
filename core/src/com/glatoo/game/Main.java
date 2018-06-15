package com.glatoo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Main extends ApplicationAdapter {
    private OrthographicCameraClass cam;
    private SpriteBatch batch;
    private Texture img;

		@Override
		public void create(){
		    cam = new OrthographicCameraClass();
		    cam.create();
		    batch = new SpriteBatch();
		    img = new Texture("tile.png");

		}

        @Override
        public void resize(int width, int height){
		    cam.resize(width, height);


        }
		@Override
		public void render() {
			Gdx.gl.glClearColor(1, 1, 1, 1);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		    cam.render();


		}

		@Override
		public void dispose() {
		    cam.dispose();
		    batch.dispose();
		    img.dispose();

		}
}
