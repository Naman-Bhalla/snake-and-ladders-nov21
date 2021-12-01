package dev.naman.models;

public class Ladder extends Cell {
    private int startIndex;
    private int endIndex;

    Ladder(int startIndex, int endIndex) {
        super(CellType.LADDER);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public int nextLocation() {
        return this.endIndex;
    }
}
