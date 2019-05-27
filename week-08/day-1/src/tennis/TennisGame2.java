package tennis;

public class TennisGame2 implements TennisGame
{
  private int playerOneScore = 0;
  private int playerTwoScore = 0;

  private String P1res = "";
  private String P2res = "";
  private String player1Name;
  private String player2Name;
  private String [] players = new String [2];
  private String gameScore = "";

  public TennisGame2(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
    players[0] = this.player1Name;
    players[1] = this.player2Name;
  }

  public String getScore(){
    if (checkifScoresEqual())
      returnScoreIfEqual();
    if (playerOneScore > 0 && playerTwoScore==0)
    {
      if (playerOneScore==1)
        P1res = "Fifteen";
      if (playerOneScore==2)
        P1res = "Thirty";
      if (playerOneScore==3)
        P1res = "Forty";

      P2res = "Love";
      gameScore = P1res + "-" + P2res;
    }
    if (playerTwoScore > 0 && playerOneScore==0)
    {
      if (playerTwoScore==1)
        P2res = "Fifteen";
      if (playerTwoScore==2)
        P2res = "Thirty";
      if (playerTwoScore==3)
        P2res = "Forty";

      P1res = "Love";
      gameScore = P1res + "-" + P2res;
    }

    if (playerOneScore>playerTwoScore && playerOneScore < 4)
    {
      if (playerOneScore==2)
        P1res="Thirty";
      if (playerOneScore==3)
        P1res="Forty";
      if (playerTwoScore==1)
        P2res="Fifteen";
      if (playerTwoScore==2)
        P2res="Thirty";
      gameScore = P1res + "-" + P2res;
    }
    if (playerTwoScore>playerOneScore && playerTwoScore < 4)
    {
      if (playerTwoScore==2)
        P2res="Thirty";
      if (playerTwoScore==3)
        P2res="Forty";
      if (playerOneScore==1)
        P1res="Fifteen";
      if (playerOneScore==2)
        P1res="Thirty";
      gameScore = P1res + "-" + P2res;
    }

    if (playerOneScore > playerTwoScore && playerTwoScore >= 3)
    {
      gameScore = "Advantage player1";
    }

    if (playerTwoScore > playerOneScore && playerOneScore >= 3)
    {
      gameScore = "Advantage player2";
    }

    if (playerOneScore>=4 && playerTwoScore>=0 && (playerOneScore-playerTwoScore)>=2)
    {
      gameScore = "Win for player1";
    }
    if (playerTwoScore>=4 && playerOneScore>=0 && (playerTwoScore-playerOneScore)>=2)
    {
      gameScore = "Win for player2";
    }
    return gameScore;
  }

  public void SetP1Score(int number){

    for (int i = 0; i < number; i++)
    {
      playerOneScores();
    }

  }

  public void SetP2Score(int number){

    for (int i = 0; i < number; i++)
    {
      playerTwoScores();
    }

  }

  public void playerOneScores(){
    playerOneScore++;
  }

  public void playerTwoScores(){
    playerTwoScore++;
  }

  public void wonPoint(String player) {
    if (player == "player1")
      playerOneScores();
    else
      playerTwoScores();
  }

  public boolean checkifScoresEqual(){
    return playerOneScore == playerTwoScore;
  }

  public void returnScoreIfEqual(){
    if(playerOneScore <= 3) {
      if (playerOneScore == 0)
        gameScore = "Love";
      if (playerOneScore == 1)
        gameScore = "Fifteen";
      if (playerOneScore == 2)
        gameScore = "Thirty";
      if (playerOneScore == 3)
        gameScore = "Forty";
      gameScore += "-All";
    } else
      gameScore = "Deuce";
  }

}