package assigments_arrays;

import java.util.Arrays;

public class assigment_nine {
    public static void main(String[] args) {
        String names[]={"Marek","Erik","Bilbo"};
        System.out.println(Arrays.toString(names));
        System.out.println("expanded array: ");
        names=addNameToArray(names, "Fredrik");
        for(String name:names){
            System.out.print(name + " ");
        }




    }


    public static String[] addNameToArray(final String[] source, String name){
        String[] newArray = Arrays.copyOf(source, source.length +1);
        newArray[newArray.length -1] =name;
        return newArray;


    }


}
