package homeworks;



import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PowerAdapterTest {

	private PowerAdapter pw;
	
	@Before
	public void initialize() {
		pw = new PowerAdapter();
	}

	@Test
	public void IfInputVoltageIsZeroShouldBeEqual() {
		assertEquals("Turn Off inputVoltage: 0 output1Voltage: 0 output2Voltage: 0", pw.getInfo());
	}
	
	@Test
	public void IfInputvoltageChangeTo220ThanSouldWorkFine() {
		pw.changeInputVoltage((short)220);
		assertEquals("Turn On inputVoltage: 220 output1Voltage: 12 output2Voltage: 5", pw.getInfo());
		
	}
	
	@Test
	public void IfInputvoltageChangeTo190ThanSouldTurnOff() {
		pw.changeInputVoltage((short)190);
		assertEquals("Turn Off inputVoltage: 0 output1Voltage: 0 output2Voltage: 0", pw.getInfo());
		
	}
	
	@Test
	public void IfInputvoltageChangeTo2750ThanSouldTurnOff() {
		pw.changeInputVoltage((short)2750);
		assertEquals("Turn Off inputVoltage: 0 output1Voltage: 0 output2Voltage: 0", pw.getInfo());
		
	}
}
