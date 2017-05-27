package Iterator;

import java.util.Iterator;

/**
 * Created by admin on 26.05.2017.
 */
public class IteratorArrayNumbers implements Iterator<Integer> {
    public static void main(String[] args) {
    }

    private int index = 0;
    private int[] a;

    public IteratorArrayNumbers(int[] a) {
        this.a = a;
    }

    @Override
    public boolean hasNext() {
        int j = index;
        for (; j < a.length; j++) {
            int temp = 2;
            int i = a[j];
            if (i == 3 || i == 5 || i == 7) {
                return true;
            }
            int k = 1;
            while (temp != 10) {
                if (i % temp++ == 0) {
                    k = 0;
                }
            }
            if (k == 1) {
                return true;
            }
        }
        return  false;
    }


    @Override
    public Integer next() {
        for(; index < a.length;) {
            if (a[index] == 3 || a[index] == 5 || a[index] == 7) {
                return a[index++];
            }
            int temp = 2;
            int k = 0;
          while (temp != 10) {
              if (a[index] % temp++ == 0) {
                  index++;
                  k = 1;
                  break;
              }
          }
            if (k != 1){
                return a[index++];
            }
        }
        return null;
    }

    @Override
    public void remove() {

    }
}
