import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class DominoTest {



  @Test
  public void test1(){
    Domino newDomino = new Domino(3,6);
    Domino otherDomino = new Domino(2,6);
    List<Domino> list = new ArrayList<>();
    list.add(newDomino);
    list.add(otherDomino);
    assertTrue(newDomino instanceof Comparable);
  }

  @Test
  public void test2(){
    Domino newDomino = new Domino(3,6);
    Domino otherDomino = new Domino(2,6);
    List<Domino> list = new ArrayList<>();
    list.add(newDomino);
    list.add(otherDomino);
    assertEquals(Integer.parseInt("3"), Integer.parseInt(newDomino.toString().substring(1,2)), 0);
  }


  @Test
  public void test3(){
    Domino newDomino = new Domino(3,6);
    Domino otherDomino = new Domino(2,6);
    List<Domino> list = new ArrayList<>();
    list.add(newDomino);
    list.add(otherDomino);
    Collections.sort(list);
    assertEquals(Integer.parseInt("2"), Integer.parseInt(list.get(0).toString().substring(1,2)), 0);
  }



}
