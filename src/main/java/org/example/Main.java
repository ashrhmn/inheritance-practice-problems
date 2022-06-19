package org.example;

import org.example.five.*;
import org.example.one.BlueWhale;
import org.example.one.Mammals;
import org.example.one.MarineAnimals;
import org.example.two.Apple;
import org.example.two.Basket;
import org.example.two.Fruit;
import org.example.two.Mango;

public class Main {
    public static void main(String[] args) {
        // 1
        Mammals mammals = new Mammals();
        MarineAnimals marineAnimals = new MarineAnimals();
        BlueWhale blueWhale = new BlueWhale();
        mammals.mammalSay();
        marineAnimals.marineSay();
        blueWhale.blueWhaleSay();
        blueWhale.marineSay();
        blueWhale.mammalSay();

        //  2
        Basket basket1 = new Basket(5,10);
        Basket basket2 = new Basket(12,9);

        Fruit.totalFruit(basket1);
        Fruit.totalFruit(basket2);
        Mango.totalMangoes(basket1);
        Mango.totalMangoes(basket2);
        Apple.totalApples(basket1);
        Apple.totalApples(basket2);

        //  5
        new Shape().print();
        new Polygon().print();
        new Rectangle().print();
        new Triangle().print();
        new Square().print();
    }
}