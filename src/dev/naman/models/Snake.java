package dev.naman.models;

public class Snake extends Cell {
    private int startIndex;
    private int endIndex;

    Snake(int startIndex, int endIndex) {
        super(CellType.SNAKE);
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public int nextLocation() {
        return endIndex;
    }
}
