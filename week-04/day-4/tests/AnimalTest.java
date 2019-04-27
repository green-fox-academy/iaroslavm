import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal myAnimal;

    @Test
    public void test1(){
        myAnimal = new Animal(100,100);
        for(int i = 0; i < 50; i++){
            myAnimal.eat();
            myAnimal.drink();
        }
        assertEquals(50, myAnimal.getHunger());
    }

    @Test
    public void test2(){
        myAnimal = new Animal(100,100);
        for(int i = 0; i < 50; i++){
            myAnimal.eat();
            myAnimal.drink();
        }
        assertEquals(50, myAnimal.getThirst());
    }

    @Test
    public void test3(){
        myAnimal = new Animal(100,100);
        for(int i = 0; i < 50; i++){
            myAnimal.play();
        }
        assertEquals(150, myAnimal.getHunger());
    }
}
