package pl.javastart.task;

import java.util.Scanner;

public class MatrixGenerator {
    private final Scanner scanner = new Scanner(System.in);
    private int[][] matrix;
    private int rowNumber;
    private int columnNumber;

    public void generate() {
        createMatrix();
        printMatrix();

    }

    private void createMatrix() {
        System.out.println("Podaj dodatnią liczbę wierszy nie większą niż 100");
        do {
            rowNumber = scanner.nextInt();
        } while (!isNumberBetweenOneAndOneHundred());

        System.out.println("Podaj dodatnią liczbę kolumn nie większą niż 100");
        do {
            columnNumber = scanner.nextInt();
        } while (!isNumberBetweenOneAndOneHundred());
        matrix = new int[rowNumber][columnNumber];
    }

    private void printMatrix() {
        for (int row = 0; row < rowNumber; row++) {
            for (int col = 0; col < columnNumber; col++) {
                matrix[row][col] = row * col;
                System.out.printf(" %5d |", matrix[row][col]);
            }
            System.out.println();
            for (int col = 0; col < columnNumber; col++) {
                System.out.print("--------");
            }
            System.out.println();
        }
    }

    private boolean isNumberBetweenOneAndOneHundred() {
        if (rowNumber <= 100 && rowNumber > 0) {
            return true;
        } else {
            System.out.println("Niepoprawna liczba");
            return false;
        }
    }
}