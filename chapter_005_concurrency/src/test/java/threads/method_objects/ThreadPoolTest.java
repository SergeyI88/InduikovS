package threads.method_objects;

import methods_objects.Counter;
import methods_objects.ForGetResult;
import methods_objects.ThreadPool;
import org.ibex.nestedvm.Runtime;
import org.junit.Test;

import java.util.ArrayList;

public class ThreadPoolTest {
    @Test
    public void weSeeHowCanAppToWorkFastlyWithAcceptMultiTreding() {
        Long time = System.nanoTime();
        ThreadPool threadPool = new ThreadPool(java.lang.Runtime.getRuntime().availableProcessors() +  1);
        Counter counter = new Counter();
        ArrayList<ForGetResult> results = new ArrayList<>();
        double d = 0.0;
        double value = 0.0;
        for (int i = 0; i < 400; i++) {
            results.add(new ForGetResult(counter, d++));
        }
        for (int i = 0; i < 400; i++) {
            threadPool.execute(results.get(i));
        }
        try {
            threadPool.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 400; i++) {
            value += results.get(i).getResult();
        }
        System.out.printf("Executed by %d s : result : %s",
                (System.nanoTime() - time) / (1000_000_000), value);
    }
}

