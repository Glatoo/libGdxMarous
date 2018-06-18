package com.glatoo.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class Renderer {
    private OrthographicCameraClass cam;
    private SpriteBatch batch;
    private OrthogonalTiledMapRenderer renderer;
    private TiledMap map;
    private MyInputProcessor mouse;
    private InputListener input;

    public void create(){
        batch = new SpriteBatch();
        map = new TmxMapLoader().load("tileMap.tmx");
        renderer = new OrthogonalTiledMapRenderer(map,1/8f);
        mouse = new MyInputProcessor();
        Gdx.input.setInputProcessor(mouse);
        cam = new OrthographicCameraClass();
        cam.create();
        input= new InputListener();

    }
    public void render(){
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        cam.render(batch);
        cam.handleInput(mouse);

        batch.begin();
        Texture tilesImage = new Texture(Gdx.files.internal("tile.png"));
        TextureRegion[][] splitTiles = TextureRegion.split(tilesImage, 8, 8);
        batch.draw(splitTiles[0][0],50,50);
        batch.draw(splitTiles[1][1],0,0);
        batch.end();

    }
    public void resize(int width, int height){
        cam.resize(width, height);

    }
    public void dispose(){


    }
}
