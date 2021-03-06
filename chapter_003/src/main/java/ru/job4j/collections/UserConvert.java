package ru.job4j.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 12.05.2017.
 */
public class UserConvert {

    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        return hashMap;
    }

}
