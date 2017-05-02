package ru.job4j.chess;

/**
 * Created by admin on 01.05.2017.
 */
public class FigureNotFoundException extends Exception {
    /**
     * Конструктор.
     * @param msg first
     */
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}