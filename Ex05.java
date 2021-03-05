import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int cod1, cod2, nro1, nro2;
		double preco1, preco2, total;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		cod1 = sc.nextInt();
		nro1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		nro2 = sc.nextInt();
		preco2 = sc.nextDouble();
		sc.close();
		
		total = (nro1 * preco1) + (nro2 * preco2);
		
		System.out.println(total);

	}

}
