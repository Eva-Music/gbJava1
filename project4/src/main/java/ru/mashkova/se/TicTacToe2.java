package ru.mashkova.se;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe2 {

    public static final char CH_0 = '0';
    public static final char CH_X = 'X';
    public static final char CH_DOT = '.';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int fieldSize;
    public static char[][] field;

    public static void main(String[] args) {
        createField();
        printField();
        do {
            humanMove();
            getFull();
            aiMove();
        } while (!checkResult(CH_0) || !checkResult(CH_X));
    }

    public static boolean getFull() {
        int fieldSpot = 0;
        for (int x = 0; x < fieldSize; x++) {
            for (int y = 0; y < fieldSize; y++) {
                if (field[y][x] == CH_DOT) fieldSpot += 0;
                if (field[y][x] != CH_DOT) fieldSpot++;
            }
        }
        if (fieldSpot == Math.pow(fieldSize, 2)) {
            System.out.println("The field is full");
            System.exit(0);
        }
        return true;
    }

    public static void createField() {
        System.out.println("Choose the field size: from 3 to 10");
        fieldSize = sc.nextInt();
        field = new char[fieldSize][fieldSize];

        for (int x = 0; x < fieldSize; x++) {
            for (int y = 0; y < fieldSize; y++) {
                field[y][x] = CH_DOT;
            }
        }
    }

    public static void printField() {
        System.out.println();
        for (int i = 0; i < fieldSize + 1; i++) {
            System.out.print(i + " ");
        }

        for (int x = 0; x < fieldSize; x++) {
            System.out.println();
            System.out.print(x + 1 + " ");
            for (int y = 0; y < fieldSize; y++) {
                System.out.print(field[x][y] + " ");
            }
        }
    }

    public static void aiMove() {
        int aiX = rand.nextInt(fieldSize);
        int aiY = rand.nextInt(fieldSize);

        while (checkSpace(aiY, aiX) == false) {
            aiX = rand.nextInt(fieldSize);
            aiY = rand.nextInt(fieldSize);
            if (checkSpace(aiY, aiX) == true) break;
        }

        System.out.println();
        System.out.println("AI chose: X = " + (aiX + 1) + ", and Y = " + (aiY + 1));
        field[aiY][aiX] = CH_0;

        printField();

        if (checkResult(CH_0)) {
            System.out.println("AI won!");
            System.exit(0);
        }
    }

    public static void humanMove() {
        System.out.println();
        System.out.println("Write down 2 coordinates X and Y to make your move: ");
        int humanX = sc.nextInt();
        int humanY = sc.nextInt();
        System.out.println();

        while (checkSpace(humanY - 1, humanX - 1) == false) {
            System.out.println("This field is taken. Write down 2 coordinates X and Y to make your move: ");
            humanX = sc.nextInt();
            humanY = sc.nextInt();
        }

        field[humanY - 1][humanX - 1] = CH_X;
        printField();
        if (checkResult(CH_X) == true) {
            System.out.println("Human won!");
            System.exit(0);
        }
    }

    public static boolean checkSpace(int y, int x) {
        if (field[y][x] != CH_DOT) return false;
        return true;
    }

    public static boolean checkResult(char ch) {
        if (checkLines(ch) || checkDiagonal(ch)) return true;
        return false;

    }

    public static boolean checkDiagonal(char ch) {
        boolean toLeft = true;
        boolean toRight = true;

        for (int x = 0; x < fieldSize; x++) {
            toRight &= (field[x][x] == ch);
        }
        if (toRight == true) return true;

        int y = 0;
        for (int x = fieldSize - 1; x >= 0; x--) {
            toLeft &= (field[y][x] == ch);
            y++;
        }
        if (toLeft == true) return true;
        return false;
    }

    public static boolean checkLines(char ch) {
        boolean lineHorizontal = true;
        boolean lineVertical = true;

        for (int x = 0; x < fieldSize; x++) {
            for (int y = 0; y < fieldSize; y++) {
                lineHorizontal &= (field[y][x] == ch);
                lineVertical &= (field[x][y] == ch);
            }
            if (lineHorizontal == true) return true;
            if (lineVertical == true) return true;
            lineHorizontal = true;
            lineVertical = true;
        }
        return false;
    }
}
