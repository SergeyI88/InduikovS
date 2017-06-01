package Generic;

import java.util.ArrayList;

/**
 * Created by admin on 31.05.2017.
 */
public class SimpleList<E> {

    public Object[] objects = {};
    private int index = 0;

    public SimpleList(int position) {
        objects = new Object[position];
    }
    public SimpleList() {
        objects = new Object[10];
    }
    public void add(E element) {
        if (index < objects.length) {
            objects[index++] = element;
        } else {
            Object[] newObjects = new Object[objects.length + (objects.length >> 1)];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
            objects[index++] = element;
        }
    }
    public void delete(E element) {
        for(int i = 0; i < index; i++) {
            if(objects[i].equals(element)) {
                for(int j = i; j < index;) {
                    objects[j] = objects[++j];
                }
                objects[index - 1] = null;
                index--;
                break;
            }
        }
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    public E get(int position) {
        return (E) objects[position];
    }
    public void update(E element) {
        for (int i = 0; i < index; i++) {
            if (objects[i].equals(element)) {
                objects[i] = element;
            }
        }
    }
}
