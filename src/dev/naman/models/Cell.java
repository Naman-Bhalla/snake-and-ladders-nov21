package dev.naman.models;

import java.util.List;

public abstract class Cell extends BaseModel {
    private int index;
    private CellType type;
    private List<Piece> pieces;

    public void setIndex(int index) {
        this.index = index;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    Cell(CellType type) {
        this.type = type;
    }

    public abstract int nextLocation();

    public int getIndex() {
        return index;
    }
}

// implement a class that is bound to have multiple subclasses
// from every child you will be easily able to get the type
