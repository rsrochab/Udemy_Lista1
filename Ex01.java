import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		soma = a + b;
		
		System.out.println("O Resultado da soma é " + soma);
		
	}
}
