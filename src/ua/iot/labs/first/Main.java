package ua.iot.labs.first;

public class Main {

	public static void main(String[] args) {
		Book first = new Book("Aivengo", 130.25f, 400, "Walter Scott", "Times", 1625);
		Book second = new Book("Witcher", 200, "A. Sapkowskii");
		Book third = new Book();
		System.out.println(first.toString());
		System.out.println(second.toString());
		System.out.println(third.toString());
		System.out.println(Book.genre());
	}

}
