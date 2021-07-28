package Opdrachten;

import java.util.ArrayList;
import java.util.Random;

public class Opgave2 {

	private static Integer sizeLijstField;

	private static ArrayList<Integer> eersteArrayList;

	public static void main(String[] args) {
		randomFactory(5, 5);// Bepaal de grootte van array, bepaal de grootste getal dat een array index
							// moet bevatten
		Test2(0);

	}

	public static void randomFactory(int arrayGrootte, int grootsteGetal) {
		/*
		 * Schrijf een methode die een gesorteerde ArrayList terug geeft van unieke
		 * Integers (gebruik hierbij de ingebouwde Random methode van Java). Aan deze
		 * methode geef je 2 parameters namelijk de grootte van je ArrayList en het
		 * hoogste int dat door Random gebruikt mag worden. Je input is bijvoorbeeld (5,
		 * 10) en je output kan er zo uit zien [0, 2, 4, 5, 7]
		 */

		ArrayList<Integer> lijst = new ArrayList<>();
		int randomGetal = 0;
		for (int i = 0; i < arrayGrootte; i++) {
			Random random = new Random();
			randomGetal = random.nextInt(grootsteGetal);
			if (lijst.contains(randomGetal)) {
				i--;
			} else {
				lijst.add(randomGetal);
			}

		}
		System.out.println(lijst);
		sizeLijstField = grootsteGetal;
		eersteArrayList = lijst;

	}

	public static void Test2(int pcRandom) {
		/*
		 * Schrijf hierna een andere methode (die gebruik maakt van loops of recursie)
		 * die een specifieke int zoekt in een ArrayList van integers geeft hierbij de
		 * index terug als de integer wordt gevonden, anders geeft de methode -1 terug.
		 * De methode neemt 2 parameters, de eerste is een ArrayList van integers
		 * (gebruik de lijst die je bij je eerste methode hebt gegenereerd) en de 2de is
		 * een (Random) int die je in je ArrayList wilt zoeken. Als het mogelijk/handig
		 * is mag je ook meer dan 2 parameters meesturen. Enkele input en ouput
		 * voorbeelden: input ([0, 2, 4, 5, 7], 10) output = -1 input ([0, 2, 4, 5, 7],
		 * 7) output = 5 input ([0, 2, 4, 5, 7], 0) output = 0
		 */

		Random random = new Random();
		pcRandom = random.nextInt(sizeLijstField);

//		ArrayList<Integer> eersteArrayList = new ArrayList<>();
		int index = eersteArrayList.indexOf(pcRandom) + 1;

		for (int i = 0; i <= sizeLijstField; i++) {

			if (eersteArrayList.contains(pcRandom)) {
				System.out.println("PC: " + pcRandom);
				System.out.println("output: " + index);
				break;
			} else if (!eersteArrayList.contains(pcRandom)) {
				System.out.println("PC: " + pcRandom);
				System.out.println("output: -1");
				break;
			}

		}
	}

}
