package Models;

public class Tile {
  private String picture;
  private boolean pic;

  Tile(boolean pic){
    this.pic = pic;
    if(this.pic){
      picture = "img/wall.png";
    } else {
      picture = "img/floor.png";
    }
  }

  public String getPicture() {
    return picture;
  }

  public void setPicture(boolean pic) {
    if(pic) {
      this.picture = "img/wall.png";
    } else {
      this.picture = "img/floor.png";
    }
  }

  public boolean isPic() {
    return pic;
  }

  public void setPic(boolean pic) {
    this.pic = pic;
  }

}
