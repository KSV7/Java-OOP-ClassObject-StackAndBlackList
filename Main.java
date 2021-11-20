package com.gmail.kutepov89.sergey;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BlackList blacklist = new BlackList();
		Stack stack = new Stack(blacklist);

		blacklist.addClass(String.class);
		blacklist.addClass(Integer.class);

		System.out.println(blacklist);
		System.out.println(stack);

		stack.addStack(89);
		stack.addStack(7.7);
		stack.addStack(123456789076543256L);
		stack.addStack("Text");
		stack.addStack(new Scanner(System.in));

		Object copy1 = stack.getElementFromStack();
		System.out.println(stack);

		Object copy2 = stack.getAnddelStack();
		System.out.println(stack);
	}

}
