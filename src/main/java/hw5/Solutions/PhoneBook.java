package hw5.Solutions;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, List<Long>> pb = new HashMap<>();

    public static void run() {
        boolean flag = true;
        while (flag) {
            String inputNumber = prompt("Введите команду: " +
                    "\n(Введите info для списка доступных команд)");
            String[] split = inputNumber.split(" ");
            switch (split[0].toUpperCase()) {
                case "EXIT":
                    flag = false;
                    break;
                case "INFO":
                    System.out.println("ADD - для добавления номера; " +
                            "\n'''Пример''': add name 123(номер телефона)");
                    System.out.println("SHOW - для показа телефонной книги; ");
                    System.out.println("EXIT - для завершения работы.");
                    break;
                case "ADD":
                    for (String s : split) {
                        if (!pb.containsKey(split[1])) {
                            List<Long> phoneList = new ArrayList<>();
                            phoneList.add(Long.parseLong(split[2]));
                            pb.put(split[1], phoneList);
                            break;
                        } else {
                            pb.get(split[1]).add(Long.parseLong(split[2]));
                            break;
                        }
                    }
                case "SHOW":
                    printPhoneBook(pb);
                    break;
                default:
                    System.out.println("Введена неверная команда! \nВведите 'info' для доступных команд");
            }
        }
    }

    private static String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

    public static void printPhoneBook(HashMap<String, List<Long>> pb){
        for (Map.Entry<String, List<Long>> item : pb.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
