package org.example;

import java.util.HashMap;
import java.util.Map;

public class Shapes {
    public Map<String, int[][]> shapes = new HashMap<>();

    public Map<String, int[][]> getShapes() {
        //Initialization of shape definitions and sizing

        shapes.put("O", new int[][]{{1, 1}, {1, 1}});
        shapes.put("I", new int[][]{{1},{1},{1},{1}});
        shapes.put("S", new int[][]{{1,1,0},{0,1,1}});
        shapes.put("Z", new int[][]{{0,1,1},{1,1,0}});
        shapes.put("L", new int[][]{{1,1},{0,1},{0,1},{0,1}});
        shapes.put("J", new int[][]{{1,1},{1,0},{1,0},{1,0}});
        shapes.put("T", new int[][]{{0, 1, 0}, {1, 1, 1}});
        shapes.put("X", new int[][]{{1, 0, 1}, {0, 1, 0}, {1, 0, 1}});

        return shapes;
    }
}
