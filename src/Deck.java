import java.util.ArrayList;
import java.util.Random;

public class Deck {

	public ArrayList<Card> deck;
	
	public Deck() {
		this.deck = new ArrayList<Card>();
		

	}
	
	public void makeDeck() {
		this.deck.add(new Card("Two of Clubs", 2));
		this.deck.add(new Card("Three of Clubs", 3));
		this.deck.add(new Card("Four of Clubs", 4));
		this.deck.add(new Card("Five of Clubs", 5));
		this.deck.add(new Card("Six of Clubs", 6));
		this.deck.add(new Card("Seven of Clubs", 7));
		this.deck.add(new Card("Eight of Clubs", 8));
		this.deck.add(new Card("Nine of Clubs", 9));
		this.deck.add(new Card("Ten of Clubs", 10));
		this.deck.add(new Card("Jack of Clubs", 11));
		this.deck.add(new Card("Queen of Clubs", 12));
		this.deck.add(new Card("King of Clubs", 13));
		this.deck.add(new Card("Ace of Clubs", 14));
		this.deck.add(new Card("Two of Diamonds", 2));
		this.deck.add(new Card("Three of Diamonds", 3));
		this.deck.add(new Card("Four of Diamonds", 4));
		this.deck.add(new Card("Five of Diamonds", 5));
		this.deck.add(new Card("Six of Diamonds", 6));
		this.deck.add(new Card("Seven of Diamonds", 7));
		this.deck.add(new Card("Eight of Diamonds", 8));
		this.deck.add(new Card("Nine of Diamonds", 9));
		this.deck.add(new Card("Ten of Diamonds", 10));
		this.deck.add(new Card("Jack of Diamonds", 11));
		this.deck.add(new Card("Queen of Diamonds", 12));
		this.deck.add(new Card("King of Diamonds", 13));
		this.deck.add(new Card("Ace of Diamonds", 14));
		this.deck.add(new Card("Two of Hearts", 2));
		this.deck.add(new Card("Three of Hearts", 3));
		this.deck.add(new Card("Four of Hearts", 4));
		this.deck.add(new Card("Five of Hearts", 5));
		this.deck.add(new Card("Six of Hearts", 6));
		this.deck.add(new Card("Seven of Hearts", 7));
		this.deck.add(new Card("Eight of Hearts", 8));
		this.deck.add(new Card("Nine of Hearts", 9));
		this.deck.add(new Card("Ten of Hearts", 10));
		this.deck.add(new Card("Jack of Hearts", 11));
		this.deck.add(new Card("Queen of Hearts", 12));
		this.deck.add(new Card("King of Hearts", 13));
		this.deck.add(new Card("Ace of Hearts", 14));
		this.deck.add(new Card("Two of Spades", 2));
		this.deck.add(new Card("Three of Spades", 3));
		this.deck.add(new Card("Four of Spades", 4));
		this.deck.add(new Card("Five of Spades", 5));
		this.deck.add(new Card("Six of Spades", 6));
		this.deck.add(new Card("Seven of Spades", 7));
		this.deck.add(new Card("Eight of Spades", 8));
		this.deck.add(new Card("Nine of Spades", 9));
		this.deck.add(new Card("Ten of Spades", 10));
		this.deck.add(new Card("Jack of Spades", 11));
		this.deck.add(new Card("Queen of Spades", 12));
		this.deck.add(new Card("King of Spades", 13));
		this.deck.add(new Card("Ace of Spades", 14));
	}

	public void shuffle() {
		ArrayList<Card> temp = new ArrayList<Card>();
		Random r = new Random();
		int randomCard = 0;
		int originalSize = this.deck.size();
		for (int i = 0; i < originalSize; i ++) {
			randomCard = r.nextInt((this.deck.size() - 1 - 0) + 1) + 0;
			temp.add(this.deck.get(randomCard));
			this.deck.remove(randomCard);
		}
		this.deck = temp;
	}
	@Override
	public String toString() {
		int i = 0;
		String listCards = "";
		for (Card card : this.deck) {
			listCards += "\n" + (i) + "-" + card.toString();
			i++;
		}
		return listCards;
	}
	public void removeCard(int i) {
		this.deck.remove(i);
	}
	
	public Card getCard(int i) {
		return this.deck.get(i);
	}
	
	public void addCard(Card addCard) {
		this.deck.add(addCard);
	}
	

	public Card draw() {
		Card drawCard = this.deck.get(0);
		this.deck.remove(0);
		return drawCard;

		}


	
}

