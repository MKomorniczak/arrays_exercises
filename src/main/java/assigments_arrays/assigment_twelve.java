package assigments_arrays;


class assigment_twelve{

    static void printPrincipalDiagonal(int mat[][], int n)
    {
        System.out.print("Principal Diagonal: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }

    public static void main(String args[])
    {
        int n = 3;
        int a[][] = { { 1, 2, 3,},
                { 2,4,6 },
                { 3,6,9 }};


        printPrincipalDiagonal(a, n);
    }
}