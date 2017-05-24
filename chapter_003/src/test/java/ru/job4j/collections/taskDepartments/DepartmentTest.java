package ru.job4j.collections.taskDepartments;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by admin on 24.05.2017.
 */
public class DepartmentTest {
    @Test
    public void sortAscending() {
        ArrayList<Department> arrayList = new ArrayList<Department>(Arrays.asList(
                new Department("K1/SK1"),
                new Department("K1/SK1/SSK2"),
                new Department("K2/SK1/SSK1"),
                new Department("K2/SK1/SSK2"),
                new Department("K2/SK1/SSK1")
        ));
        arrayList = Department.checkup(arrayList);
        Collections.sort(arrayList);
        String result = "K1";
        Assert.assertThat(result, Is.is(arrayList.get(0).toString()));
    }

    @Test
    public void sortDecreasing() {
        ArrayList<Department> arrayList = new ArrayList<Department>(Arrays.asList(
                new Department("K1/SK1"),
                new Department("K1/SK1/SSK2"),
                new Department("K2/SK1/SSK1"),
                new Department("K2/SK1/SSK2"),
                new Department("K2/SK1/SSK1")
        ));
        arrayList = Department.checkup(arrayList);
        arrayList = Department.inReverseOrder(arrayList);
        String result = "K2/SK1/SSK2";
        Assert.assertThat(result, Is.is(arrayList.get(0).toString()));
    }
}
