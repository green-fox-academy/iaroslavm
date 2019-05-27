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
  private int tempScore;
  private String [] players = new String [2];


  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
    players[0] = this.player1Name;
    players[1] = this.player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName.equals(player1Name))
      playerOneScore += onePoint;
    else
      payerTwoScore += onePoint;
  }

  public String getScore() {
    if (checkIfScoresEqual()) {
      getEqualScore();
    } else if (checkIfAnyScoreAboveThree()) {
      getAdvantageOrWin();
    } else {
      getRunningScore();
    }
    return gameScore;
  }

  public boolean checkIfScoresEqual() {
    return playerOneScore == payerTwoScore;
  }

  public void getEqualScore() {
    if (this.playerOneScore == 0) {
      gameScore = "Love-All";
    } else if (this.playerOneScore == 1) {
      gameScore = "Fifteen-All";
    } else if (this.playerOneScore == 2) {
      gameScore = "Thirty-All";
    } else if (this.playerOneScore == 3) {
      gameScore = "Forty-All";
    } else {
      gameScore = "Deuce";
    }
  }

  public boolean checkIfAnyScoreAboveThree() {
    return playerOneScore >= fourPoints || payerTwoScore >= fourPoints;
  }

  public void getAdvantageOrWin() {
    int scoreDifference = playerOneScore - payerTwoScore;
    if (Math.abs(scoreDifference) == onePoint) {
      gameScore = (scoreDifference == onePoint) ? "Advantage player1" : "Advantage player2";
    } else {
      gameScore = (scoreDifference >= twoPoints) ? "Win for player1" : "Win for player2";
    }
  }

  public void getRunningScore() {
    for (String player : players) {
      if (player.equals(player1Name)) tempScore = playerOneScore;
      else {
        gameScore += "-";
        tempScore = payerTwoScore;
      }
      if (tempScore == 0) {
        gameScore += "Love";
      } else if (tempScore == 1) {
        gameScore += "Fifteen";
      } else if (tempScore == 2) {
        gameScore += "Thirty";
      } else {
        gameScore += "Forty";
      }
    }
  }
}