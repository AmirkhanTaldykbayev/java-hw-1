package hw3;

import hw3.solutions.Task1;
import hw3.solutions.Task2;
import hw3.solutions.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

/*
*************************************************************************************************
*/
        // (✖ не решено) 1. Реализовать алгоритм сортировки слиянием(метод взять из интернета)

        int[] numsArray = Task1.generateArray();
        System.out.println(Arrays.toString(numsArray));
        Task1.sort(numsArray, 0, numsArray.length - 1);


/*
*************************************************************************************************
*/
        // (✔решено) 2. Пусть дан произвольный список целых чисел, удалить из него четные числа

//        List<Integer> nums = Task2.generateList();
//        System.out.println(nums);
//        System.out.println(Task2.isOdd(nums));
/*
*************************************************************************************************
*/
        // (✔решено) 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//        List<Integer> numbers = Task3.generateList();
//        System.out.println(numbers);
//        Task3.minMaxMiddle(numbers);

    }
}
