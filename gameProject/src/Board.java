import GameLogic.GameLogic;
import Models.GameObject;
import Models.Monster;
import javafx.geometry.Pos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  private GameObject newGame;
  private GameLogic gameLogic;

  public Board() {
    // set the size of your draw board
    setPreferredSize(new Dimension(720, 740));
    setVisible(true);
  }

  void createFirstGame(){
    newGame = new GameObject();
    gameLogic = new GameLogic(newGame);
  }

  void createNextGame(){
    newGame = new GameObject(newGame);
    gameLogic = new GameLogic(newGame);
  }

  void youWin(Graphics graphics){
    graphics.setColor(new Color(250,250,250));
    graphics.fillOval(720/3,720/3,720/3,30);
    graphics.setColor(Color.BLACK);
    graphics.drawString("Victory, Press Space to Repeat.",720/3 + 20, 720/3 + 20);
  }

  void gameOver(Graphics graphics){
    graphics.setColor(new Color(250,250,250));
    graphics.fillOval(720/3,720/3,720/3,30);
    graphics.setColor(Color.BLACK);
    graphics.drawString("Game Over, Press Space to Try Again.",720/3 + 5, 720/3 + 20);
  }


  void drawHud(Graphics graphics){
    graphics.setColor(new Color(190,190,190));
    graphics.fillRect(0,720,720,20);
    graphics.setColor(Color.BLACK);
    String stats = "Game (Level: " + newGame.getGameLevel()
        + (newGame.isComplete() ? ", complete" : "")
    + "), Hero (Level: " + newGame.getGameHero().getLevel()
         + (newGame.getGameHero().isHasKey() ? ", K" :"")
        + (newGame.getGameHero().isKilledBoss() ? ", B" :"")
    + ") HP: " + newGame.getGameHero().getHP() + "/" + newGame.getGameHero().getMaxHP()
        + " | DP: " + newGame.getGameHero().getDp() + " | SP: " + newGame.getGameHero().getSp();
    graphics.drawString(stats, 720/4, 735);
  }

  public void drawMap(Graphics graphics){
    PositionedImage image;
    for (int i = 0; i < 10; i++){
      for (int j = 0; j < 10; j++){
        image = new PositionedImage(newGame.getGameMap().getTiles()[i][j].getPicture(), 72 * i, 72 * j);
        image.draw(graphics);
      }
    }
  }


  public void drawHero(Graphics graphics){
    PositionedImage image;
    if(newGame.getGameHero().isAlive()) {
      image = new PositionedImage(newGame.getGameHero().getImage(),
          72 * newGame.getGameHero().getcX(),
          72 * newGame.getGameHero().getcY());
      image.draw(graphics);
    }
  }

  public void drawMonsters(Graphics graphics){
    PositionedImage image;
    for (Monster each :newGame.getMonsterList()) {
      if(each.isAlive()) {
        image = new PositionedImage(each.getImage(),
            72 * each.getcX(),
            72 * each.getcY());
        image.draw(graphics);
      }
    }
  }

  @Override
  public void paint(Graphics graphics) {
    drawMap(graphics);
    drawHero(graphics);
    drawMonsters(graphics);
    drawHud(graphics);
    if(!newGame.getGameHero().isAlive()){
      gameOver(graphics);
    }
    if(newGame.isComplete()){
      youWin(graphics);
    }
  }

  public static void main(String[] args) {
    // Here is how you set up a new window and adding our board to it
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    board.createFirstGame(); // does it mater in waht sequence I add board to frame? seemingly not
//    board.createFirstGameLogic(); // does it mater in waht sequence I add board to frame? seemingly not
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    // Here is how you can add a key event listener
    // The board object will be notified when hitting any key
    // with the system calling one of the below 3 methods
    frame.addKeyListener(board);
    // Notice (at the top) that we can only do this
    // because this Board class (the type of the board object) is also a KeyListener
  }

  // To be a KeyListener the class needs to have these 3 methods in it
  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      gameLogic.moveHeroUp();
      gameLogic.heroAttackMonster();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      gameLogic.moveHeroDown();
      gameLogic.heroAttackMonster();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      gameLogic.moveHeroRight();
      gameLogic.heroAttackMonster();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      gameLogic.moveHeroLeft();
      gameLogic.heroAttackMonster();
      } else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
      createFirstGame();
    } else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
      gameLogic.heroDestroysWall();
    }
  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      gameLogic.eachMonsterMove();
      gameLogic.monsterAttackHero();
      gameLogic.completeGame();
      if(!newGame.isComplete() & newGame.getGameHero().isHasKey() & newGame.getGameHero().isKilledBoss()) {
        createNextGame();
      }
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      gameLogic.eachMonsterMove();
      gameLogic.monsterAttackHero();
      gameLogic.completeGame();
      if(!newGame.isComplete() & newGame.getGameHero().isHasKey() & newGame.getGameHero().isKilledBoss()) {
        createNextGame();
      }
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      gameLogic.eachMonsterMove();
      gameLogic.monsterAttackHero();
      gameLogic.completeGame();
      if(!newGame.isComplete() & newGame.getGameHero().isHasKey() & newGame.getGameHero().isKilledBoss()) {
        createNextGame();
      }
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      gameLogic.eachMonsterMove();
      gameLogic.monsterAttackHero();
      gameLogic.completeGame();
      if (!newGame.isComplete() & newGame.getGameHero().isHasKey() & newGame.getGameHero().isKilledBoss()) {
          createNextGame();
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }

}