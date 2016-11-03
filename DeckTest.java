import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest {

  private Deck deck;

  @Before
  public void before() {
    this.deck = new Deck();
  }

  @Test
  public void hasAllCards() {
    for ( Suit suit : Suit.values() ) {
      for ( Rank rank : Rank.values() ) {
        Card card = new Card( suit, rank );
        assertEquals( true, deck.hasCard( card ) );
      }
    }
  }

  @Test
  public void dealtCardRemoved(){
    Card card = this.deck.dealCard();
    assertEquals(false, this.deck.hasCard(card));
  }

}
