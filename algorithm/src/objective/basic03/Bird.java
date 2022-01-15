package objective.basic03;

public class Bird {
	
	private String wing;
	
	protected String beak;

	public String getWing() {
		return wing;
	}

	public void setWing(String wing) {
		this.wing = wing;
	}

	public String getBeak() {
		return beak;
	}

	public void setBeak(String beak) {
		this.beak = beak;
	}

	public Bird(String wing, String beak) {
		this.wing = wing;
		this.beak = beak;
	}
	
}
