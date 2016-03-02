package edu.umkc.sc9v9.tetris;

public interface ITetris {
	void startGame();
	void updateGame();
	void renderGame();
	void resetGame();
	void spawnPiece();
	void rotatePiece(int newRotation);	

}
