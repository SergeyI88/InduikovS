package ru.job4j.chess;

/**
 * Created by admin on 01.05.2017.
 */
public class ImposibleMoveException extends Exception {
    /**
     * Конструктор.
     * @param msg first
     */
    public ImposibleMoveException(String msg) {
        super(msg);
    }
}
