package ru.job4j.start;

import ru.job4j.models.Item;

/**
*
* class MenuTracker.
* auhtor Sergey
* version 0.1
*/

public class MenuTracker {
/**
* @param actions.
*/
	private UserAction[] actions = new UserAction[6];
/**
* @param tracker.
*/
	private Tracker tracker;
/**
* @param input.
*/
	private Input input;
/**
*
* Конструктор MenuTracker.
* @param input first
* @param tracker second
*/
	public MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
/**
* method select.
* @param key first
*/
	public void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}
/**
* method show.
*/
	public void show() {
		for (UserAction action : this.actions) {
		if (action != null) {
			System.out.println(action.info());
		}
		}
	}
/**
* method fill.
*/
	public void fill() {
		this.actions[0] = new AddItem();
		this.actions[1] = new MenuTracker.ShowItems();
		this.actions[2] = new EditItem();
		this.actions[3] = new MenuTracker.FindById();
		this.actions[4] = new DelItem();
		this.actions[5] = new MenuTracker.FindByName();
	}
/**
*
* class AddItem.
*/
	private class AddItem implements UserAction {
/**
* method key.
* @return 0
*/
		public int key() {
			return 0;
		}
/**
* method execute.
* @param input first
* @param tracker second
*/
		public void execute(Input input, Tracker tracker) {
			String name = input.askName("Please, enter the item name: ");
			String id = input.askId("Please, enter the item id: ");
			String description = input.askDescription("Please, enter the item description: ");
			long create = input.askCreate("Please, enter the item Create: ");
			Item item = new Item(id, name, description, create);
			tracker.add(item);
		}
/**
* method info.
* @return String
*/
		public String info() {
			return String.format("%s. %s", this.key(), "Add the new item. ");
		}
	}
/**
*
* class DelItem.
*/
	private class DelItem implements UserAction {
/**
* method key.
* @return 0
*/
		public int key() {
			return 4;
		}
/**
* method execute.
* @param input first
* @param tracker second
*/
		public void execute(Input input, Tracker tracker) {
			String id = input.askId("Please, enter the item id: ");
			tracker.delete(new Item(id, null, null, 0));
		}
/**
* method info.
* @return String
*/
		public String info() {
			return String.format("%s. %s", this.key(), "Delete the item. ");
		}
	}
/**
*
* class ShowItems.
*/
	private static class ShowItems implements UserAction {
/**
* method key.
* @return 0
*/
		public int key() {
			return 1;
		}
/**
* method execute.
* @param input first
* @param tracker second
*/
		public void execute(Input input, Tracker tracker) {
			for (Item item : tracker.findAll()) {
				System.out.println(String.format("%s. %s %s", item.getId(), item.getName(), item.getDescription()));
			}
		}
/**
* method info.
* @return String
*/
		public String info() {
			return String.format("%s. %s", this.key(), "Show all Items. ");
		}
	}
/**
*
* class ShowItemsById.
*/
	private static class FindById implements UserAction {
/**
* method key.
* @return 0
*/
		public int key() {
			return 3;
		}
/**
* method execute.
* @param input first
* @param tracker second
*/
		public void execute(Input input, Tracker tracker) {
			String keyId = input.askId("Введите Id: ");
			if (tracker.findById(keyId) != null) {
				System.out.println(String.format("%s. %s %s", tracker.findById(keyId).getId(), tracker.findById(keyId).getName(), tracker.findById(keyId).getDescription()));
			}
		}
/**
* method info.
* @return String
*/
		public String info() {
			return String.format("%s. %s", this.key(), "Find  Item by Id. ");
		}
	}
/**
*
* class ShowItemsByName.
*/
	private static class FindByName implements UserAction {
/**
* method key.
* @return 0
*/
		public int key() {
			return 5;
		}
/**
* method execute.
* @param input first
* @param tracker second
*/
		public void execute(Input input, Tracker tracker) {
			String keyName = input.askName("Введите name: ");
			for (Item item : tracker.findByName(keyName)) {
				System.out.println(String.format("%s. %s %s", item.getId(), item.getName(), item.getDescription()));
			}
		}
/**
* method info.
* @return String
*/
		public String info() {
			return String.format("%s. %s", this.key(), "Find  Item by Name. ");
		}
	}
/**
*
* class EditItem.
*/

		private class EditItem implements UserAction {
/**
* method key.
* @return 0
*/
		public int key() {
			return 2;
		}
/**
* method execute.
* @param input first
* @param tracker second
*/
		public void execute(Input input, Tracker tracker) {
			String name = input.askName("Please, enter the item name(the names must match the name of the editabler application): ");
			String id = input.askId("Please, enter the item id: ");
			String desc = input.askDescription("Please, enter the item description: ");
			long create = input.askCreate("Please, enter the item Create: ");
			tracker.update(new Item(id, name, desc, create));
		}
/**
* method info.
* @return String
*/
		public String info() {
			return String.format("%s. %s", this.key(), "Edit Item. ");
		}
	}
}