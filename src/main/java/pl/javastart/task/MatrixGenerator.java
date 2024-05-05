package pl.javastart.task;

import java.util.Scanner;

public class MatrixGenerator {
    private final Scanner scanner = new Scanner(System.in);

    public int[][] createMatrix() {
        int rowNumber;
        int columnNumber;
        System.out.println("Podaj dodatnią liczbę wierszy nie większą niż 100");
        do {
            rowNumber = scanner.nextInt();
        } while (!isNumberBetweenOneAndOneHundred(rowNumber));

        System.out.println("Podaj dodatnią liczbę kolumn nie większą niż 100");
        do {
            columnNumber = scanner.nextInt();
        } while (!isNumberBetweenOneAndOneHundred(columnNumber));
        return new int[rowNumber][columnNumber];
    }

    public void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = row * col;
                System.out.printf(" %5d |", matrix[row][col]);
            }
            System.out.println();
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print("--------");
            }
            System.out.println();
        }
    }

    private boolean isNumberBetweenOneAndOneHundred(int number) {
        if (number <= 100 && number > 0) {
            return true;
        } else {
            System.out.println("Niepoprawna liczba");
            return false;
        }
    }
}