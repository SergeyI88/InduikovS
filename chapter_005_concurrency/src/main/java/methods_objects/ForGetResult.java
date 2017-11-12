package methods_objects;

public class ForGetResult implements Runnable {

    Double d;
    Counter counter;
    Double result = 0.0;

    public ForGetResult(Counter counter, Double d) {
        this.d = d;
        this.counter = counter;
    }


    @Override
    public void run() {
        result = counter.count(d);
    }

    public Double getResult() {
        return result;
    }
}
