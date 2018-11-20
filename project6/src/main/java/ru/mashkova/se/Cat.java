package ru.mashkova.se;

public class Cat extends Animal {

    public Cat(String name){
        this.name = name;
    }

    public Cat(){

    }

    @Override
    public void run(int metres){
        boolean truth = metres < Math.random()*400 && metres > 0 ? true : false;
        System.out.println(name + " runs: " + metres + " " + String.valueOf(truth));
    }

    @Override
    public void jump(double height){
        boolean truth = height <  Math.random()*6 && height > 0 ? true : false;
        System.out.println(name + "'s height of jump: " + height+ " " + String.valueOf(truth));
    }

    public void swim(){
        System.out.println("Cats can't swim!");
    }
}
