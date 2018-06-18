package com.glatoo.game;

import com.badlogic.gdx.ApplicationAdapter;



public class Main extends ApplicationAdapter {
	private Renderer renderManager;

	@Override
		public void create(){
		renderManager = new Renderer();
		renderManager.create();


		}

        @Override
        public void resize(int width, int height){
		    renderManager.resize(width, height);


        }
		@Override
		public void render() {
			renderManager.render();


		}

		@Override
		public void dispose() {
			renderManager.dispose();
		}
}
