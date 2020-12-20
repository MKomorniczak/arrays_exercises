package assigments_arrays;

import java.util.Arrays;

public class assigment_seven {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 7, 8, 10, 15, 22, 37, 99};
        System.out.println(Arrays.toString(a));
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

    }
}