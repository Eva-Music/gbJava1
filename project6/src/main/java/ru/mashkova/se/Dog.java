package ru.mashkova.se;

public class Dog extends Animal{

    public Dog(){

    }

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void run(int metres){
        boolean truth = 0 < metres && metres <  Math.random()*700? true : false;
        System.out.println(name +" runs: " + metres + " " + String.valueOf(truth));
    }

    @Override
    public void jump(double height){
        boolean truth = height <  Math.random()*3 && height > 0 ? true : false;
        System.out.println(name +"'s height of jump: "+ height+" " + String.valueOf(truth));
    }

    @Override
    public void swim(int metres){
        boolean truth = 0 < metres && metres <  Math.random()*15 ? true : false;
        System.out.println(name + " swims: " + metres + " " + String.valueOf(truth));
    }
}
