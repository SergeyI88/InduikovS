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
* @param;
*/
	private ConsoleInput input;
/**
* @param;
*/
	private Tracker tracker;
/**
* @param add.
*/
	private static final int ADD = 0;
/**
* @param add.
*/
	private static final int SHOW = 1;
/**
* @param add.
*/
	private static final int EDIT = 2;
/**
* @param add.
*/
	private static final int DEL = 3;
/**
* @param add.
*/
	private static final int FBI = 4;
/**
* @param add.
*/
	private static final int FBN = 5;
/**
* @param add.
*/
	private static final int EXIT = 6;
/**
* Конструктор.
* @param input first
* @param tracker second
*/
    public StartUi(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
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
				System.out.println(String.format("%s. %s %s %s", items[i].getId(), items[i].getName(), items[i].getDescription(), items[i].getCreate()));
			}

	}
/**
* method showItem.
* @param item first
*/
	public static void showItem(Item item) {
		if (item != null) {
			System.out.println(String.format("%s. %s %s %s", item.getId(), item.getName(), item.getDescription(), item.getCreate()));
		}
	}
/** method init.
*/
	public void init() {
		showMenu();
		int select = this.input.select();
		while (select < 0 || select > 6) {
			System.out.println("Введено некорректное значение");
		}
		while (select != EXIT) {
			if (select == ADD) {
				String name = input.askName("Please, enter the item name: ");
				String id = input.askId("Please, enter the item id: ");
				String description = input.askDescription("Please, enter the item description: ");
				long create = input.askCreate("Please, enter the item Create: ");
				Item item = new Item(id, name, description, create);
				tracker.add(item);
			}
			if (select == SHOW) {
				showItems(tracker.findAll());
			}
			if (select == EDIT) {
				String name = input.askName("Please, enter the item name(the names must match the name of the editabler application): ");
				String id = input.askId("Please, enter the item id: ");
				String description = input.askDescription("Please, enter the item description: ");
				long create = input.askCreate("Please, enter the item Create: ");
				Item item = new Item(id, name, description, create);
				tracker.update(item);
			}
			if (select == DEL) {
				String id = input.askId("Please, enter the item id: ");
				Item item = new Item(id, "off", "off", 0);
				tracker.delete(item);
			}
			if (select == FBI) {
				String id = input.askId("Please, enter the item id: ");
				showItem(tracker.findById(id));
			}
			if (select == FBN) {
				String name = input.askName("Please, enter the item name: ");
				showItems(tracker.findByName(name));
			}
			showMenu();
			select = input.select();
		}
	}
/**
* method mains.
* @param args first
*/
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		ConsoleInput input = new ConsoleInput();
		new StartUi(input, tracker).init();
	}
}
