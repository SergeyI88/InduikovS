package ru.job4j.chess;

/**
 * Created by admin on 01.05.2017.
 */
public abstract class Figure {
    /**
     * @param Cell.
     */
    private Cell position;

    /**
     * Конструктор.
     * @param position first
     */
    public Figure(Cell position) {
    this.position = position;
    }

    /**
     * method way.
     * @param dist first
     * @throws ImposibleMoveException first
     * @return cell
     */
    abstract Cell[] way(Cell dist) throws ImposibleMoveException;
}
