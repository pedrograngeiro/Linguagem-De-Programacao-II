package principal;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		int soma=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Número: ");
			numeros[i] = sc.nextInt();
			soma = soma+ numeros[i];
		}
		
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
