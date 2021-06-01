package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class AppBox {

    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Box<Orange> boxOrange = new Box<>(orange1, orange2, orange3);
        Box<Apple> boxApple = new Box<>(apple1, apple2, apple3);
        System.out.println(orange1.WEIGHT);
        System.out.println(boxOrange.getWeight());
        System.out.println(boxApple.getWeight());
        //boxApple.toAdd(apple4);
        //System.out.println(boxApple.getWeight());

        System.out.println(boxOrange.compare(boxApple));
        System.out.println(boxOrange.getFruits());
        System.out.println(boxOrange.getElements());


    }



    public void getInfo(Fruit[] fruits){
        for (int i=0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }

}
