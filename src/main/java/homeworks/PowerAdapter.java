package homeworks;

public class PowerAdapter {
	private boolean status;
	private short inputVoltage;
	private FirstOutputVoltage output1 = FirstOutputVoltage.OFF;
	private SecondOutputVoltage output2 = SecondOutputVoltage.OFF;

	public void showInfo() {

		System.out.printf("%4$s inputVoltage:%1$3d output1Voltage: %2$2d output2Voltage: %3$2d", inputVoltage,
				output1.getValue(), output2.getValue(), (status) ? "Turn On" : "Turn Off");
	}

	public String getInfo() {

		return String.format("%4$s inputVoltage: %1$d output1Voltage: %2$d output2Voltage: %3$d", inputVoltage,
				output1.getValue(), output2.getValue(), (status) ? "Turn On" : "Turn Off");

	}

	public void changeInputVoltage(short value) {
		if (value > 200 && value < 250) {
			this.status = true;
			inputVoltage = value;
			output1 = FirstOutputVoltage.ON;
			output2 = SecondOutputVoltage.ON;
		} else {
			status = false;
			inputVoltage = 0;
			output1 = FirstOutputVoltage.OFF;
			output2 = SecondOutputVoltage.OFF;

			System.out.println((value > 250) ? "Hight Voltage" : ((value < 200) ? "Low Voltage" : "Start"));
		}
	}
}
