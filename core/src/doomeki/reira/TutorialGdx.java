package doomeki.reira;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TutorialGdx extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private BitmapFont font;
	private int height;
	private Texture mirio;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		font = new BitmapFont();
		height = Gdx.graphics.getHeight(); //obtiene la altura de la ventana
		mirio = new Texture("mirio.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.2f, 0.2f, 0.2f, 1);
		batch.begin();
		font.draw(batch,"Hola mundo",10,height-10);
		batch.draw(img, 0, 0);
		batch.draw(mirio, 300,0, 150,350);

		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		mirio.dispose();
	}
}
