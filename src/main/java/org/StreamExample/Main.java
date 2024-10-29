package org.StreamExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
//Упр.1. Создать ArrayList с числами.
// Отфильтровать только четные числа,
// потом возвести их в квадрат,
// потом оставить только первые три элемента и вывести в консоль.

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] str1 = {"яблоко", "апельсин", "банан", "киви", "арбуз"};
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(arr));
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str1));
//        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
//        System.out.println(list1);
//        System.out.println(list2);
        System.out.println(countWords(str1));
//        System.out.println(countInt(arr));
//        System.out.println(countToReduce(arr2));

//        Stream<Integer> stream = list1.stream();
//        stream.filter(x -> x%2 == 0).map(x -> x * x ).limit(3).forEach(System.out::println);// (x -> System.out .println(x))

//        Stream<Integer> stream2 = list1.stream();
//        Stream<Integer> stream3 = list1.stream();
//        // (x -> System.out .println(x))
//        stream1.filter(x -> x > 5).map(x -> x +1).forEach(System.out::println);
//        stream2.filter(x -> x > 5).limit(3).forEach(System.out::println);
//        stream3.skip(3).forEach(System.out::println);
//        stream1.sorted().distinct().forEach(System.out::println);
//        long res = stream1.distinct().count();
//        int res = stream1.distinct().reduce(0, (acc, x) -> acc + x);
//        System.out.println(res);


    }

// Упр.2. Создать метод, который принимает массив строк,
// создает stream и возвращает количество слов,
// которые длиннее четырех символов. Покрыть тестами.
    public static int countWords(String[] txt) {
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(txt));
        Stream<String> str1 = list2.stream();
        long b = str1.filter(x -> x.length() >= 4).count();
        return (int) b;
    }

// Упр.3. Создать метод, который принимает массив чисел,
// создает стрим и подсчитывает, сколько в массиве чисел,
// больше заданного значения (например > 5).
// Покрыть тестами.
    public static int countInt(Integer[] arr1) {
        Stream<Integer> stream1 = Arrays.stream(arr1);
        long z = stream1.filter(x -> x >= 5).count();
        return (int) z;

    }

// Упр.4. Создать метод, который принимает ArrayList с числами,
// создает stream и подсчитывает сумму всех чисел(метод reduce),
// результат возвращает.
// Покрыть тестами.
    public static int countToReduce(ArrayList<Integer> txt) {
        Stream<Integer> stream2 = txt.stream();
        int res = stream2.distinct().reduce(0, (acc, x) -> acc + x);
        return res;

    }
}








