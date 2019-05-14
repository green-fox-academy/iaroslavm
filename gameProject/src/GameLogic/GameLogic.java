package GameLogic;

import Models.GameObject;
import Models.Monster;

public class GameLogic {
  GameObject gameObject;

  public GameLogic(GameObject gameObject){
    this.gameObject = gameObject;
    eachMonsterMove();
  }

  public void completeGame(){
    if(this.gameObject.getGameHero().isKilledBoss() &
        this.gameObject.getGameHero().isHasKey() &
        this.gameObject.getGameLevel() == 2){
      this.gameObject.setComplete(true);
      System.out.println("Game is completed");
    }
  }

  public void moveHeroUp() {
    try {
      if (gameObject.getGameHero().getcY() - 1 >= 0 &
          !gameObject.getGameMap().getTiles()[gameObject.getGameHero().getcX()][gameObject.getGameHero().getcY() - 1].isPic()) {
        gameObject.getGameHero().moveUP();
      } else {
        gameObject.getGameHero().lookUp();
      }
    }catch (Exception e) {
    }
  }

  public void moveHeroDown() {
    try {
      if (gameObject.getGameHero().getcY() + 1 < 10 &
          !gameObject.getGameMap().getTiles()[gameObject.getGameHero().getcX()][gameObject.getGameHero().getcY() + 1].isPic()) {
        gameObject.getGameHero().moveDown();
      } else {
        gameObject.getGameHero().lookDown();
      }
    }catch (Exception e) {
    }
  }

  public void moveHeroRight() {
    try {
      if (gameObject.getGameHero().getcX() + 1 < 10 &
          !gameObject.getGameMap().getTiles()[gameObject.getGameHero().getcX() + 1][gameObject.getGameHero().getcY()].isPic()) {
        gameObject.getGameHero().moveRight();
      } else {
        gameObject.getGameHero().lookRight();
      }
    }catch (Exception e) {
    }
  }

  public void moveHeroLeft() {
    try {
      if (gameObject.getGameHero().getcX() - 1 >= 0 &
          !gameObject.getGameMap().getTiles()[gameObject.getGameHero().getcX() - 1][gameObject.getGameHero().getcY()].isPic()) {
        gameObject.getGameHero().moveLeft();
      } else {
        gameObject.getGameHero().lookLeft();
      }
    }catch (Exception e) {
    }
  }

  public void heroAttackMonster(){
    for(Monster each : gameObject.getMonsterList()){
      if(gameObject.getGameHero().getcX() == each.getcX() &
          gameObject.getGameHero().getcY() == each.getcY() &
          each.isAlive()) {
        System.out.println("Hero attacks");
        gameObject.getGameHero().attackMonster(each);
      }
    }
  }

  public void monsterAttackHero(){
    for (Monster each : gameObject.getMonsterList()){
      if(gameObject.getGameHero().getcX() == each.getcX() &
          gameObject.getGameHero().getcY() == each.getcY() &
          each.isAlive()){
        System.out.println("Monster attacks");
        each.attackHero(gameObject.getGameHero());
      }
    }
  }

  public void eachMonsterMove(){
      for (Monster each : gameObject.getMonsterList()) {
        if (each.isAlive()) {
          if (gameObject.getGameHero().getcX() != each.getcX() ||
              gameObject.getGameHero().getcY() != each.getcY()) {
            monsterRandomMove(monsterLocation(each), each);
          }
        }
      }
  }

  public int monsterLocation(Monster monster){
    int zeroWalls = 0;
    int rightWall = 0;
    int leftWall = 0;
    int upWall = 0;
    int downWall = 0;
    int sum = 0;

    if (monster.getcX() + 1 == 10 ||
        gameObject.getGameMap().getTiles()[monster.getcX() + 1][monster.getcY()].isPic()) {
      rightWall = 1;
    }

    if (monster.getcX() - 1 == -1 ||
        gameObject.getGameMap().getTiles()[monster.getcX() - 1][monster.getcY()].isPic()) {
      leftWall = 3;
    }

    if (monster.getcY() - 1 == -1 ||
        gameObject.getGameMap().getTiles()[monster.getcX()][monster.getcY() - 1].isPic()) {
      upWall = 5;
    }
    if (monster.getcY() + 1 == 10 ||
        gameObject.getGameMap().getTiles()[monster.getcX()][monster.getcY() + 1].isPic()) {
      downWall = 11;
    }

    sum = zeroWalls + rightWall + leftWall + upWall  + downWall;

    return sum;
  }

  public int randomDirection(int numDirection){
    int rD = (int) (Math.random()*numDirection);
    return rD;
  }

