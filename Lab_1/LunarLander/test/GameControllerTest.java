import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GameControllerTest {
	
	private GameController gc;

	@Before
	public void setUp() throws Exception {
		gc = new GameController();
	}

	@After
	public void tearDown() throws Exception {
		gc = null;
	}

	@Test
	public void testGameController() {
		assertNotNull(gc.getSpaceCraft());
		//fail("Not yet implemented");
	}

	@Test
	public void testCheckGameResult() {
		gc.getSpaceCraft().setAltitude(10);
	 	 assertEquals(0,gc.checkGameResult());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testRun() throws Exception {
		gc.getSpaceCraft().setAltitude(1000);
		gc.getSpaceCraft().setFuel(45);
		gc.getSpaceCraft().setVelocity(1000);
		gc.run();
		//gc.getSpaceCraft().calcNewValues();
		assertTrue(1010 < gc.getSpaceCraft().getVelocity());
	}

}
