package ru.job4j.collections;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by admin on 11.05.2017.
 */
public class ConverListTime {
    @Test
    public void testConvertArraytoList(){
        ConvertList convertList = new ConvertList();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(convertList.toList(array));
        assertThat(1,is(arrayList.get(0)));
        assertThat(9,is(arrayList.get(8)));
    }
    @Test
    public void testConvertListToArrayOne() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int[][] array;
        array = new ConvertList().toArray(arrayList, 3);
        assertThat(array[0][1], is(arrayList.get(1)));
        assertThat(array[2][2], is(0));
    }
    @Test
    public void testConvertListToArrayTwo() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int[][] array;
        array = new ConvertList().toArray(arrayList, 4);
        assertThat(array[1][2], is(arrayList.get(6)));
        assertThat(array[1][3], is(0));
    }
    @Test
    public void testConvertListToArrayThree() {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        int[][] array;
        array = new ConvertList().toArray(arrayList, 3);
        assertThat(array[1][2], is(arrayList.get(6)));
        assertThat(array[1][3], is(8));
    }
}
