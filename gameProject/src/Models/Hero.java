package Models;

public class Hero extends Character{
  int HP = this.maxHP;
  boolean hasKey;
  boolean killedBoss;

  Hero(){
    this.cX = 0;
    this.cY = 0;
    this.image = "img/hero-down.png";
    this.level = 1;
    this.maxHP = 20 + 3 *((int) (1 + Math.random()*6));
    this.HP = this.maxHP;
    this.dp = 2 * ((int) (1 + Math.random()*6));
    this.sp = 5 + ((int) (1 + Math.random()*6));
  }

  Hero(Hero oldHero){
    this.cX = 0;
    this.cY = 0;
    this.image = "img/hero-down.png";
    this.level = oldHero.getLevel();
    int randDraw = (int) (1 + Math.random()*10);
    this.maxHP = oldHero.maxHP;
    if(randDraw < 1) {
      this.HP = this.maxHP;
    } else if (randDraw >= 1 & randDraw < 5){
      this.HP = oldHero.HP + ((oldHero.maxHP - oldHero.HP)/3);
    } else {
      this.HP = oldHero.HP + ((oldHero.maxHP - oldHero.HP)/10);
    }
    this.dp = 2 * ((int) (1 + Math.random()*6));
    this.sp = 5 + ((int) (1 + Math.random()*6));
  }

  @Override
  public void moveUP() {
    this.cY--;
    this.image = "img/hero-up.png";

  }

  @Override
  public void moveDown() {
    this.cY++;
    this.image = "img/hero-down.png";
  }

  @Override
  public void moveLeft() {
    this.cX--;
    this.image = "img/hero-left.png";
  }

  @Override
  public void moveRight() {
    this.cX++;
    this.image = "img/hero-right.png";
  }


  public boolean isKilledBoss() {
    return killedBoss;
  }

  public void attackMonster(Monster monster){
    while(this.isAlive() & monster.isAlive()) {

      int heroStrike = this.sp + 2 * (int) (Math.random() * 7);
      int monsterStrike = monster.sp + +2 * (int) (Math.random() * 7);

      if (heroStrike > monster.dp) {
        monster.maxHP += (monster.dp - heroStrike);
      }

      if (monsterStrike > this.dp) {
        this.HP += (this.dp - monsterStrike);
      }

      if (this.HP < 0) {
        this.die();
      }

      if (monster.maxHP < 0) {
        monster.die();
        this.levelUp();
        if (monster.hasKey){
          monster.setHasKey(false);
          this.setHasKey(true);
        }
        if(monster.isBoss){
          this.killedBoss = true;
        }
      }
    }


  }

  public void levelUp(){
    this.level++;
    int randIncrease = (int) (1 + Math.random()*6);
    this.maxHP += randIncrease;
    this.HP += randIncrease;
    this.dp += (int) (1 + Math.random()*6);
    this.sp += (int) (1 + Math.random()*6);

  }

  public void lookUp(){
    this.image = "img/hero-up.png";
  }

  public void lookDown(){
    this.image = "img/hero-down.png";
  }

  public void lookLeft(){
    this.image = "img/hero-left.png";
  }

  public void lookRight(){
    this.image = "img/hero-right.png";
  }

  public int getHP() {
    return HP;
  }

  public void setHP(int HP) {
    this.HP = HP;
  }
  public boolean isHasKey() {
    return hasKey;
  }

  public void setHasKey(boolean hasKey) {
    this.hasKey = hasKey;
  }
}
