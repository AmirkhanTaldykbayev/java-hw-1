package hw3.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    /**
     * Метод генерации списка случайных целочисленных значений
     */

    public static List<Integer> generateList() {
        Random rnd = new Random();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            numList.add(rnd.nextInt(100));
        }
        return numList;
    }

    /**
     * Метод нахождения максимального, минимального и среднего значения в списке целочисленных значений
     * @param inputList // Входящий список
     */

    public static void minMaxMiddle(List<Integer> inputList) {
        System.out.println("Сортируем...");
        Collections.sort(inputList);
        System.out.println(inputList);
        System.out.println("Максимальное значение: " + Collections.max(inputList));
        System.out.println("Минимальное значение: " + Collections.min(inputList));
        System.out.println("Среднее значение: " + inputList.get(inputList.size() / 2));
    }
}
