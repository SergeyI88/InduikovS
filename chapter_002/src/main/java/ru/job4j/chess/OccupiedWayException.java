package ru.job4j.chess;

/**
 * Created by admin on 01.05.2017.
 */
public class OccupiedWayException extends Exception {
    /**
     * Конструктор.
     * @param msg first
     */
    public OccupiedWayException(String msg) {
    super(msg);
    }
}
