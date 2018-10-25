package ru.mashkova.se;

public class FirstTask {

    public static int getRandomNumber(int a) {
        return 0 + (int) (Math.random() * a);
    }

    public static void guessNumber() {
        int randomNumber = getRandomNumber(9);
        for (int i = 0; i < 3; i++) {
            System.out.println("Write a number from 0 to 9:");
            int answer = App.sc.nextInt();
            if (i == 2 && answer != randomNumber) {
                System.out.println("Sorry but you lose. Do you want to play again? Write 1 for 'YES' and write 0 for 'NO'");
                int answerVictory = App.sc.nextInt();
                if (answerVictory == 0) {
                    break;
                } else if (answerVictory == 1) {
                    guessNumber();
                }
            } else if (answer == randomNumber) {
                System.out.println("You're right! Do you want to play again? Write 1 for 'YES' and write 0 for 'NO'");
                int answerVictory = App.sc.nextInt();
                if (answerVictory == 0) {
                    break;
                } else if (answerVictory == 1) {
                    guessNumber();
                }
            } else if (answer > randomNumber) {
                System.out.println("Your number is bigger than random. Try again.");
            } else {
                System.out.println("Your number is smaller than random. Try again.");
            }
        }
    }
}
