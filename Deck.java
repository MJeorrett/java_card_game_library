import java.util.*;

public class Deck extends Hand {

  public Deck() {

    super();

    for ( Suit suit : Suit.values() ) {
      for ( Rank rank : Rank.values() ) {
        Card card = new Card( suit, rank );
        this.addCard(card);
      }
    }
  }

  public void shuffle() {
    Collections.shuffle( cards );
  }

  public Card dealCard(){
    Card card = cards.remove( 0 );
    return card;
  }

}
