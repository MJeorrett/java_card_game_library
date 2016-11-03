import java.util.*;

public class Hand {
  
  protected ArrayList<Card> cards;

  public Hand(){
    this.cards = new ArrayList<Card>();
  }

  public void addCard(Card card){
    this.cards.add(card);
  }

  public boolean hasCard(Card card){
    for(Card aCard : cards){
    if (aCard.equals(card)) return true;
    }

    return false;
  }

  public ArrayList<Card> getCards() {
    return cards;
  }
}
