package dev.naman.models;

import java.util.List;

public abstract class Cell {
    private int index;
    private CellType type;
    private List<Piece> pieces;

    Cell(CellType type) {
        this.type = type;
    }

    public abstract int nextLocation();

    public int getIndex() {
        return index;
    }
}
