import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GameControllerTest2 {
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
	}

	@Test
	public void testGetSpaceCraft() {
		assertNotNull(gc.getSpaceCraft());
		System.out.println("Space craft is retuned");
	}

	@Test
	public void testRun() {
		int burnrate = 0;
		if(burnrate<0)
		{
			System.out.println("User intend to quit the game");
			fail("Exception should be thrown");
	}
	}
	@Test
	public void checkvalue()
	{
	SpaceCraft sc = new SpaceCraft();
	sc.init();
	assertEquals(1000, sc.getAltitude());
	}

	@Test
	public void testCheckGameResult() {
		gc.getSpaceCraft().setAltitude(10);
		assertEquals(0,gc.checkGameResult());
	}

	/**@Test
	public void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public void testFinalize() {
		fail("Not yet implemented");
	}**/

}
