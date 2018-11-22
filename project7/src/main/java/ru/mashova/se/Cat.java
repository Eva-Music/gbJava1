package ru.mashova.se;

public class Cat {
    private int appetite;
    private String name;
    private boolean isFull = false;

    public Cat(String name, int appetite){
        this.appetite = appetite;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return this.appetite;
    }

    public void eat(Plate p, Cat cat){
        p.decreaseFood(cat);
    }

    public boolean isSatisfied(Plate p){

        if (p.getMealCount() > 0) {
            p.decreaeMealCount();
            return isFull = true;
           } else {
            return false;
        }
    }
}
