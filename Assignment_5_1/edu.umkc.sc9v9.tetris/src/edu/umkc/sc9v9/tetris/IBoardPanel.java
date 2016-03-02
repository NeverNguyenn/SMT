package edu.umkc.sc9v9.tetris;

import java.awt.Color;
import java.awt.Graphics;

public interface IBoardPanel {
	public void clear();
	public int checkLines();
	public void paintComponent(Graphics g);
	void drawTile(Color base, Color light, Color dark, int x, int y, Graphics g);

}
