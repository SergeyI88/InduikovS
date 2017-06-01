package Generic;

/**
 * Created by admin on 01.06.2017.
 */
public class Role extends Base {
    String id;
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
