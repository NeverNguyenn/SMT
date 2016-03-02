import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.psnbtech.Clock;
import org.psnbtech.Tetris;

public class TetrisTest {

	private Tetris tetris;
	@Before
	public void setUp() throws Exception {
		tetris = new Tetris();
	}

	@After
	public void tearDown() throws Exception {
		tetris = null;
	}

	@Test
	public void testUpdateGame() {
		tetris.random = new Random();
		tetris.isNewGame = true;
		tetris.gameSpeed = 1.0f;
		tetris.logicTimer = new Clock(tetris.gameSpeed);
		tetris.logicTimer.setPaused(true);
		int cleared = 0;
		while(true) {
			//Get the time that the frame started.
			long start = System.nanoTime();
			
			//Update the logic timer.
			tetris.logicTimer.update();
			
			/*
			 * If a cycle has elapsed on the timer, we can update the game and
			 * move our current piece down.
			 */
			if(tetris.logicTimer.hasElapsedCycle()) {
				cleared = tetris.updateGame();
				//At any time, the no. of rows cleared should be <=4 
				assertTrue("Cleared rows cannot be more than 4 at once", cleared<=4);
			}
			if(tetris.dropCooldown > 0) {
				tetris.dropCooldown--;
			}
			
			//Display the window to the user.
			tetris.renderGame();
			
			/*
			 * Sleep to cap the framerate.
			 */
			long delta = (System.nanoTime() - start) / 1000000L;
			if(delta < Tetris.FRAME_TIME) {
				try {
					Thread.sleep(Tetris.FRAME_TIME - delta);
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}
}
