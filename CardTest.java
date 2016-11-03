import static org.junit.Assert.*;
import org.junit.*;

public class CardTest {

  private Card card;
  private Hand hand;

  @Before
  public void before() {
    this.card = new Card( Suit.HEARTS, Rank.TEN );
    this.hand = new Hand();
  }

  @Test
  public void cardHasSuit() {
    assertEquals( Suit.HEARTS, this.card.getSuit() );
  }

  @Test
  public void cardHasRank() {
    assertEquals( Rank.TEN, this.card.getRank() );
  }

  @Test
  public void canAddCardToHand(){
    this.hand.addCard(this.card);
    assertEquals(true, this.hand.hasCard(this.card));
  }
}
