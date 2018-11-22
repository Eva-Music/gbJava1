package ru.mashova.se;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class MainClass
{
    public static void main( String[] args )
    {
       Cat cat = new Cat("Ioann", 7);
       Cat cat2 = new Cat("Vasiliy", 9);
       Cat cat3 = new Cat("Lana", 5);
       Plate plate = new Plate(20);

        ArrayList<Cat> arrayCats = new ArrayList<Cat>();
        arrayCats.add(cat);
        arrayCats.add(cat2);
        arrayCats.add(cat3);

        for (Cat arrayCat : arrayCats) {
            plate.info(arrayCat,plate);
            cat.eat(plate, arrayCat);
            plate.info(arrayCat,plate);
        }
    }
}
