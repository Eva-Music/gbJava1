package ru.mashkova.se;

public class Dog extends Animal{

    public Dog(){

    }

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void run(int metres){
        System.out.println(name +" runs: " + metres + " " + String.valueOf(truth(metres, 500)));
    }

    @Override
    public void jump(double height){
        System.out.println(name +"'s height of jump: "+ height+" " + String.valueOf(truth(height, 0.5)));
    }

    @Override
    public void swim(int metres){
        System.out.println(name + " swims: " + metres + " " + String.valueOf(truth(metres, 10)));
    }
}
