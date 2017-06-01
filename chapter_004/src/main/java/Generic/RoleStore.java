package Generic;

/**
 * Created by admin on 01.06.2017.
 */
public class RoleStore implements Store<Role>  {
    SimpleList<Role> simpleList;

    public RoleStore(int size) {
        this.simpleList = new SimpleList<>(size);
    }
    public RoleStore() {
        this.simpleList = new SimpleList<>();
    }

    public void add(Role role) {
        simpleList.add(role);
    }
    public void delete(Role role) {
        simpleList.delete(role);
    }
    public void update(Role role) {
        simpleList.update(role);
    }
}
