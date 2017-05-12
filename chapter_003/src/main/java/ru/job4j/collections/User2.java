package ru.job4j.collections;

/**
 * Created by admin on 12.05.2017.
 */
public class User2 implements Comparable<User2> {
    private String name;
    private int age;

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User2 o) {

        return this.age > o.age ? 1 : -1;
    }

    private int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

}