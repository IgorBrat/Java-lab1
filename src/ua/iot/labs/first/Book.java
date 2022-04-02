package ua.iot.labs.first;

public record Book(String name, float priceInUah, int countOfPages, String author, String publisher, int yearOfWriting) {
	static String genre = "Novel";
	public Book(){
		this(null, 0, null);
	}
	public Book(String name, float priceInUah, String author) {
		this(name, priceInUah, 0, author, null, 0);
	}
	public static String genre() {
		return genre;
	}
	@Override
	public String toString() {
		return String.format("Book '%s' for %.2f grn, written by %s in %d and published by %s. Has %d pages.", 
							  name, priceInUah, author, yearOfWriting, publisher, countOfPages);
	}
}
