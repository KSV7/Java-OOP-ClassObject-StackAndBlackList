package com.gmail.kutepov89.sergey;

public class Stack {
	private Object[] objStack;
	private BlackList blacklist;

	public Stack(BlackList blacklist) {
		super();
		objStack = new Stack[0];
		this.blacklist = blacklist;
	}

	public Stack() {
		super();
	}

	public void addStack(Object obj) {
		if (!blacklist.exists(obj)) {
			Object[] created = new Object[objStack.length + 1];
			for (int i = 0; i < objStack.length; i++) {
				created[i] = objStack[i];
			}
			objStack = created;
			for (int i = 0; i < objStack.length; i++) {
				if (objStack[i] == null) {
					objStack[i] = obj;
					System.out.println(obj.getClass() + " stack был успешно добавлен.");
					return;
				}
			}
		} else {
			System.out.println(obj.getClass() + " не был добавлен потому что этот класс в черном списке.");
		}
	}

	public Object getAnddelStack() {
		if (objStack.length == 0) {
			System.out.println("Stack пустой");
			return null;
		}
		System.out
				.println("\nВерхний элемент '" + objStack[objStack.length - 1] + "' был скопирован и удален из stack");
		Object saved = objStack[objStack.length - 1];
		Object[] created = new Object[objStack.length - 1];
		for (int i = 0; i < objStack.length - 1; i++) {
			created[i] = objStack[i];
		}
		objStack = created;
		return saved;
	}

	public Object getElementFromStack() {
		if (objStack.length == 0) {
			System.out.println("Stack пустой");
			return null;
		}
		System.out.println("\nВерхний элемент '" + objStack[objStack.length - 1] + "' был скопирован из stack");
		return objStack[objStack.length - 1];
	}

	@Override
	public String toString() {
		if (objStack.length == 0)
			return "\nStack пустой\n";
		StringBuilder sb = new StringBuilder();
		sb.append("\nStack состоит из:");
		for (Object i : objStack) {
			sb.append("\n- " + i.getClass() + " (" + i + ")");
		}
		return sb.toString();
	}
}