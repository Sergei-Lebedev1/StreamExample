import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.StreamExample.Main.*;

public class StreamExampleTest {
    @Test
    public void streamTest1() {
        String[] mass1 = {"my", "words", "my", "rules"};
        Assertions.assertEquals(2, countWords(mass1));

    }

    @Test
    public void streamTest2() {
        String[] mass2 = {};
        Assertions.assertEquals(0, countWords(mass2));
    }

    @Test
    public void streamTest3() {
        String[] mass3 = {"word"};
        Assertions.assertEquals(1, countWords(mass3));

    }

    @Test
    public void streamTest4() {
        String[] mass4 = {"qwerty"};
        Assertions.assertEquals(1, countWords(mass4));
    }

    @Test
    public void streamTest5() {
        Integer[] mass5 = {2, 3, 5, 7, 44, 55};
        Assertions.assertEquals(4, countInt(mass5));

    }

    @Test
    public void streamTest6() {
        Integer[] mass6 = {};
        Assertions.assertEquals(0, countInt(mass6));
    }

    @Test
    public void streamTest7() {
        Integer[] mass7 = {5};
        Assertions.assertEquals(1, countInt(mass7));

    }

    @Test
    public void streamTest8() {
        Integer[] mass8 = {-6};
        Assertions.assertEquals(0, countInt(mass8));
    }

    @Test
    public void streamTest9() {
        Integer[] mass9 = {0, 2, 4, 5, 6};
        Assertions.assertEquals(2, countInt(mass9));

    }

    @Test
    public void streamTest10() {
        Integer[] mass10 = {2, 3, 5, 44, 56};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(mass10));
        Assertions.assertEquals(110, countToReduce(arr3));
    }

    @Test
    public void streamTest11() {
        Integer[] mass11 = {1, 2, 2, 3, 3, 3};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(mass11));
        Assertions.assertEquals(6, countToReduce(arr3));
    }

    @Test
    public void streamTest12() {
        Integer[] mass12 = {-1, -2, -3, -1, -3};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(mass12));
        Assertions.assertEquals(-6, countToReduce(arr3));
    }

    @Test
    public void streamTest13() {
        Integer[] mass13 = {};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(mass13));
        Assertions.assertEquals(0, countToReduce(arr3));
    }

    @Test
    public void streamTest14() {
        Integer[] mass14 = {0, 1, 2, 3, 1, 3};
        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(mass14));
        Assertions.assertEquals(6, countToReduce(arr3));
    }

}





