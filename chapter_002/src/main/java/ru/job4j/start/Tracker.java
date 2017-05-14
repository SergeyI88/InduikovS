package ru.job4j.start;

import ru.job4j.models.Item;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Tracker.
*
* auhtor Indyukovs
* version 0.1
*/
public class Tracker {
    /**
     * @param items
     */
    private ArrayList<Item> items = new ArrayList<Item>(10);

    /**
     * method add.
     *
     * @param item first
     */
    public void add(Item item) {
        //item.setId(String.valueof(RN.next()));
        this.items.add(item);
    }

    /**
     * method finById.
     *
     * @param id first
     * @return result
     */
    protected Item findById(String id) {
        Item result = null;
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            if (next != null && next.getId().equals(id)) {
                result = next;
                break;
            }
        }
        return result;
    }

    /**
     * method update.
     *
     * @param item first
     */
    public void update(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && items.get(i).getId().equals(item.getId())) {
                items.set(i, item);
            }
        }
    }

    /**
     * method delete.
     *
     * @param item first
     */
    public void delete(Item item) {
        Iterator<Item> iterator = items.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            Item next = iterator.next();
            if (next != null && next.getId().equals(item.getId())) {
                iterator.remove();
                i++;
                System.out.println("log");
            }
        }
        if (i == 1) {
            items.add(null);
        }
    }

    /**
     * method findAll.
     *
     * @return tempItem
     */
    public ArrayList<Item> findAll() {
        items.trimToSize();
        return items;
    }

    /**
     * method findByName.
     *
     * @param key first
     * @return tempItem
     */
    public ArrayList<Item> findByName(String key) {
        Iterator<Item> iterator = items.iterator();
        ArrayList<Item> tempItems = new ArrayList<>();
        while (iterator.hasNext()) {
            Item next = iterator.next();
            if (next != null && next.getName().equals(key)) {
                tempItems.add(next);
            }
        }
        tempItems.trimToSize();
        return tempItems;
    }
/**
* method getAll.
* @return items
*/
	public ArrayList<Item> getAll() {
        return items;
	}
}