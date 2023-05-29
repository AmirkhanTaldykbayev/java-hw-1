package hw2;

// 2) Не обязательное. Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл
public class BubbleSortWithLog {

    //    public int[] bubble(int[] numbers) {
//        int[] result = new int[numbers.length];
//        for (int i = 0; i <= numbers.length + 1; i++) {
//            for (int j = 0; j < i; j++) {
//                if (numbers[j] > numbers[j + 1]) {
//                    toSwap(numbers[j], numbers[j + 1]);
//                    result[i] = numbers[j];
//                }
//            }
//        }
//        return result;
    public int[] bubble(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    toSwap(numbers[j], numbers[j + 1]);
                }
                result[i] = numbers[j];
            }
        }
        return result;
    }


    private void toSwap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

}
