package ru.mashkova.se;

public class MainClass {
    public static void main(String [] args){
        Cat cat1 = new Cat("First cat");
        Cat cat2 = new Cat("Second cat");
        Dog dog1 = new Dog("First dog");
        Dog dog2 = new Dog("Second dog");

        cat1.run(150);
        cat2.run(250);
        dog1.run(350);
        dog2.run(550);

        cat1.jump(1.5);
        cat2.jump(2.8);
        dog1.jump(0.2);
        dog2.jump(1.0);

        cat1.swim();
        cat2.swim();
        dog1.swim(5);
        dog2.swim(20);
    }
}
