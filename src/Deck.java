import java.util.Arrays;
import java.util.Random;

public class Deck {

	int counter = 0;

	Cards c[] = new Cards[52];

	String ranks[] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King"};

	String suit[] = {"Diamond", "Hearts", "Spades", "Clubs"};

	public Deck() {


		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				c[counter++] = new Cards( suit[i] , ranks[j]);
			}
		}
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < 52; i++) {
			s.append(c[i] + "\n");
		}
		return s.toString();
	}

	public void Shuffle(){

		Random random = new Random();
		for (int i = 0; i < 52; i++) {

			int r = random.nextInt(52);

			Cards temp = c[i];
			c[i] = c[r];
			c[r] = temp;

		}
	}
}