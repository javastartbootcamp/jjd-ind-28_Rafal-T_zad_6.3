package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        MatrixGenerator matrixGenerator = new MatrixGenerator();
        int[][] matrix = matrixGenerator.createMatrix();
        matrixGenerator.printMatrix(matrix);
    }
}
