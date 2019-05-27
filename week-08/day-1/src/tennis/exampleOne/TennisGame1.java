package tennis.exampleOne;


import tennis.TennisGame;

public class TennisGame1 implements TennisGame {

  private int playerOneScore = 0;
  private int payerTwoScore = 0;
  private String player1Name;
  private String player2Name;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName == player1Name)
      playerOneScore += 1;
    else
      payerTwoScore += 1;
  }

  public String getScore() {
    String score = "";
    int tempScore=0;
    if (playerOneScore==payerTwoScore)
    {
      switch (playerOneScore)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
    }
    else if (playerOneScore>=4 || payerTwoScore>=4)
    {
      int minusResult = playerOneScore-payerTwoScore;
      if (minusResult==1) score ="Advantage player1";
      else if (minusResult ==-1) score ="Advantage player2";
      else if (minusResult>=2) score = "Win for player1";
      else score ="Win for player2";
    }
    else
    {
      for (int i=1; i<3; i++)
      {
        if (i==1) tempScore = playerOneScore;
        else { score+="-"; tempScore = payerTwoScore;}
        switch(tempScore)
        {
          case 0:
            score+="Love";
            break;
          case 1:
            score+="Fifteen";
            break;
          case 2:
            score+="Thirty";
            break;
          case 3:
            score+="Forty";
            break;
        }
      }
    }
    return score;
  }

  public boolean checkIfEqualScore(){
    return playerOneScore==payerTwoScore;
  }
}