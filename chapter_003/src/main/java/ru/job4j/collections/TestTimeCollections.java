package ru.job4j.collections;

import java.util.*;

/**
 * Created by admin on 11.05.2017.
 */
public class TestTimeCollections {
    private List arrayList;
    private Set treeSet;
    private List linkedList;

    /**
     * Конструктор.
     *
     * @param arrayList
     * @param treeSet
     * @param linkedList
     */
    public TestTimeCollections(List arrayList, Set treeSet, List linkedList) {
        this.arrayList = arrayList;
        this.treeSet = treeSet;
        this.linkedList = linkedList;
    }

    /**
     * add.
     *
     * @param collection
     * @param line
     * @param amount
     * @return time
     */
    public long add(Collection<String> collection, String line, int amount) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            collection.add(String.format("%s%s", line, i));
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    /**
     * delete.
     * @param collection
     * @param amount
     * @return time
     */
    public long delete(Collection<String> collection, int amount) {
        long time = System.currentTimeMillis();
        Iterator<String> iterator = collection.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (i < amount) {
                i++;
                iterator.remove();
            }
        }
        time = System.currentTimeMillis() - time;
        return time;
    }

    /**
     * main.
     * @param args
     */
    public static void main(String[] args) {
        Set<String> treeset = new TreeSet();
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        TestTimeCollections testTime = new TestTimeCollections(arrayList, treeset, linkedList);
        System.out.printf("%s %s%s", "Время добавления в ArrayList:", testTime.add(arrayList, "что то", 100000), System.lineSeparator());
        System.out.printf("%s %s%s", "Время добавления в LinkedList:", testTime.add(linkedList, "что то", 100000), System.lineSeparator());
        System.out.printf("%s %s%s", "Время добавления в Treeset:", testTime.add(treeset, "что то", 100000), System.lineSeparator());
        System.out.printf("%s %s%s", "Время удаления с начала в ArrayList:", testTime.delete(arrayList, 10000), System.lineSeparator());
        System.out.printf("%s %s%s", "Время удаления с начала в LinkedList:", testTime.delete(linkedList, 10000), System.lineSeparator());
        System.out.printf("%s %s", "Время удаления с начала в Treeset:", testTime.delete(treeset, 10000));
    }
}
