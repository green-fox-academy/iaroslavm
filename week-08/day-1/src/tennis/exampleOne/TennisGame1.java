package tennis.exampleOne;


import tennis.TennisGame;

public class TennisGame1 implements TennisGame {

  private int playerOneScore = 0;
  private int payerTwoScore = 0;
  private String player1Name;
  private String player2Name;
  private static final int onePoint = 1;
  private static final int fourPoints = 4;
  private static final int twoPoints = 2;
  private String gameScore = "";

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

    int tempScore=0;
    if (checkIfEqualScore()){
      getEqualScore();
    } else if (chechIfScoreAboveFour())
    {
      checkScoreDifference();
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

  public void getEqualScore(){
    if(this.playerOneScore == 0){
      gameScore = "Love-All";
    } else if(this.playerOneScore == 1){
      gameScore = "Fifteen-All";
    } else if (this.playerOneScore == 2){
      gameScore = "Thirty-All";
    } else if (this.playerOneScore == 3){
      gameScore = "Forty-All";
    } else {
      gameScore = "Deuce";
    }
  }

  public boolean chechIfScoreAboveFour(){
    return playerOneScore >= fourPoints || payerTwoScore >=fourPoints;
  }

  public void checkScoreDifference(){
    int scoreDifference = playerOneScore-payerTwoScore;
    if (Math.abs(scoreDifference) == onePoint) {
      gameScore = (scoreDifference == onePoint) ? "Advantage player1" : "Advantage player2";
    } else {
      gameScore = (scoreDifference >= twoPoints) ? "Win for player1" : "Win for player2";
    }
  }
}