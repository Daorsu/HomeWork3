package HomeWork1;

import java.util.Arrays;
import java.util.List;

public class Box<F extends Fruit> {
    private final F[] fruits;
    //private List<F> fruits;


    public Box(F... fruit) {
        //List<F> list = new ArrayList<>();
        this.fruits = fruit;
    }


    public List<? extends F> toAdd(){
        return Arrays.asList(fruits);
    }


    public boolean compare(Box<? extends Fruit> another) {  // ? можно сравнивать массивы разных типов
        return (this.getWeight() == another.getWeight());
    }

    public F[] getFruits() {
        return fruits;
    }

    public List<F> getElements(){
        return Arrays.asList(fruits);
    }

    float  getWeight() {
        float weight = 0.0f;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] instanceof Orange) {
                weight += Orange.WEIGHT;
            } else if (fruits[i] instanceof Apple) {
                weight += Apple.WEIGHT;
            }
        }
            return weight;
    }
}
