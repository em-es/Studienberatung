import java.util.*;

public class Studienberatung {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String answer = scanner.next();
		if (answer.equalsIgnoreCase("nein")) {
			System.out.println("Hast du Fachabitur?");
			String answer2 = scanner.next();
			if (answer2.equalsIgnoreCase("nein")) {
				System.out.println("Nicht studieren");
			} else {
			}
		} else {
		}
	}
}