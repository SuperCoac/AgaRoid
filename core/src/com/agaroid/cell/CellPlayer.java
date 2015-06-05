package com.agaroid.cell;


import com.agaroid.Cell;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Etienne on 05/06/2015.
 */
public class CellPlayer extends Cell {
    private String username;
    BitmapFont font;

    public CellPlayer(SpriteBatch batch, ShapeRenderer shapeRenderer, BitmapFont font,
                      String username, int posX, int posY, int mass) {
        super(batch,shapeRenderer,posX,posY,mass);
        this.username = username;
        this.glyphLayout = new GlyphLayout();
        this.glyphLayout.setText(font, username);
        this.font = font ;
    }
    public void batchDraw() {
        font.draw(batch, username, posX - glyphLayout.width /2, posY + glyphLayout.height /2);
    }
	public String getUsername() {
		return this.username;
	}
}
