package HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        String[] arrayString = {"1", "2", "3", "4", "5",};
        swapElementArray(array, 0, 3);
        transformArrayList(arrayString);
    }


    public static void transformArrayList(String[] array){
        List<String> newArrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(newArrayList);
    }


    /**
     * Метод меняющий 2 элемента массива местами.
     * @param array
     * @param firstNumber
     * @param twoNumber
     */
    public static void swapElementArray(int[] array, int firstNumber, int twoNumber){
        int swap;
        for(int i = 0; i < array.length; i++){
            swap = array[firstNumber];
            array[firstNumber] = array[twoNumber];
            array[twoNumber] = swap;
        }
        System.out.println(Arrays.toString(array));
    }

}