  public void monsterRandomMove(int sum, Monster monster){
    int rD;

    if (sum == 0){
      rD = randomDirection(4);
      if(rD == 0){
        monster.moveUP();
      } else if (rD == 1){
        monster.moveDown();
      } else if (rD == 2){
        monster.moveRight();
      } else {
        monster.moveLeft();
      }
    }
    if (sum == 1){
      rD = randomDirection(3);
      if(rD == 0){
        monster.moveUP();
      } else if (rD == 1){
        monster.moveDown();
      } else {
        monster.moveLeft();
      }
    }
    if (sum == 3){
      rD = randomDirection(3);
      if(rD == 0){
        monster.moveUP();
      } else if (rD == 1){
        monster.moveDown();
      } else if (rD == 2){
        monster.moveRight();
      }
    }
    if (sum == 5){
      rD = randomDirection(3);
      if(rD == 0){
        monster.moveLeft();
      } else if (rD == 1){
        monster.moveDown();
      } else if (rD == 2){
        monster.moveRight();
      }
    }
    if (sum == 11){
      rD = randomDirection(3);
      if(rD == 0){
        monster.moveUP();
      } else if (rD == 1){
        monster.moveLeft();
      } else if (rD == 2){
        monster.moveRight();
      }
    }
    if (sum == 4) {
      rD = randomDirection(2);
      if (rD == 0) {
        monster.moveDown();
      } else if (rD == 1) {
        monster.moveUP();
      }
    }
    if (sum == 6) {
      rD = randomDirection(2);
      if (rD == 0) {
        monster.moveDown();
      } else if (rD == 1) {
        monster.moveLeft();
      }
    }
    if (sum == 12) {
      rD = randomDirection(2);
      if (rD == 0) {
        monster.moveLeft();
      } else if (rD == 1) {
        monster.moveUP();
      }
    }
    if (sum == 14) {
      rD = randomDirection(2);
      if (rD == 0) {
        monster.moveRight();
      } else if (rD == 1) {
        monster.moveUP();
      }
    }
    if (sum == 8) {
      rD = randomDirection(2);
      if (rD == 0) {
        monster.moveDown();
      } else if (rD == 1) {
        monster.moveRight();
      }
    }
    if (sum == 16) {
      rD = randomDirection(2);
      if (rD == 0) {
        monster.moveRight();
      } else if (rD == 1) {
        monster.moveLeft();
      }
    }
    if (sum == 9) {
      monster.moveDown();
    }
    if (sum == 19) {
      monster.moveRight();
    }
    if (sum == 15) {
      monster.moveUP();
    }
    if (sum == 17) {
      monster.moveLeft();
    }
  }

  public void heroDestroysWall(){
    try {
      if (this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX() + 1]
          [this.gameObject.getGameHero().getcY()].isPic() &
          this.gameObject.getGameHero().getImage().equals("img/hero-right.png")) {
        destroysRightWall();
      }
    }catch(Exception e1){
      System.out.println("close to the edge");
    }
    try {
      if (this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX() - 1]
          [this.gameObject.getGameHero().getcY()].isPic() &
          this.gameObject.getGameHero().getImage().equals("img/hero-left.png")) {
        destroysLeftWall();
      }
    } catch(Exception e1){
      System.out.println("close to the edge");
    }
    try {
      if (this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX()]
          [this.gameObject.getGameHero().getcY() + 1].isPic() &
          this.gameObject.getGameHero().getImage().equals("img/hero-down.png")) {
        destroysDownWall();
      }
    }catch(Exception e1){
      System.out.println("close to the edge");
    }
    try{
      if (this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX()]
          [this.gameObject.getGameHero().getcY() - 1].isPic() &
          this.gameObject.getGameHero().getImage().equals("img/hero-up.png")) {
        destroysUpWall();
      }
    } catch(Exception e1){
      System.out.println("close to the edge");
    }
  }

  public void destroysRightWall(){
    try {
      this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX() + 1]
          [this.gameObject.getGameHero().getcY()].setPicture(false);
      this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX() + 1]
          [this.gameObject.getGameHero().getcY()].setPic(false);
    } catch (Exception e) {
      System.out.println("close to the edge");
    }
  }

  public void destroysLeftWall(){
    this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX() - 1]
        [this.gameObject.getGameHero().getcY()].setPicture(false);
    this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX() - 1]
        [this.gameObject.getGameHero().getcY()].setPic(false);
  }

  public void destroysDownWall(){
    this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX()]
        [this.gameObject.getGameHero().getcY() + 1].setPicture(false);
    this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX()]
        [this.gameObject.getGameHero().getcY() + 1].setPic(false);
  }

  public void destroysUpWall(){
    this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX()]
        [this.gameObject.getGameHero().getcY() - 1].setPicture(false);
    this.gameObject.getGameMap().getTiles()[this.gameObject.getGameHero().getcX()]
        [this.gameObject.getGameHero().getcY() - 1].setPic(false);
  }
}
