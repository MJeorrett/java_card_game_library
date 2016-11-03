public class Card {
  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public boolean equals(Card otherCard){

    if ( this.suit == otherCard.getSuit() && this.rank == otherCard.getRank() ) {
      return true;
    }

    return false;

    // Suit otherCardsSuit = otherCard.getSuit();
    // boolean suitsMatch = this.suit == otherCardsSuit;
    // Rank otherCardsRank = otherCard.getRank();
    // boolean ranksMatch = this.rank == otherCardsRank;
    //
    // if(suitsMatch && ranksMatch){
    //   return true;
    // } else {
    //   return false;
    // }
  }

  public String toString() {
    return this.rank.getTitle() + " of " + this.suit.getTitle();
  }


}
