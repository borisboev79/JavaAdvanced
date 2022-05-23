package Advanced_Exercise2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ADV_EXS04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] rowInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = rowInput;
        }

        int maxSum = Integer.MIN_VALUE;

        int berstStartingRow = -1;
        int berstStartingCol = -1;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > maxSum) {
                    maxSum = sum;
                    berstStartingRow = row;
                    berstStartingCol = col;
                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);

        for (int row = berstStartingRow; row < berstStartingRow + 3; row++) {
            for (int col = berstStartingCol; col < berstStartingCol + 3; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }
    }
}
