package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;


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
        int size = arrayList.size() <= rows ? 1 : arrayList.size() % rows == 0 ? arrayList.size() / rows : arrayList.size() / rows + arrayList.size() % rows;
        int[][] arrayInt = new int[rows][size];
        System.out.println(size);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < size; j++) {
                arrayInt[i][j] = arrayList.size() > i * rows + j ? arrayList.get(i * rows + j) : 0;
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }
        return arrayInt;
    }
}
