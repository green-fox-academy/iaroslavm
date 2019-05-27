package tennis;

public class TennisGame3 implements TennisGame {

  private int playerTwoScore;
  private int playerOneScore;
  private String playerOneName;
  private String playerTwoName;
  private String[] possibleScores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};


  public TennisGame3(String playerOneName, String playerTwoName) {
    this.playerOneName = playerOneName;
    this.playerTwoName = playerTwoName;
  }

  public String getScore() {
    String gameScore;
    if (checkIfRunningGameScore()) {
      gameScore = possibleScores[playerOneScore];
      return (playerOneScore == playerTwoScore) ? gameScore + "-All" : gameScore + "-" + possibleScores[playerTwoScore];
    } else {
      if (checkIfScoresEqual())
        return "Deuce";
      gameScore = playerOneScore > playerTwoScore ? playerOneName : playerTwoName;
      return (checkIfDifferenceMorethanOne()) ? "Advantage " + gameScore : "Win for " + gameScore;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      this.playerOneScore += 1;
    else
      this.playerTwoScore += 1;
  }

  public boolean checkIfRunningGameScore(){
    return playerOneScore < 4 & playerTwoScore < 4;
  }

  public boolean checkIfScoresEqual() {
    return playerOneScore == playerTwoScore;
  }

  public boolean checkIfDifferenceMorethanOne() {
    return Math.abs(playerOneScore - playerTwoScore) == 1;
  }

}