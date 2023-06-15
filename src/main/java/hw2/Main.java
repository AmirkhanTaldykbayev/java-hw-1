package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Решено
        String man =  "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        SQL_Request sqlReq = new SQL_Request();
        System.out.println(sqlReq.human(man));

        //2. Решено
//        int[] numArray = new int[] {1,8,7,6,5,3,4,2,9};
//        BubbleSortWithLog sort = new BubbleSortWithLog();
//        sort.bubbleSort(numArray);
//        System.out.println(Arrays.toString(numArray));


        }
    }

