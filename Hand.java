// Author: Chase Blodgett

public class Hand{

// Instance variables of hand class
  private int handSize;
  private Card [] playerHand;
  private Deck playingDeck;

// Constructor to create a new hand of cards of a certain size
  public Hand(Deck deck, int size){
    playingDeck = deck;
    playerHand = new Card[size];
    for(int i = 0;i < size;i++){
      playerHand[i] = playingDeck.draw();
    }
    handSize = size;
  }

// Function to return the amount of cards in a hand
  public int getSize(){
    return handSize;
  }

/* Function returns a card by index in the hand
* Returns index 0 if index is out of range
*/
  public Card get(int i){
    if(i >= handSize || i < 0){
      System.out.println("Invalid hand index!");
      return playerHand[0];
    }else{
      return playerHand[i];
    }
  }

/* This function removes a card from the hand and
* draws a new card from the deck to place in the hand
*/
  public boolean remove(Card card){
    for(int i = 0; i < handSize;i++){
      if (card.equals(playerHand[i])){
        playerHand[i] = playingDeck.draw();
        return true;
      }
    }
    return false;
  }
}
