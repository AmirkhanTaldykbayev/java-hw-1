package hw4.Solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    private static LinkedList<String> list1 = new LinkedList<>();


    public static void run() {
        boolean getIteration = true;
        while (getIteration) {
            String command = prompt("Введите команду: ");
            String[] cLine = command.toUpperCase().split("~");
            switch (cLine[0]) {
                case "EXIT":
                    getIteration = false;
                    break;
                case "PRINT":
                    System.out.println(list1.get(Integer.parseInt(cLine[1])));
                    break;
                case "LIST":
                    System.out.println(list1);
                    break;
                case "REVERSE": // Решение для дз 1
                    for (int i = list1.size() - 1; i >= 0 ; i--) {
                        System.out.print(list1.get(i) + " ");
                        if(i == 0) System.out.println();
                    }
                    break;
                case "CLEAR":
                    list1.clear();
                    break;
                case "PUTLAST":
                    //list1.add(cLine[1]);
                    enqueue(list1, cLine[1]); // Метод необязателен, так как можно добавить напрямую, но дз есть дз
                    break;
                case "POP1":
                    dequeue(list1);
                    break;
                case "FIRST":
                    first(list1);
                    break;
                default:
                    list1.add(cLine[0]);

            }
        }
    }

    private static void enqueue(List inputList, String elem){
        list1.addLast(elem); // Использован функционал, доступный для List-а
    }
    private static void dequeue(List inputList){
        System.out.println(inputList.get(0));
        inputList.remove(0);
    }

    private static void first(List inputList){
        System.out.println(inputList.get(0));
    }
    private static String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}