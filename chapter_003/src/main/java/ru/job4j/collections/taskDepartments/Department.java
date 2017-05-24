package ru.job4j.collections.taskDepartments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by user8.3 on 24.05.2017.
 */
public class Department implements Comparable {

    public static ArrayList<Department> inReverseOrder(ArrayList<Department> arrayList) {
        Collections.sort(arrayList, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o2.title.compareTo(o1.title);
            }
        });
        return arrayList;
    }

    public static ArrayList<Department> checkup(ArrayList<Department> arrayList) {
        ArrayList<Department> temp = new ArrayList<>();
        temp.addAll(arrayList);
        for(Department d : arrayList) {
            char[] title = d.title.toCharArray();
            char[] buffer = new char[d.title.length()];
            char[] cutArray = null;
            int j = 0 ;
            for (char c : title) {
                if (c == '/') {
                    if (!(temp.contains(new Department(String.valueOf(cutArray))))) {
                        temp.add(new Department(String.valueOf(cutArray)));
                    }
                }
                buffer[j++] = c;
                cutArray = Arrays.copyOf(buffer, j);
            }
        }
        return temp;
    }
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Object o) {
        Department d = (Department) o;

        return this.title.compareTo(d.title);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        return title != null ? title.equals(that.title) : that.title == null;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }
}