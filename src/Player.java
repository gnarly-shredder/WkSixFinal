import java.util.ArrayList;

public class Player {
	
	private String name;
	private ArrayList<Card> hand;
	private int score = 0;
	
	public Player(String name, ArrayList<Card> hand, int score) {
		this.name = name;
		this.hand = hand;
		this.score = score;
	}
	public String toString() {
		return "Name: " + name + "\n" + "Hand: " + hand + "\n" + "Score: " + score;
	}
	public Card flip() {
		if (this.hand.size() > 0) {
			return this.hand.get(0);
		} else {
			return null;
		}
		
	}
	
	public void draw(Deck from) {
	hand.add(from.draw());
	}
	
	public void incrementScore() {
		this.score = this.score + 1;
	}
	
	public void removeCard() {
		this.hand.remove(0);
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return this.score;
	}


}
