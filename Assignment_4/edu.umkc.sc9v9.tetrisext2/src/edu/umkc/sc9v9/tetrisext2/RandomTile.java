package edu.umkc.sc9v9.tetrisext2;

import edu.umkc.sc9v9.tetris.IRandomTile;
import java.util.Random;

public class RandomTile implements IRandomTile {

	/*public int keycode;
	public KeyEvnt() {
		// TODO Auto-generated constructor stub
	}
	public void keyPressed(KeyEvent e) {
								
				keycode = e.getKeyCode(); 
	}
	public void keyReleased(KeyEvent e) {
		keycode = e.getKeyCode();
	}
	public int getKeyCode() {
		return keycode;
	}
*/
	private Random random;
	public Random getRandom() {
		System.out.println("From Second Extension");
		random = new Random();
		return random;
	}
	
}

