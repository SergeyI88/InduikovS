package ru.job4j.collections;

import java.util.*;


/**
 * Created by admin on 11.05.2017.
 */
public class ConvertList {
    /**
     *  toList.
     * @param array
     * @return list
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j =0; j <array[0].length; j++) {
                list.add(array[i][j]);
            }
        }
        return list;
    }

    /**
     * toArray.
     * @param list
     * @param rows
     * @return arrayInt
     */
    public int[][] toArray(List<Integer> list, int rows) {
        ArrayList<Integer> arrayList = (ArrayList) list;
        arrayList.trimToSize();
        int size = arrayList.size() <= rows ? 1 : arrayList.size() % rows == 0 ? arrayList.size() / rows : arrayList.size() / rows + 1;
        int[][] arrayInt = new int[rows][size];
        System.out.println(size);
        Iterator<Integer> iterator = arrayList.iterator();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < size; j++) {
                if (iterator.hasNext()) {
                    arrayInt[i][j] = iterator.next();
                }
            }
        }
        return arrayInt;
    }
    /**
     * convert.
     * @param list
     * @return
     */
    public List<Integer> convert (List<int[]> list) {
        List<Integer> allLists = new LinkedList<>();
        for (int[] temp : list) {
            for (int temp2 : temp) {
                allLists.add(Integer.valueOf(temp2));
            }
        }
        return allLists;
    }
}
