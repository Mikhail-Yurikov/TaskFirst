package massive;

import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        System.out.println("На сколько градусов вам перевернуть матрицу?");
        Scanner scanner = new Scanner(System.in);
        int degrees = scanner.nextInt();
        switch (degrees) {
            case 90:
                turn90(createMatrix());
                break;
            case 180:
                turn180(createMatrix());
                break;
            case 270:
                turn270(createMatrix());
                break;
            default:
                System.out.println("Так я не умею!");
                break;
        }
    }

    public static int[][] createMatrix() {
        int[][] colors = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        return colors;
    }

    public static void showMatrix(int[][] colors) {
        System.out.println("Исходная матрица:");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void turn90(int[][] colors) {
        showMatrix(colors);
        int[][] rotedColors = new int[SIZE][SIZE];
        System.out.println("Перевернутая матрица:");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotedColors[i][j] = colors[SIZE - 1 - j][i];
                System.out.format("%4d", rotedColors[i][j]);
            }
            System.out.println();
        }
    }

    public static void turn180(int[][] colors) {
        showMatrix(colors);
        int[][] rotedColors = new int[SIZE][SIZE];
        System.out.println("Перевернутая матрица:");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                System.out.format("%4d", rotedColors[i][j]);
            }
            System.out.println();
        }
    }

    public static void turn270(int[][] colors) {
        showMatrix(colors);
        int[][] rotedColors = new int[SIZE][SIZE];
        System.out.println("Перевернутая матрица:");
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotedColors[i][j] = colors[j][SIZE - 1 - i];
                System.out.format("%4d", rotedColors[i][j]);
            }
            System.out.println();
        }
    }
}
