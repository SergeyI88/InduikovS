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
        ArrayList<ForGetResult> results = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            results.add(new ForGetResult());
            threadPool.execute(results.get(i));
        }
        for (int i = 0; i < 400; i++) {

        }
        try {
            threadPool.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

