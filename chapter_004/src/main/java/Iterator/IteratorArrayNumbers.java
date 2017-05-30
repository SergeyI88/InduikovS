package Iterator;

import java.util.Iterator;

/**
 * Created by admin on 26.05.2017.commit 151
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
        if (next() == 0) {
            return false;
        } else {
            return true;
        }
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
        return 0;
    }

    @Override
    public void remove() {

    }
}
