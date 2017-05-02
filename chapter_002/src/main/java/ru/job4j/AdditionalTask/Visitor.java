package ru.job4j.AdditionalTask;
import java.util.Random;

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
    private boolean calculated = false;

    /**
     * method initTime.
     */
    public void initTime() {
        Random rnd = new Random(System.currentTimeMillis());
        in = rnd.nextInt(720);
        out = in + rnd.nextInt(720 - in + 1);
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
