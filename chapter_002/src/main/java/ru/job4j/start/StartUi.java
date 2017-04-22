package ru.job4j.start;

import ru.job4j.models.Item;

/**
*
* class StartUi.
* auhtor IndyukovS
* version 0.1
*/

public class StartUi {
/**
* method showMenu.
*/
	public static void showMenu() {
		System.out.println("0. Add new Item");
		System.out.println("1. Show all items");
		System.out.println("2. Edit item");
		System.out.println("3. Delete item");
		System.out.println("4. Find item by Id");
		System.out.println("5. Find items by name");
		System.out.println("6. Exit Program");
		System.out.print("Select: ");
	}
/**
* method showItems.
* @param items first
*/
	public static void showItems(Item[] items) {
			for (int i = 0; i < items.length; i++) {
				System.out.println(items[i].getId() + " " + items[i].getName() + " " + items[i].getDescription() + " " + items[i].getCreate());
			}

	}
/**
* method showItem.
* @param item first
*/
	public static void showItem(Item item) {
		if (item != null) {
			System.out.println(item.getId() + " " + item.getName() + " " + item.getDescription() + " " + item.getCreate());
		}
	}
/**
* method mains.
* @param args first
*/
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		ConsoleInput input = new ConsoleInput();
		showMenu();
		int select = input.select();
		while (select < 0 || select > 6) {
			System.out.println("Введено некорректное значение");
		}
		while (select != 6) {
			if (select == 0) {
				String name = input.askName("Please, enter the item name: ");
				String id = input.askId("Please, enter the item id: ");
				String description = input.askDescription("Please, enter the item description: ");
				long create = input.askCreate("Please, enter the item Create: ");
				Item item = new Item(id, name, description, create);
				tracker.add(item);
			}
			if (select == 1) {
				showItems(tracker.findAll());
			}
			if (select == 2) {
				String name = input.askName("Please, enter the item name(the names must match the name of the editabler application): ");
				String id = input.askId("Please, enter the item id: ");
				String description = input.askDescription("Please, enter the item description: ");
				long create = input.askCreate("Please, enter the item Create: ");
				Item item = new Item(id, name, description, create);
				tracker.update(item);
			}
			if (select == 3) {
				String id = input.askId("Please, enter the item id: ");
				Item item = new Item(id, "off", "off", 0);
				tracker.delete(item);
			}
			if (select == 4) {
				String id = input.askId("Please, enter the item id: ");
				showItem(tracker.findById(id));
			}
			if (select == 5) {
				String name = input.askName("Please, enter the item name: ");
				showItems(tracker.findByName(name));
			}
			showMenu();
			select = input.select();
		}
	}
}
