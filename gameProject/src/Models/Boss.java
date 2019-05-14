package Models;

public class Boss extends Monster {

  public Boss(int x,int y, int gameLevel){
    super(x,y,gameLevel);
    this.image = "img/boss.png";
    this.hasKey = false;
    this.level = gameLevel;
    this.maxHP = 2*this.level*((int) (1 + Math.random()*6)) + ((int) (Math.random()*6));
    this.dp =  (this.level/2) * ((int) (1 + Math.random()*6)) + ((int) (Math.random()*6)/2);
    this.sp = this.level * ((int) (1 + Math.random()*6)) + ((int) (Math.random()*6));
    this.isBoss = true;
  }

  public boolean isBoss() {
    return isBoss;
  }

  public void setBoss(boolean boss) {
    isBoss = boss;
  }
}
