package hw4.Solutions;

import java.util.Scanner;
import java.util.Stack;

public class StackTask {
    private static Stack stack = new Stack();
    private static Stack operationStack = new Stack<>();

    public static void run() {

        boolean flag = true;
        while (flag) {
            String command = prompt("Введите команду: ");
            String cLine[] = command.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT":
                    flag = false;
                    break;
                case "SIZE":
                    System.out.println(stack.size());
                    break;
                case "ISEMPTY":
                    System.out.println(stack.isEmpty());
                    break;
                case "PUSH":
                    stack.push(cLine[1]);
                    break;
                case "PEEK":
                    System.out.println(stack.peek());
                    break;
                case "POP":
                    stack.pop();
                    break;
                case "SHOW":
                    System.out.println(stack);
                    break;
            }

        }
    }


    private static String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.next();
    }


}
