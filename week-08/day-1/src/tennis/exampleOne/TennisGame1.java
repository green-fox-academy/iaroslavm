package tennis.exampleOne;


import tennis.TennisGame;

public class TennisGame1 implements TennisGame {

  private int playerOneScore = 0;
  private int payerTwoScore = 0;
  private String player1Name;
  private String player2Name;
  private static final int onePoint = 1;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName == player1Name)
      playerOneScore += onePoint;
    else
      payerTwoScore += onePoint;
  }

  public String getScore() {
    String gameScore = "";
    int tempScore=0;
    if (checkIfEqualScore()){
      gameScore =  getEqualScore();
    } else if (playerOneScore>=4 || payerTwoScore>=4)
    {
      int minusResult = playerOneScore-payerTwoScore;
      if (minusResult==1) gameScore ="Advantage player1";
      else if (minusResult ==-1) gameScore ="Advantage player2";
      else if (minusResult>=2) gameScore = "Win for player1";
      else gameScore ="Win for player2";
    }
    else
    {
      for (int i=1; i<3; i++)
      {
        if (i==1) tempScore = playerOneScore;
        else { gameScore+="-"; tempScore = payerTwoScore;}
        switch(tempScore)
        {
          case 0:
            gameScore+="Love";
            break;
          case 1:
            gameScore+="Fifteen";
            break;
          case 2:
            gameScore+="Thirty";
            break;
          case 3:
            gameScore+="Forty";
            break;
        }
      }
    }
    return gameScore;
  }

  public boolean checkIfEqualScore(){
    return playerOneScore==payerTwoScore;
  }

  public String getEqualScore(){
    String result;
    if(this.playerOneScore == 0){
      result = "Love-All";
    } else if(this.playerOneScore == 1){
      result = "Fifteen-All";
    } else if (this.playerOneScore == 2){
      result = "Thirty-All";
    } else if (this.playerOneScore == 3){
      result = "Forty-All";
    } else {
      result = "Deuce";
    }
    return result;
  }
}