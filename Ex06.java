import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		float a, b, c, total, pi;
		pi = 3.14159f;

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Programa de Calculos");
		System.out.println("Digite o primeiro número: ");
		a = (float) sc.nextFloat();
		System.out.println("Digite o segundo número: ");
		b = sc.nextFloat();
		System.out.println("Digite o terceiro número: ");
		c = sc.nextFloat();
		sc.close();
		
		System.out.println("----------------");
		System.out.println("Calculo do Triangulo: ");
		total = (a * c) / 2;
		System.out.println("A Base do seu triangulo é: " + total);
		
		System.out.println("----------------");
		System.out.println("Raio Circulo");
		total = (c * pi) / 2;
		System.out.println("O total do raio é: " + total);
		
		System.out.println("----------------");
		System.out.println("Calculo Trapézio");
		total = (a + b) / 2 * 5;
		System.out.println("O total do trapézio é: " + total);
	
		System.out.println("----------------");
		System.out.println("Calculo da area do quadrado");
		total = b * 4;
		System.out.println("O total do quadrado é: " + total);
		
		System.out.println("-----------------");
		System.out.println("Calculo Retangulo");
		total = (a * 2) + (b * 2);
		System.out.println("O total do retangulo é : " + total);
	}

}
