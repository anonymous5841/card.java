public class Main {

	public static void main(String[] args) {

//        Cards c = new Cards("ace", "diamonds");
//
		Deck d = new Deck();
//
//        System.out.println(d);
//
		d.Shuffle();
//
//        System.out.println(d);

		Game G = new Game(d);

		G.deal();

		System.out.println(G);

	}
}