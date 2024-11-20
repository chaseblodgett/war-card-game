// Author: Chase Blodgett

import java.util.Random;

public class Deck{

// Attributes of Deck class: array of cards and cards left in the deck
  private Card [] cardDeck;
  private int cardsLeft;

/* Constructor sets the array to size 52 and inserts Cards
* After setting the array the cards are shuffled
*/
  public Deck(){
    cardDeck = new Card[52];
    int counter = 0;
    for(int i = 1;i <= 13;i++){
      for(int j = 1;j <= 4;j++){
        cardDeck[counter] = new Card(i,j);
        counter++;
      }
    }
    this.Shuffle();
    cardsLeft = 52;
  }
// This function shuffles the cards in random order
  public void Shuffle(){
    int i = 0;
    Random rand = new Random();
    for(int j = cardDeck.length - 1; j > 0; j--){
      i = rand.nextInt(j+1);
      Card tmp = cardDeck[i];
      cardDeck[i] = cardDeck[j];
      cardDeck[j] = tmp;
    }
  }
/* This function returns a card from end of the array, until no more cards remain
* The deck is shuffled when there are no more cards remaining
*/
  public Card draw(){
    if(cardsLeft == 0){
      this.Shuffle();
      cardsLeft = 51;
      return cardDeck[51];
    }else{
      Card newCard = cardDeck[cardsLeft-1];
      cardsLeft--;
      return newCard;
    }
  }
// Function to return the number of cards remaining in the deck
  public int cardsRemaining(){
    return cardsLeft;
  }
// Function to check if a deck is empty
  public boolean isEmpty(){
    if(cardsLeft == 0){
      return true;
    }
    return false;
  }
}
