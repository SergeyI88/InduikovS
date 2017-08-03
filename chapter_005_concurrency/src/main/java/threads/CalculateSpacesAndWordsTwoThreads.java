package threads;

/**
 * Class for mapping as work multithreading
 *
 * @author SergeyI
 */
public class CalculateSpacesAndWordsTwoThreads extends Thread {
    /**
     * @param string need for parsing on spaces and words
     */
    private String string;

    /**
     * Constructor
     *
     * @param string
     */
    public CalculateSpacesAndWordsTwoThreads(String string) {
        this.string = string;
    }

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("start");
        String string = "fdfdf fdfd cxc ds ds cx e d cds sd sd fd dffe d";
        Thread t = new Thread(() -> {
            char[] array = string.toCharArray();
            Long time = System.currentTimeMillis();
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] == ' ') {
                    System.out.printf("Количество пробелов в строке: %s", ++j);
                    System.out.println();
                }
                if (time + 1000 < System.currentTimeMillis()) {
                    Thread.currentThread().interrupt();
                    Thread.currentThread().isInterrupted();
                }
                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
            }

        });
        CalculateSpacesAndWordsTwoThreads calculateSpacesAndWordsTwoThreads = new CalculateSpacesAndWordsTwoThreads(string);
        t.start();
        try {
            t.join();
            calculateSpacesAndWordsTwoThreads.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculateSpacesAndWordsTwoThreads.run();
        System.out.println("finich");
    }

    /**
     * Override run as it requiared for implementations interface Runnable
     */
    @Override
    public void run() {
        begin(string);
    }

    /**
     * Method Begin calculate quantity words in string.
     *
     * @param string
     */
    private void begin(String string) {
        char[] array = string.toCharArray();
        long time = System.currentTimeMillis();
        for (int i = 0, j = 0; i < array.length - 1; i++) {
            if (array[i] != ' ' && array[i + 1] == ' ') {
                System.out.printf("Количество слов: %s", ++j);
                System.out.println();
            }
            if (array[i + 1] != ' ' && i + 1 == array.length - 1) {
                System.out.printf("Количество слов: %s", ++j);
                System.out.println();
            }
            if (time + 1000 < System.currentTimeMillis()) {
                Thread.currentThread().interrupt();
            }
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
        }
    }
}
