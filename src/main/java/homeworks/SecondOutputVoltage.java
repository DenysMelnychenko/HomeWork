package homeworks;

public enum SecondOutputVoltage {
	OFF("0"), ON("5");
	private String value;

	SecondOutputVoltage(String value) {
		this.value = value;
	}

	public int getValue() {
		return Integer.parseInt(value);
	}

}
