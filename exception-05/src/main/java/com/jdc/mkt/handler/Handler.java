package com.jdc.mkt.handler;

public class Handler {

	private Person person;
	private int count = 1;

	public Handler() {
		super();
		person = new Person();
	}

	// NullPointerException when person is not created yet.
	public void useName() {
		try {
			person.setName("John Doe");
			System.out.println(person.getName());

		} catch (NullPointerException e) {
			System.out.println("This is NullPointerException because there id no person object.");
		}
	}

	// Arithmethic Exception
	public void useAge() {
		try {
			person.setAge(20);
			int age = dividedByZero(person.getAge());
			System.out.println(age);
		} catch (ArithmeticException e) {
			System.out.println("This is ArithmeticExceptio because any number can't divided by zero.");

		}

	}

	private int dividedByZero(int age) {
		return age / 0;
	}

	// StackOverFlowError
	public void recursive() {
		try {
			if (count > 0) {
				System.out.println("recursive : " + count);
				count++;
				recursive();
			}

		} catch (Exception e) {
			System.out.println("This is StackOverFlowError cause of recursive");
		}
	}

}
