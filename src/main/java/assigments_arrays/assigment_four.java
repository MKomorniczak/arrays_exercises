package assigments_arrays;

import java.util.Arrays;

public class assigment_four {
    public static void main(String[] args) {
        int[] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, 3);
        System.out.println("original array " +Arrays.toString(array1));
        for (int number : array2) {
            System.out.println("copied array ;");
            System.out.println(number);


        }


    }
}
