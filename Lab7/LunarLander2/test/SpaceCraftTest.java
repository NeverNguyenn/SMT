import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SpaceCraftTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInit() {
		int burnrate = 0;
		if(burnrate>0){
		System.out.println("Initial burn rate is not set to default i.e zero");
		fail("Exception should be thrown");
		}
		
	}

	/**@Test
	public void testGetBurnRate() {
		fail("Not yet implemented");
	}**/

	/**@Test
	public void testSetBurnRate() {
		int burnrate = 0;
		if(burnrate>=0){
		System.out.println("Initial burn rate is not set to default i.e zero");
		fail("Exception should be thrown");
		}
	}**/

	@Test
	public void testCalcNewValues() {
		SpaceCraft sc = new SpaceCraft();
		sc.init();
		assertEquals(0, sc.getBurnRate());
		sc.setBurnRate(1000);
		try {
			sc.calcNewValues();
			fail("Exception should be thrown");
			} catch (Exception e){
			;//Exception expected
			}
			sc.setBurnRate(5);
			sc.setFuel(45);
			try{
			sc.calcNewValues();
			} catch (Exception e){
			;//Ignore this time
			}
			assertEquals(40, sc.getFuel());
	}

	/**@Test
	public void testDisplayValues() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAltitude() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetAltitude() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFuel() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFuel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVelocity() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVelocity() {
		fail("Not yet implemented");
	}

	@Test
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
