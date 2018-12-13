package homeworks;

public enum FirstOutputVoltage {
	OFF("0"), ON("12");
	private String value;

	FirstOutputVoltage(String value) {
		this.value = value;
	}

	public int getValue() {
		return Integer.parseInt(value);
	}

}
