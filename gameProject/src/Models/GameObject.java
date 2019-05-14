package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameObject {
  private Map gameMap;
  private Hero gameHero;
  private Boss gameBoss;
  private List<Monster> monsterList = new ArrayList<>();
  private int gameLevel;
  private boolean complete;

  public GameObject(){
    this.gameLevel = 1;
    this.gameMap = new Map();
    this.gameHero = new Hero();
    this.gameBoss = createBoss();
    this.monsterList = createMonsters(4 + (int) (Math.random()*2));
    assignKey();
  }

  public GameObject(GameObject oldGame){
    this.gameLevel = oldGame.gameLevel + 1;
    this.gameMap = new Map();
    this.gameHero = new Hero(oldGame.getGameHero());
    this.gameBoss = createBoss();
    this.monsterList = createMonsters(4 + (int) (Math.random()*2));
    assignKey();
  }

  public List<Monster> createMonsters(int size){
    int indexX;
    int indexY;

    for(int i = 0; i < size; i++) {
      do {
        indexX = 3 + (int) (Math.random() * 6);
        indexY = 3 + (int) (Math.random() * 6);
      } while (gameMap.getTiles()[indexX][indexY].isPic());
      monsterList.add(new Monster(indexX,indexY,this.gameLevel));
    }
    monsterList.add(this.gameBoss);
    return monsterList;
  }



  public Boss createBoss(){
    int indexX;
    int indexY;

      do {
        indexX = 3 + (int) (Math.random() * 6);
        indexY = 3 + (int) (Math.random() * 6);
      } while (gameMap.getTiles()[indexX][indexY].isPic());
    Boss boss = new Boss(indexX,indexY, this.gameLevel);
    System.out.println("Boss created");
    return boss;
  }



  public void assignKey(){
    this.monsterList.get(1).setHasKey(true);
  }

  public List<Monster> getMonsterList() {
    return monsterList;
  }

  public void setMonsterList(List<Monster> monsterList) {
    this.monsterList = monsterList;
  }

  public Map getGameMap() {
    return gameMap;
  }

  public void setGameMap(Map gameMap) {
    this.gameMap = gameMap;
  }

  public Hero getGameHero() {
    return gameHero;
  }

  public void setGameHero(Hero gameHero) {
    this.gameHero = gameHero;
  }

  public Boss getGameBoss() {
    return gameBoss;
  }

  public void setGameBoss(Boss gameBoss) {
    this.gameBoss = gameBoss;
  }

  public int getGameLevel() {
    return gameLevel;
  }

  public void setGameLevel(int gameLevel) {
    this.gameLevel = gameLevel;
  }

  public boolean isComplete() {
    return complete;
  }

  public void setComplete(boolean complete) {
    this.complete = complete;
  }
}
