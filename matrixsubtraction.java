public class MatrixSubtraction {

    public static void main(String[] args) {

        int[][] a = {{8, 6}, {5, 4}};
        int[][] b = {{3, 2}, {1, 1}};
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                result[i][j] = a[i][j] - b[i][j];

                System.out.print(result[i][j] + " ");

            }

            System.out.println();

        }

    }

}
