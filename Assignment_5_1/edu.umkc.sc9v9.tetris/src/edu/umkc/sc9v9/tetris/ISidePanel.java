package edu.umkc.sc9v9.tetris;

import java.awt.Graphics;
import edu.umkc.sc9v9.tetris.tetris.TileType;

public interface ISidePanel {
	public void paintComponent(Graphics g);
	public void drawTile(TileType type, int x, int y, Graphics g);

}
