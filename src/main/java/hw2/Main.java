package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1.
//        String human =  "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
//        SQL_Request request = new SQL_Request();
//        System.out.println(request.human(human));
        //2.
        int[] numArray = new int[] {1,8,7,6,5,3,4,2,9};
        System.out.println(Arrays.toString(numArray));
        BubbleSortWithLog bubbleSort = new BubbleSortWithLog();
        System.out.println(Arrays.toString(bubbleSort.bubble(numArray)));
//

        }
    }
