package assigments_arrays;

import java.util.Arrays;

class assigment_eight {
    public static int removeDuplicate(int numbers[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[n - 1];
        for (int i = 0; i < j; i++) {
            numbers[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int numbers[] = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        int length = numbers.length;
        length = removeDuplicate(numbers, length);
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i]+" ");
        }


    }
}
