public class Runner{
  public static void main(String[] args){
    Deck deck = new Deck();
    deck.shuffle();
    for( int i = 1; i <= 52; i++ ) {
      System.out.println( deck.dealCard() );
    }
  }
}
