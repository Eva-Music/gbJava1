package ru.mashkova.se;

public class SecondTask {
    public static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void guessWord() {
        String none = App.sc.nextLine();
        int randomIndex = FirstTask.getRandomNumber(words.length);
        System.out.println("Guess a word that I chose");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }

        System.out.println();
        while (true) {
            System.out.println();
            System.out.println("Write your answer:");
            String answer = App.sc.nextLine();

            int length = 0;

            if (answer.length() <= words[randomIndex].length()) {
                length = answer.length();
            } else {
                length = words[randomIndex].length();
            }

            if (answer.equals(words[randomIndex])) {
                System.out.println("You're right!");
                break;
            }

            for (int i = 0; i < length; i++) {
                char ansCh = answer.charAt(i);
                char randCh = words[randomIndex].charAt(i);
                if (ansCh == randCh) {
                    System.out.print(ansCh);
                } else if (ansCh != randCh) {
                    System.out.print("#");
                } else {
                    System.out.print("#");
                }
            }
            for (int i = 0; i < 15 - length; i++) {
                System.out.print("#");
            }
        }
    }
}


