import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Card> player1Hand = new ArrayList<Card>();
		ArrayList<Card> player2Hand = new ArrayList<Card>();
		
		Deck playingDeck = new Deck();
		
		playingDeck.makeDeck();
		
		playingDeck.shuffle();
		
		Player playerOne = new Player("Jack", player1Hand, 0);
		Player playerTwo = new Player("Jill", player2Hand, 0);
		
		
		for (int i = 0; i < 26; i ++) {
			player1Hand.add(playingDeck.getCard(i));
			}
		for (int i = 26; i < 52; i ++) {
			player2Hand.add(playingDeck.getCard(i));
		}

		 for (int i = 0; i < 26; i ++) {
			int one = playerOne.flip().getValue();
			int two = playerTwo.flip().getValue();
			
			if (one > two) {
				System.out.println(playerOne.getName() + " wins with " + playerOne.flip().toString() + " vs "
						+ playerTwo.flip().toString());
				playerOne.incrementScore();
				
			} else if (two > one){
				System.out.println(playerTwo.getName() + " wins with " + playerTwo.flip().toString() + " vs "
						+ playerOne.flip().toString());
				playerTwo.incrementScore();
				
			} else {
				System.out.println("It's a draw: " + playerOne.flip().toString() + " and " + playerTwo.flip().toString());
			}
			playerOne.removeCard();
			playerTwo.removeCard();
			System.out.println(playerOne.getName() + ": " + playerOne.getScore());
			System.out.println(playerTwo.getName() + ": " + playerTwo.getScore());
		}
		 if (playerOne.getScore() > playerTwo.getScore() ) {
			 System.out.println(playerOne.getName() + " WINS THE GAME!!! - " + playerOne.getScore() + " to " + playerTwo.getScore() );
		 } else if (playerTwo.getScore() > playerOne.getScore() ){
			 System.out.println(playerTwo.getName() + " WINS THE GAME!!! - " + playerTwo.getScore() + " to " + playerOne.getScore());
		 } else {
			 System.out.println("THE GAME IS A DRAW: " + playerOne.getName() + " " + playerOne.getScore() +", " + 
			 playerTwo.getName() + " " + playerTwo.getScore());
		 }
	
			}
			


		
	}


