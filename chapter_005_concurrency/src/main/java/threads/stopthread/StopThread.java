package threads.stopthread;

/**
 * Created by Sergey on 11.10.2017
 *
 * Class StopThread contains two main classes for task.
 */
public class StopThread {
    /**
     * Variable time - contains exemplar class Thread in which we placed exemplar class Time.
     */
    Thread time = new Thread(new Time());
    /**
     * Variable countChar - contains exemplar class Thread in which we placed exemplar class CountChar.
     */
    Thread countChar = new Thread(new CountChar());

    /**
     * method for get exemplar
     *
     * @return exemplar class Time
     */
    public Thread getTime() {
        return time;
    }

    /**
     * method for get exemplar
     *
     * @return exemplar class CountChar
     */
    public Thread getCountChar() {
        return countChar;
    }

    /**
     * Class Time count time from start program
     */
    public class Time implements Runnable {
        @Override
        public void run() {
            long start = System.currentTimeMillis();
            while (countChar.isAlive()) {
                if (System.currentTimeMillis() - start < 1000 && !time.isInterrupted()) {
                    time.interrupt();
                }
            }
        }
    }

    /**
     * Class CountChar count quantity characters
     */
    public class CountChar implements Runnable {
        @Override
        public void run() {
            String s = "fdfdf gfgfg gfg d dff df  hhhhhhhhhgfgfg fgfg fg fg gf gfg fg fg df ggfg gffgfgfffggffggggfgfg";
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (time.isInterrupted()) {
                    break;
                }
            }
        }
    }
}
