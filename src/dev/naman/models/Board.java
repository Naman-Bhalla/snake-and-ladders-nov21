package dev.naman.models;

import java.util.List;
import java.util.Map;

public class Board {
    private int size;
    private List<Cell> cells;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Map<CellType, List<Cell>> specialCells;
}
