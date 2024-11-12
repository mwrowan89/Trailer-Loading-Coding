package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static int rows = 52;
    public static int cols = 10;
    public static String[][] truck = buildTruck(rows, cols);

    public Program() {

    }

    public static void program() {
    }

    private static String[][] buildTruck(int rows, int cols) {
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assert truck != null;
                truck[i][j] = "0";
            }
        }
        return truck;
    }

    private static void printTruck(int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("  " + truck[i][j] + "");
            }
        }
    }

    }


