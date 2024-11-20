// Author: Chase Blodgett

public class SmallestCardAI extends AI{

// This child class of AI returns the smallest possible playable card from a hand
@Override
  public Card getPlay(Hand hand, CardPile cardPile){
    Card smallestCard = null;
    for(int i = 0;i < hand.getSize();i++){
      if(smallestCard == null && cardPile.canPlay(hand.get(i))){
        smallestCard = hand.get(i);
      }else if(cardPile.canPlay(hand.get(i)) && hand.get(i).getRankNum() < smallestCard.getRankNum()){
        smallestCard = hand.get(i);
      }
    }
    return smallestCard;
  }

@Override
  public String toString(){
    return "Smallest Card AI";
  }
}
