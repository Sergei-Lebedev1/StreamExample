import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.StreamExample.Main.*;

public class StreamExampleTest {
    @Test
    public void streamTest1() {
        String [] mass1 = {"My","Words","my","rules"};
        Assertions.assertEquals(2,countWords(mass1));

    }
    @Test
    public void streamTest2(){
        String [] mass2 = {};
        Assertions.assertEquals(0,countWords(mass2));
    }
    @Test
    public void streamTest3(){
        String [] mass3 = {"Word"};
        Assertions.assertEquals(0,countWords(mass3));

    }
    @Test
    public void streamTest4(){
        String [] mass4 = {"Qwerty"};
        Assertions.assertEquals(1,countWords(mass4));
    }

    @Test
    public void streamTest5() {
        Integer [] mass5 = {2,3,5,7,44,55};
        Assertions.assertEquals(3,countInt(mass5));

    }
    @Test
    public void streamTest6(){
        Integer [] mass6 = {};
        Assertions.assertEquals(0,countInt(mass6));
    }
    @Test
    public void streamTest7(){
        Integer [] mass7 = {5};
        Assertions.assertEquals(0,countInt(mass7));

    }
    @Test
    public void streamTest8(){
        Integer [] mass8 = {6};
        Assertions.assertEquals(1,countInt(mass8));
    }
    @Test
    public void streamTest9(){
        Integer [] mass9 = {2,3,5,7,44,55};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(mass9));
        Assertions.assertEquals(116,countArrList(arr3));
    }


}
