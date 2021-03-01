import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		area = pi * raio * raio;
		
		System.out.printf("O valor da área é = %.4f%n", area);
		
		sc.close();
	}

}
