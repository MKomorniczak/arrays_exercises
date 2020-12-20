package assigments_arrays;

import java.util.Arrays;

public class assigment_two {
    public static void main(String[] args) {
        indexOf();

    }

    public static void indexOf(){
        int numbers[]={10,11,12,13,14,15};
        int indexFound= Arrays.binarySearch(numbers, 12);
        int indexNotFound=Arrays.binarySearch(numbers,212);
        indexNotFound = -1;

        System.out.println("index position of 12 is " + indexFound );
        System.out.println("No match " +indexNotFound);


    }



}
