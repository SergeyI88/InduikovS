package ru.job4j.collections;

import java.util.*;

/**
 * Created by admin on 20.05.2017.
 */
public class SortStringToChar {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("poka", "privep", "pppp", "popip", "pp", "p"));
        SortStringToChar.sort(arrayList, 'p');
        System.out.println(arrayList);

    }
    public static List<String> sort(List<String> list, char ch) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] v1 = o1.toCharArray();
                char[] v2 = o2.toCharArray();
                int quantity1 = 0;
                int quantity2 = 0;
                for (char c : v1) {
                    if (c == ch) {
                        quantity1++;
                    }
                }
                for (char c : v2) {
                    if (c == ch) {
                        quantity2++;
                    }
                }
                int answer = quantity1 > quantity2 ? 1 : quantity1 == quantity2 ? 0 : -1;
                if (answer == 0) {
                    return o1.compareTo(o2);
                }
                 return answer;
            }
        };
        Collections.sort(list, comparator);
        return  list;
    }

}
