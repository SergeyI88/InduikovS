package ru.job4j.AdditionalTask;;

/**
 * Created by admin on 02.05.2017.
 */
public class Visitor {
    /**
     * @ param in
     */
    private int in;
    /**
     * @param out
     */
    private int out;
    /**
     * @param calculated
     */
    private boolean calculated = true;

    /**
     * Конструктор.
     * @param in first
     * @param out second
     */
    public Visitor(int in, int out) {
        this.in = in;
        this.out = out;
    }
    /**
     * method getOut.
     * @return out
     */
    public int getOut() {
        return out;
    }
    /**
     * method getIn.
     * @return in
     */
    public int getIn() {
        return in;
    }
    /**
     * method getCalculated.
     * @return calculated
     */
    public boolean getCalculated() {
        return calculated;
    }
    /**
     * method getCalculated.
     * @param calculated first
     */
    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }
}
