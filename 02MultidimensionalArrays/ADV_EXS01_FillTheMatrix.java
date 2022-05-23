package Advanced_Exercise2_MultidimensionalArrays;

import java.util.Scanner;

public class ADV_EXS01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[n][n];
        int counter = 1;
        if (pattern.equals("A")) {
            //for each coloumn iterate over every row

            for (int col = 0; col < n; col++) {
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        } else if (pattern.equals("B")) {
            //for each column iterate over each row

            for (int col = 0; col < n; col++) {

                if (counter % 2 != 0) {
                    for (int row = 0; row < n; row++) {
                        matrix[row][col] = counter;
                        counter++;

                    }
                } else {

                    for (int row = n - 1; row >= 0; row--) {
                        matrix[row][col] = counter;
                        counter++;

                    }
                }
            }
        }

        //print

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

