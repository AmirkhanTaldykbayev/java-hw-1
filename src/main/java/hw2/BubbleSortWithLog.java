package hw2;

// 2) Не обязательное. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл
public class BubbleSortWithLog {

    public void toSwap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    // toSwap(numbers[j], numbers[j + 1]); <-- почему то не работает
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j+1] = temp;
                }
            }
        }
    }


}
