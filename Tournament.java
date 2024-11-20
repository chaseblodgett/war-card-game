// Author: Chase Blodgett

public class Tournament{

/* This program simulates an UnoWar tournament between 3 AIs
* Each AI plays another and itself 1000 times
* The win percentage for each AI is displayed after
*/
  public static void main(String [] args){

    AI randomCard = new AI();
    AI smallestCard = new SmallestCardAI();
    AI biggestCard = new BiggestCardAI();

    UnoWarMatch randVsSmall = new UnoWarMatch(randomCard,smallestCard);
    UnoWarMatch randVsBig = new UnoWarMatch(randomCard,biggestCard);
    UnoWarMatch randVsRand = new UnoWarMatch(randomCard,randomCard);
    UnoWarMatch smallVsRand = new UnoWarMatch(smallestCard,randomCard);
    UnoWarMatch smallVsBig = new UnoWarMatch(smallestCard, biggestCard);
    UnoWarMatch smallVsSmall = new UnoWarMatch(smallestCard,smallestCard);
    UnoWarMatch bigVsSmall = new UnoWarMatch(biggestCard,smallestCard);
    UnoWarMatch bigVsBig = new UnoWarMatch(biggestCard,biggestCard);
    UnoWarMatch bigVsRand = new UnoWarMatch(biggestCard,randomCard);

    System.out.println(randomCard + " vs. "+ randomCard + " winRate: " + randVsRand.winRate(1000));
    System.out.println(randomCard + " vs. "+ smallestCard + " winRate: " + randVsSmall.winRate(1000));
    System.out.println(randomCard + " vs. "+ biggestCard + " winRate: " + randVsBig.winRate(1000));
    System.out.println(smallestCard + " vs. "+ randomCard + " winRate: " + smallVsRand.winRate(1000));
    System.out.println(smallestCard + " vs. "+ smallestCard + " winRate: " + smallVsSmall.winRate(1000));
    System.out.println(smallestCard + " vs. "+ biggestCard + " winRate: " + smallVsBig.winRate(1000));
    System.out.println(biggestCard + " vs. "+ randomCard + " winRate: " + bigVsRand.winRate(1000));
    System.out.println(biggestCard + " vs. "+ smallestCard + " winRate: " + bigVsSmall.winRate(1000));
    System.out.println(biggestCard + " vs. "+ biggestCard + " winRate: " + bigVsBig.winRate(1000));
  }
}
