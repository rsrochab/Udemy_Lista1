import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int num, horas;
		double salario, total;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do funcionário:");
		num = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.println("Digite o valor recebido por hora: ");
		salario = sc.nextDouble();
		sc.close();
		
		total = (double) horas * salario;
		
		System.out.println("Funcionário de numero: " + num);
		System.out.println("O salario é de: " + total);
	}
}
