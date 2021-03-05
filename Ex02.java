import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		double a, num;
		double pi = 3.14159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		num = sc.nextDouble();
		sc.close();
		
		a = (num * num) * pi;
		
		System.out.printf("O Resultado é: %6f%n ", a);
	}

}
