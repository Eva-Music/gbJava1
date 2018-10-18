package ru.mashkova.se;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        byte z = 2;
        short v = 4;
        int n = 6;
        long o = 8;
        float e = 53.7f;
        double f = 34.521;
        boolean g = true;
        char h = 'C';
        String i = "ABCD";

        System.out.println(count(3,5,7,4));
        System.out.println(check(5,7));
        number(-20);
        System.out.println(checkNeg(5));
        hello("Olya");
        year(1944);


    }

    public static int count(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean check(int a, int b){
        if (a+b >= 10 && a+b <= 20 ) {
            return true;
        } else {
            return false;
        }
    }

    public static void number(int a){
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean checkNeg(int a){
        if (a < 0){
            return true;
        }else {
            return false;
        }
    }

    public static void hello(String a){
        System.out.println("Hello, " + a + "!");
    }

    public static void year(int a){
        if ( a % 4 == 0 || a % 400 == 0 && a % 100 != 0 ) {
            System.out.println("Високосный");
        } else {
            System.out.println("невисокосный");
        }
    }

}
