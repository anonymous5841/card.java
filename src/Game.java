import java.util.Arrays;

public class Game {

	int ppc;

	Deck d;

	int counter = 52;

	Cards hand[][]  = new Cards[4][13];


	public Game(Deck deck) {
		this.d = deck;
	}

	public void deal(){

		ppc = 52/4;

		for (int i = 0; i < ppc; i++) {
			for (int j = 0; j < 4 ; j++){
				hand[j][i] = d.c[--counter];
			}
		}
	}

	@Override
	public String toString(){

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < 13; i++) {
			s.append(hand[0][i] + "\n" );
		}
		return s.toString();
	}
}

