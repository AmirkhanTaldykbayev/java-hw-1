package hw3.solutions;

import java.util.Random;

public class Task1 {
    /**
     * Метод генерации массива случайных целочисленных значений
     */
    public static int[] generateArray() {
        Random rnd = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }
        return array;
    }

    /**
     * Метод сортировки слиянием
     *
     * @param input Входящий массив
     * @param first Первый элемент
     * @param last Последний элемент
     */
    public static void sort(int[] input, int first, int last) {
        if(first < last) {
            int mid = (first + last) / 2;
            sort(input, first, mid);
            sort(input, mid + 1, last);
            merge(input,first,mid,last);
            print(input);
        }
    }

    /**
     * Метод слияния двух входящих массивов в один
     *
     * @param input  Входящий массив
     * @param first Левая часть входящего массива
     * @param mid Середина массива входящего массива
     * @param last Правая часть входящего массива
     */

    public static void merge(int[] input, int first, int mid, int last) {
        int[] left = new int[(mid - first) + 2];
        int[] right = new int[last - mid + 1];

        System.arraycopy(input, first, left, 0, left.length - 1);
        System.arraycopy(input, mid + 1, right, 0, left.length - 1);

        left[left.length - 1] = 100;
        right[right.length - 1] = 100;

        int i = 0;
        int j = 0;

        for(; first <= last; first++){
            if(left[i] <= right[j]){
                input[first] = left[i];
                i++;
            }else{
                input[first] = right[j];
                j++;
            }
        }
    }

    public static void print(int[] input){
        System.out.println();
        for (int i :input) {
            System.out.println(i + ", ");
        }
    }

}
