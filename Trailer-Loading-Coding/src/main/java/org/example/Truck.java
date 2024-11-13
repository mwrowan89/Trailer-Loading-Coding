package org.example;

import java.util.HashMap;
import java.util.Map;

public class Truck {
    public String[][] truck;
    private final int rows;
    private final int cols;
    public Map<String, int[][]> shapes;

    public Truck(int rows, int cols) {
        this.truck = new String[rows][cols];
        this.cols = cols;
        this.rows = rows;
        buildTruck();
        setShapes();
        printTruck();
    }

    public void setShapes() {
        shapes = new HashMap<>();
        shapes.put("O", new int[][]{{1, 1}, {1, 1}});
        shapes.put("I", new int[][]{{1},{1},{1},{1}});
        shapes.put("S", new int[][]{{0,1},{1,1},{1,0}});
        shapes.put("Z", new int[][]{{1,0},{1,1},{0,1}});
        shapes.put("L", new int[][]{{1,1},{1,0},{1,0},{1,0}});
        shapes.put("J", new int[][]{{1,1},{0,1},{0,1},{0,1}});
        shapes.put("T", new int[][]{{0,1},{1,1},{0,1}});
    }

    public void buildTruck() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assert truck != null;
                truck[i][j] = "0";
            }
        }
    }

    public void printTruck() {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("  " + truck[i][j]);
            }
            System.out.println();
        }
    }

    public void addShape(String shape, String position) {
        if(shapes.containsKey(shape)){
            System.out.println(shape);
        }
        else
            System.out.println("Shape does not exist");
    }

    }


