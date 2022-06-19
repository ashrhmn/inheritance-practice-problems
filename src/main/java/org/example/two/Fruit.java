package org.example.two;

public class Fruit {
    public static void totalFruit(Basket basket){
        int n = basket.getApples()+basket.getMangoes();
        System.out.println("Total Fruits : "+n);
    }
}
