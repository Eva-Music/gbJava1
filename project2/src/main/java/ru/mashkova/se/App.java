package ru.mashkova.se;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 0;

        for (int l = 1; l < array.length; l++) {
            if (array[l - 1] == 0) {
                array[l] = 1;
            } else {
                array[l] = 0;
            }
        }
        System.out.println("Task #1");
        System.out.print("BEFORE: ");
        System.out.println(Arrays.toString(array));

        for (int m = 0; m < array.length; m++) {
            if (array[m] == 0) {
                array[m] = 1;
            } else {
                array[m] = 0;
            }
        }
        System.out.print("AFTER: ");
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Task #2");
        int[] array2 = new int[8];
        array2[0] = 0;
        for (int h = 1; h < array2.length; h++) {
            array2[h] = array2[h - 1] + 3;
        }
        System.out.println(Arrays.toString(array2));
        System.out.println();

        System.out.println("Task #3");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("BEFORE: ");
        System.out.println(Arrays.toString(array3));
        for (int y = 0; y < array3.length; y++) {
            if (array3[y] < 6) {
                array3[y] = array3[y] * 6;
            }
        }
        System.out.print("AFTER: ");
        System.out.println(Arrays.toString(array3));
        System.out.println();

        System.out.println("Task #4");
        int[][] array4 = new int[3][3];
        for (int w = 0; w < 3; w++) {
            for (int e = 0; e < 3; e++) {
                if (e == w || e - w == 2 || w - e == 2) {
                    array4[w][e] = 1;
                } else {
                    array4[w][e] = 0;
                }
            }
        }

        for (int g = 0; g < 3; g++) {
            for (int v = 0; v < 3; v++) {
                System.out.print(array4[g][v] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task #5");
        int[] array5 = new int[5];
        System.out.println("Insert 5 numbers: ");
        for (int k = 0; k < 5; k++) {
            array5[k] = sc.nextInt();
        }

        int min = array5[0];
        for (int t = 0; t < 5; t++) {
            if (min > array5[t]) {
                min = array5[t];
            }
        }

        int max = array5[0];
        for (int t = 0; t < 5; t++) {
            if (max < array5[t]) {
                max = array5[t];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println();

        System.out.println("Task #6");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("How many numbers you want to put in the array?");
        int count = sc.nextInt();
        System.out.println("Put numbers in the array: ");
        for (int i = 0; i < count; i++) {
            int k = sc.nextInt();
            list.add(i, k);
        }
        System.out.println(checkBalance(list));

    }

    public static boolean checkBalance(ArrayList<Integer> list) {
        int size = list.size();
        int team = size / 2;
        int score1 = 0;
        int score2 = 0;
        if (size % 2 == 0) {
            for (int i = 0; i < team; i++) {
                score1 = score1 + list.get(i);
            }
        } else {
            for (int i = 0; i < team + 1; i++) {
                score1 = score1 + list.get(i);
            }
        }

        if (size % 2 == 0) {
            for (int i = size - 1; i > team - 1; i--) {
                score2 = score2 + list.get(i);
            }
        } else {
            for (int i = size - 1; i > team; i--) {
                score2 = score2 + list.get(i);
            }
        }

        if (score1 == score2) {
            return true;
        } else {
            return false;
        }

    }

}
