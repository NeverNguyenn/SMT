package edu.umkc.sc9v9.tetris;

public interface IClock {
	public void setCyclesPerSecond(float cyclesPerSecond);
	public void reset();
	public void update();
	public void setPaused(boolean paused);
	public boolean hasElapsedCycle();
	public boolean peekElapsedCycle();

}
