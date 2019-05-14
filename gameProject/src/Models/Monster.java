package Models;

import java.util.concurrent.TimeUnit;

public class Monster extends Character {
  protected boolean hasKey;
  protected boolean isBoss;

  public Monster(int x, int y, int gameLevel) {
    this.image = "img/skeleton.png";
    this.cX = x;
    this.cY = y;
    this.level = gameLevel;
    this.maxHP = 2 * this.level * ((int) (1 + Math.random() * 6));
    this.dp = (this.level / 2) * (int) (1 + Math.random() * 6);
    this.sp = this.level * ((int) (1 + Math.random() * 6));
  }


  @Override
  public void moveUP() {
    try {
      TimeUnit.MILLISECONDS.sleep(30);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.cY--;
  }

  @Override
  public void moveDown() {
    try {
      TimeUnit.MILLISECONDS.sleep(30);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.cY++;
  }

  @Override
  public void moveLeft() {
    try {
      TimeUnit.MILLISECONDS.sleep(30);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.cX--;
  }

  @Override
  public void moveRight() {
    try {
      TimeUnit.MILLISECONDS.sleep(30);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    this.cX++;
  }

  public boolean isHasKey() {
    return hasKey;
  }

  public void setHasKey(boolean hasKey) {
    this.hasKey = hasKey;
  }

  public void info() {
    System.out.println(this.maxHP + " | " + this.dp + "|" + this.sp
        + (this.hasKey ? " | has the Key" : " | does not have the Key"));
  }

  public void attackHero(Hero hero) {
    while (this.isAlive() & hero.isAlive()) {

      int thisStrike = this.sp + 2 * (int) (Math.random() * 7);
      int heroStrike = hero.sp + +2 * (int) (Math.random() * 7);

      if (thisStrike > hero.dp) {
        hero.HP += (hero.dp - thisStrike);
      }

      if (heroStrike > this.dp) {
        this.maxHP += (this.dp - heroStrike);
      }

      if (hero.HP < 0) {
        hero.die();
      }

      if (this.maxHP < 0) {
        this.die();
        hero.levelUp();
        if (this.hasKey) {
          this.setHasKey(false);
          hero.setHasKey(true);
        }
        if (this.isBoss) {
          hero.killedBoss = true;
        }
      }
    }
  }
}
