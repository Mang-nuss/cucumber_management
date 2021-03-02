package linkedinlearning.cucumber;

public class Ability {

	private String name;
	private int value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Ability(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	
}
