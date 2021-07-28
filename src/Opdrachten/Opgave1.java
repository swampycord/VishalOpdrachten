package Opdrachten;

public class Opgave1 {

	public static void main(String[] args) {
		arrayList1('b', 10);

	}

	public static void arrayList1(char characterInput, int integerInput) {
		/*
		 * Schrijf een methode die 2 parameters neemt de eerste een char en de tweede
		 * een int. De methode geeft een string terug van de opgegeven char keer de
		 * opgegeven int. Enkele input en ouput voorbeelden: input (*, 7) output =
		 * ******* input (B, 12) output = BBBBBBBBBBBB
		 */

		for (int i = 0; i < integerInput; i++) {
			System.out.print(characterInput);
		}
	}

}
