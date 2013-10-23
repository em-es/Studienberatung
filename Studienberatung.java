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
				System.out.println("Hast du eine Berufsausbildung?");
				String answer4 = scanner.next();
				if (answer4.equalsIgnoreCase("nein")) {
					System.out.println("Besser noch studieren.");
				} else {
					System.out.println("Du kannst ja später noch studieren");
				}
			}

		} else {
			System.out.println("Bist du wissbegierig?");
			String answer3 = scanner.next();
			if (answer3.equalsIgnoreCase("nein")) {
				System.out.println("Nicht studieren");
			} else {
				System.out.println("Auf jeden Fall studieren");

			}

		}
	}
}