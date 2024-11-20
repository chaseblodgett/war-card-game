// Author: Chase Blodgett

public class UnoWarMatch{

// Variables to indicate the AI players of the match
  private AI player1;
  private AI player2;

// Constructor to set the AI's to a player
  public UnoWarMatch(AI ai1, AI ai2){
    player1 = ai1;
    player2 = ai2;
  }
/* playGame is a function that simulates one game of UnoWar.
* Each game contains 10 rounds, where each player plays a card until one cannot
*/
  public boolean playGame(){
    int player1Wins = 0;
    int player2Wins = 0;
    Deck deck = new Deck();
    Hand player1Hand = new Hand(deck,5);
    Hand player2Hand = new Hand(deck,5);
    CardPile cardPile = new CardPile(deck.draw());
    boolean roundOver = false;

    while(player1Wins < 10 && player2Wins < 10){

      if(roundOver){
        deck = new Deck();
        player1Hand = new Hand(deck,5);
        player2Hand = new Hand(deck,5);
        cardPile = new CardPile(deck.draw());
        roundOver = false;
      }

      if(player1.getPlay(player1Hand,cardPile) != null){
        Card player1Choice = player1.getPlay(player1Hand,cardPile);
        cardPile.play(player1Choice);
        player1Hand.remove(player1Choice);
      }else if(player1.getPlay(player1Hand,cardPile) == null){
        player2Wins++;
        roundOver = true;
      }

      if(player2.getPlay(player2Hand,cardPile) != null && !roundOver){
        Card player2Choice = player2.getPlay(player2Hand,cardPile);
        cardPile.play(player2Choice);
        player2Hand.remove(player2Choice);
      }else if(player2.getPlay(player2Hand,cardPile) == null && !roundOver){
        player1Wins++;
        roundOver = true;
      }
    }
    if(player1Wins == 10){
      return true;
    }else{
      return false;
    }
    }
/*  winRate is a function that simulates a game of UnoWar a certain number of times
* The number of trials is passed throught parameter
*/
    public double winRate(int nTrials){
      double player1Wins = 0;
      double player2Wins = 0;
      for (int i = 0; i < nTrials;i++){
        if(this.playGame()){
          player1Wins++;
        }else{
          player2Wins++;
        }
      }
      return (player1Wins / nTrials);
    }
  }
