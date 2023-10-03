package principal;
import modelo.Produto;
import java.util.Scanner;
public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		
		System.out.println("Informe o código do Produto");
		p1.codigo = sc.nextInt();
		System.out.println("O codigo inserido foi:" +p1.codigo);
	}

}
