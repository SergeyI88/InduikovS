package ru.job4j.models;

/**
* Item.
*
* auhtor IndyukovS
* version 0.1
*/
public class Item {
/**
* @param id.
*/
	private String id;
/**
* @param name.
*/
	private String name;
/**
* @param description.
*/
	private String description;
/**
* @param create.
*/
	private long create;
/**
* Консруктор.
* @param id first
* @param name second
* @param description third
* @param create fourth
*/
	public Item(String id, String name, String description, long create) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.create = create;
	}
/**
* Консруктор.
*/
	public Item() {
	}
/**
* method getName.
* @return name
*/
	public String getName() {
		return this.name;
	}
/**
* method getDescription.
* @return description
*/
	public String getDescription() {
		return this.description;
	}
/**
* method getCreate.
* @return create
*/
	public long getCreate() {
		return this.create;
	}
/**
* method getId.
* @return id
*/
	public String getId() {
		return this.id;
	}
}