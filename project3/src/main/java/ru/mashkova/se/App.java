package ru.mashkova.se;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("I want to play a game. ");
       FirstTask.guessNumber();

        System.out.println();
        System.out.println("I want to play another a game. ");
        SecondTask.guessWord();
    }


}
