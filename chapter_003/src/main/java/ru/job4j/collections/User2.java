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



    private int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
        public int compareTo(User2 o) {
        int answer = Integer.compare(this.age, o.age);
        answer = answer == 0 ? this.name.compareTo(o.name) : answer;
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User2 user2 = (User2) o;

        return age == user2.age;
    }

    @Override
    public int hashCode() {
        return age + name.length();
    }
}