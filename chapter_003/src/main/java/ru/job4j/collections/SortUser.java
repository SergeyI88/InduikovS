package ru.job4j.collections;

import java.util.Comparator;
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
        System.out.println(set);
        return set;
    }
    public List<User2> sortHash (List<User2> list){
        list.sort(new Comparator<User2>() {
            @Override
            public int compare(User2 o1, User2 o2) {
                return Integer.compare(o1.hashCode(), o2.hashCode());
            }
        });
      return list;
    }
    public List<User2> sortLength (List<User2> list) {
        list.sort(new Comparator<User2>() {
            @Override
            public int compare(User2 o1, User2 o2) {
                int result = Integer.compare(o1.getName().length(), o2.getName().length());
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });
        return list;
    }
}


