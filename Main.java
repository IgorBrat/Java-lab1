package ua.iot.java.labs.second;

import ua.iot.java.labs.second.models.*;

public class Main {

	public static void main(String[] args) {
		Good redLeatherJacket = new Clothes("Red leather jacket for boys", 600, Gender.MALE,
				true, 17645219, "Turkey", "jacket", "L", "leather",
				Season.SPRING, "still bloody red");
		Good giraffeFluffy = new Toy("Fluffy giraffe toy", 100, Gender.INTERSEX,
				false, 18019234, "Ukraine", 0.5f, "cotton", "giraffe");
		Good spiderManBag = new Bag("Spider Man bag", 800, Gender.MALE,
				false, 18029335, "Canada", "Spider Man print", 12, 4, "Kite");
		Good truthOrAction = new Game("Truth or Action game", 1000, Gender.INTERSEX,
				true, 23029335, "Belgium", 8, 3, 10, 
				"Take turns in doing actions or telling the truth about something", "FreeTableGames");
	}
}
