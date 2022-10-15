
public class Card {

	private int value;
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}

	@Override
	public String toString() {
		return name + " (" + value + ")";
	}
	
	

}