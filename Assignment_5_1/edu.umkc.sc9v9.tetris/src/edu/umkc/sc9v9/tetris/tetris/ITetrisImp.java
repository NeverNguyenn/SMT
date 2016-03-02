package edu.umkc.sc9v9.tetris.tetris;


import edu.umkc.sc9v9.tetris.tetris.TetrisArch;

public interface ITetrisImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (TetrisArch arch);
	public TetrisArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
	void startGame();
	void updateGame();
	void renderGame();
	void resetGame();
	void spawnPiece();
	void rotatePiece(int newRotation);
}