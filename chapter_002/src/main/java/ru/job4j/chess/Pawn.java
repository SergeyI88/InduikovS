package ru.job4j.chess;

/**
 * Created by admin on 01.05.2017.
 */
public class Pawn extends Figure {
    /**
     * Constructor.
     * @param position first
     */
    public Pawn(Cell position) {
       super(position);
    }
    /**
     * method way.
     * @param dist first
     * @return Cell
     * @throws ImposibleMoveException first
     */
    public Cell[] way(Cell dist) throws ImposibleMoveException {
        Cell[] cells = new Cell[5];
        return cells;
    }

}
