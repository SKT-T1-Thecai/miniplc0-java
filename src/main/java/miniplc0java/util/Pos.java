package miniplc0java.util;

import java.util.Objects;

public class Pos {
    public Pos(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int row;
    public int col;

    public Pos nextCol() {
        return new Pos(row, col + 1);
    }

    public Pos nextRow() {
        return new Pos(row + 1, 0);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Pos(row: ").append(row).append(", col: ").append(col).append(")").toString();
    }

    public static void main(String[] args) {
        Pos p1=new Pos(1,2);
        Pos p2=new Pos(1,2);

    }
}
