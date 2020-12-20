package assigments_arrays;

import java.util.Arrays;

public class assigment_three {
    public static void main(String[] args) {
        sortTest();


    }
    public static void sortTest(){
        String[] cities={"Stockholm","Paris","London","New York"};

        Arrays.sort(cities);
        for (String name : cities){
            System.out.println(name);
        }

    }






}
