package ru.mashkova.se;

public class Animal {
    protected String name;

    public void run(int metres){
        System.out.print("Animal runs: " + metres);
    }

    public void swim(int metres){
        System.out.print("Animal swims: " + metres);
    }

    public  void jump(double height){
        System.out.print("Animal's height of jump: "+ height);
    }

    public boolean truth(int number, int max){
        return number < Math.random()*max && number > 0 ? true : false;
    }
    public boolean truth(double number, double max){
        return number < Math.random()*max && number > 0 ? true : false;
    }


}
