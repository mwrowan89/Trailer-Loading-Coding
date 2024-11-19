package org.example;

import java.util.HashMap;
import java.util.Map;

public class Shapes {
    public Map<String, int[][]> shapes = new HashMap<>();;

    public Map<String, int[][]> getShapes() {
        //TODO fix shape sizing and spacing;
        //TODO S, Z, L, J
        shapes.put("O", new int[][]{{1, 1}, {1, 1}});
        shapes.put("I", new int[][]{{1},{1},{1},{1}});
        shapes.put("S", new int[][]{{0,1},{1,1},{1,0}});
        shapes.put("Z", new int[][]{{1,0},{1,1},{0,1}});
        shapes.put("L", new int[][]{{1,1},{1,0},{1,0},{1,0}});
        shapes.put("J", new int[][]{{1,1},{0,1},{0,1},{0,1}});
        shapes.put("T", new int[][]{{0, 1, 0}, {1, 1, 1}});

        return shapes;
    }
}
