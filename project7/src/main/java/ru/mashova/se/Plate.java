package ru.mashova.se;

public class Plate {
    private int food;
    private int mealCount = 0;

    public Plate(int food){
        this.food = food;
    }

    public int getMealCount() {
        return mealCount;
    }
    public int decreaeMealCount(){
        return mealCount--;
    }

    public void decreaseFood(Cat cat){
        if (!checkFood(food, cat.getAppetite())) {
            food -= cat.getAppetite();
            mealCount++;
        } else {
            addFood();
            decreaseFood(cat);
        }
    }

    public void addFood(){
        food+=10;
        System.out.println("Food was added: " + food);
    }

    public boolean checkFood(int food,int n){
        return (food-=n) < 0;
    }

    public void info(Cat cat, Plate plate){
        System.out.println("Plate: " + food);
        System.out.println(cat.getName() + " is satisfied: " + cat.isSatisfied(plate));
    }
}
