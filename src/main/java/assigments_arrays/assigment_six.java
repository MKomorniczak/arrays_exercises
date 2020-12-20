package assigments_arrays;

public class assigment_six {
    public static void main(String[] args) {
                double[] numbers = {43, 5, 23, 17, 2, 14};
                double total = 0;

                for(int i=0; i<numbers.length; i++){
                    total = total + numbers[i];
                }

                double average = total / numbers.length;

                System.out.format("The average is:" + average);
            }
        }