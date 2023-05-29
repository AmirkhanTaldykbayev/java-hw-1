package hw2;
// 4) Не обязательное. К калькулятору из предыдущего ДЗ добавить логирование.
public class CalculatorLogger {
    public double Calculate(double num1, char ch, double num2) {
        switch (ch) {
            case('+'):
                System.out.println(num1 + num2);
                break;
            case('-'):
                System.out.println(num1 - num2);
                break;
            case('*'):
                System.out.println(num1 * num2);
                break;
            case('/'):
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                    break;
                }
                else {
                    System.out.println("На ноль делить нельзя!");
                }
            default:
                System.out.println("Вы использовали неверный оператор!");
        }
        return num1;
    }
}

