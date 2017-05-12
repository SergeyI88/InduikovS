package ru.job4j.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by admin on 12.05.2017.
 */
public class SortUser {
    public Set<User2> sort(List<User2> list) {
        TreeSet<User2> set = new TreeSet<>();
        set.addAll(list);
        return set;
    }
}

