package hw3.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    /**
     * Метод генерации списка случайных целочисленных значений
     */
    public static List<Integer> generateList() {
        Random rnd = new Random();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            integerList.add(rnd.nextInt(10));
        }
        return integerList;
    }
    /**
     * Метод нахождения и удаления из списка четных значений
     * @param inputList Входящий список
     */
    public static List<Integer> isOdd(List<Integer> inputList) {
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            if(inputList.get(i) % 2 != 0) {
                oddNums.add(inputList.get(i));
            }
        }
        return oddNums;
    }
}
