package Models;

public class Map {
  private Tile [][] tiles = new Tile [10][10];
  private boolean mapUpdate;

  Map(){
    for (int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        if(i == 0 || j == 0 || i == 4 || j == 4 || j == 9 || i == 8){
          tiles[i][j] = new Tile(false);
        } else {
          tiles[i][j] = new Tile(randomBoolean());
        }
      }
    }
  }

  boolean randomBoolean(){
    return Math.random() < 0.7;
  }

  public Tile[][] getTiles() {
    return tiles;
  }

  public void setTiles(Tile[][] tiles) {
    this.tiles = tiles;
  }

  public boolean isMapUpdate() {
    return mapUpdate;
  }
}
