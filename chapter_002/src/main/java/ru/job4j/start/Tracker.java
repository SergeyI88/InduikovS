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
*/
	public void add(Item item) {
		//item.setId(String.valueof(RN.next()));
		this.items[position++] = item;
	}
/**
* method finById.
* @param id first
* @return result
*/
	protected Item findById(String id) {
		Item result = null;
			for (int i = 0; i < items.length; i++) {
				if (items[i] != null && items[i].getId().equals(id)) {
					result = items[i];
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
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
			tempItem[count++] = items[i];
			}
		}
		return Arrays.copyOf(tempItem, count);
	}
/**
* method findByName.
* @param key first
* @return tempItem
*/
	public Item[] findByName(String key) {
		Item[] tempItem = new Item[items.length];
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null && items[i].getName().equals(key)) {
				tempItem[count++] = items[i];
			}
		}
		return Arrays.copyOf(tempItem, count);
	}
/**
* method getAll.
* @return items
*/
	public Item[] getAll() {
		return items;
	}
}