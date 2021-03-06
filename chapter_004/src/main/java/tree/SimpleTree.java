package tree;

import java.util.Iterator;

/**
 * Created by admin on 11.07.2017.
 */
public interface SimpleTree<E extends Comparable<E>> extends Iterable<E>{
        /**
         * Добавить элемент child в parent.
         * Parent может иметь список child.
         * @param parent parent.
         * @param child child.
         * @return
         */
        boolean add(E parent, E child);
}
