package Models;

public abstract class Character {
  protected int level;
  protected int maxHP;
  protected int dp;
  protected int sp;
  protected int cX;
  protected int cY;
  protected String image;
  protected boolean alive = true;

  public abstract void moveUP();
  public abstract void moveDown();
  public abstract void moveLeft();
  public abstract void moveRight();

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getMaxHP() {
    return maxHP;
  }

  public void setMaxHP(int maxHP) {
    this.maxHP = maxHP;
  }

  public int getDp() {
    return dp;
  }

  public void setDp(int dp) {
    this.dp = dp;
  }

  public int getSp() {
    return sp;
  }

  public void setSp(int sp) {
    this.sp = sp;
  }

  public int getcX() {
    return cX;
  }

  public void setcX(int cX) {
    this.cX = cX;
  }

  public int getcY() {
    return cY;
  }

  public void setcY(int cY) {
    this.cY = cY;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public void die(){
    this.alive = false;
  }

  public String status(){
    return this.alive ? "Alive" : "Dead";
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }
}
