package ru.mashkova.se;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
    }

    public Cat(){
    }

    @Override
    public void run(int metres){
        System.out.println(name + " runs: " + metres + " " + String.valueOf(truth(metres, 200)));
    }

    @Override
    public void jump(double height){
        System.out.println(name + "'s height of jump: " + height+ " " + String.valueOf(truth(height, 2.0)));
    }

    public void swim(){
        System.out.println("Cats can't swim!");
    }
}
