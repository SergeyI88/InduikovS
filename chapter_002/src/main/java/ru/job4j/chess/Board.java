package ru.job4j.chess;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by admin on 01.05.2017.
 */
public class Board {
    /**
     * @param figures.
     */
    private Figure[] figures;
    /**
     * @param cells.
     */
    private Cell[][] cells = new Cell[8][8];
    /**
     * method move.
     * @param source first
     * @param dist second
     * @throws ImposibleMoveException first
     * @throws OccupiedWayException second
     * @throws FigureNotFoundException third
     * @return true
     */
    public boolean move(Cell source, Cell dist) throws ImposibleMoveException, OccupiedWayException, FigureNotFoundException {
        return true;
    }

    /**
     * method init.
     */
    public void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j].setRow(i);
                cells[i][j].setColl(j);
            }
        }
        for (int i = 1; i >= 0; i--) {
            for (int j = 0; j < cells.length; j++) {
                if (i == 1) {
                    figures[j] = new Pawn(cells[i][j]);
                }
            }
        }

    }

    public static void main(String[] args) {
       List<Integer> list = new LinkedList<>();
       list.add(2);
    }

}
