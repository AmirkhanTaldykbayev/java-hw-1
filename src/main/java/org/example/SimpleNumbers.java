package org.example;

public class SimpleNumbers {
    public String simpleNum(int number) {
        String result = "";
        int num = 0;
        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                result = result + i + " ";
            }
        }
        return result;
    }

}
