public class Domino implements Comparable<Domino> {
  int left;
  int right;

  Domino(int left, int right){
    this.left = left;
    this.right = right;
  }

  @Override
  public int compareTo(Domino other) {
    int result = 0;
    if (this.left < other.left){
      result = -1;
    } else if (this.left > other.left){
      result = 1;
    } else {
      if (this.right > other.right){
        result = 1;
      } else if ( this.right < other.right){
        result = -1;
      }
    }
    return result;
  }

  @Override
  public String toString(){
    return "(" + this.left + ", " + this.right + ")";
  }
}
