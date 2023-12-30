package ma.ehei.calculatrice;

public class App {
	public static void main(String[] args) {

		System.out.println(Calculatrice.add(5, 5));

		Calculatrice calcul = new Calculatrice();

		int firstResult = calcul.multiplication(5, 3);
		int secondResult = calcul.multiplication(10, 2);

		System.out.println("first result : " + firstResult);
		System.out.println("second result : " + secondResult);



	}
}
