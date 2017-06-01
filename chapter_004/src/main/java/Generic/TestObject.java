package Generic;

/**
 * Created by admin on 01.06.2017.
 */
public class TestObject {
    private String name;
    private int age;
    public TestObject(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o.getClass().equals(this.getClass()))) {
            return false;
        }
        TestObject t = (TestObject) o;
        return this.name.equals(t.name);
    }
    public int getAge() {
        return age;
    }

}
