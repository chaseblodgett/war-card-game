// Author: Chase Blodgett

public class BiggestCardAI extends AI{

// This child class of AI returns the largest possible playable card from a hand
@Override
  public Card getPlay(Hand hand, CardPile cardPile){
    Card biggestCard = null;
    for(int i = 0;i < hand.getSize();i++){
      if(biggestCard == null && cardPile.canPlay(hand.get(i))){
        biggestCard = hand.get(i);
      }else if(cardPile.canPlay(hand.get(i)) && hand.get(i).getRankNum()>biggestCard.getRankNum()){
        biggestCard = hand.get(i);
      }
    }
    return biggestCard;
  }

@Override
  public String toString(){
    return "Biggest Card AI";
  }
}
