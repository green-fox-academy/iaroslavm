package Domino;

import java.nio.file.Path;

public class Domino implements Comparable<Domino>{ //why do I need to use interface in the first place
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    @Override
    public int compareTo(Domino other){
        int result = Integer.compare(this.left,other.left);
        if (result == 0) {
            result = Integer.compare(this.right,other.right);
        }
        return result;

    }
}