package ru.job4j.start;

import ru.job4j.models.Item;
import java.util.Arrays;
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
	private Item[] items = new Item[10];
/**
* @param position second
*/
	private int position = 0;
/**
* method add.
* @param item first
* @return item
*/
	public Item add(Item item) {
		//item.setId(String.valueof(RN.next()));
		this.items[position++] = item;
		return item;
	}
/**
* method finById.
* @param id first
* @return result
*/
	protected Item findById(String id) {
		Item result = null;
			for (Item item : items) {
				if (item != null && item.getId().equals(id)) {
				result = item;
				break;
				}
			}
		return result;
	}
/**
* method update.
* @param item first
*/
	public void update(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null && item.getId().equals(items[i].getId())) {
				items[i] = item;
				break;
			}
		}
	}
/**
* method delete.
* @param item first
*/
	public void delete(Item item) {
		for (int i = 0; i < items.length; i++) {
			if (this.items[i] != null && item.getId().equals(this.items[i].getId())) {
				this.items[i] = null;
				position--;
				break;
			}
		}
	}
/**
* method findAll.
* @return tempItem
*/
	public Item[] findAll() {
		Item[] tempItem = new Item[items.length];
		int a = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
			tempItem[a++] = items[i];
			} else {
			}
		}
		return Arrays.copyOf(tempItem, a);
	}
/**
* method findByName.
* @param key first
* @return tempItem
*/
	public Item[] findByName(String key) {
		Item[] tempItem = new Item[items.length];
		//System.arraycopy(items, 0, tempItem, 0, items.length);
		int j = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null && items[i].getName().equals(key)) {
				tempItem[j++] = items[i];
			} else {
			}
		}
		return Arrays.copyOf(tempItem, j);
	}
/**
* method getAll.
* @return items
*/
	public Item[] getAll() {
		return items;
	}
}