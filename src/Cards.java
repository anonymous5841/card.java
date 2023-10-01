public class Cards {

	final String rank;

	final String suit;

	public Cards(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public String getSuit() {
		return suit;
	}

	@Override
	public String toString() {
		return String.format("%s of %s", rank , suit);
	}
}
