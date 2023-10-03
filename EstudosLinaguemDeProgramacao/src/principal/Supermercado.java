package principal;
import modelo.Produto;
import java.util.Scanner;
public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto(1,"Arroz tio joão", "kg", 3.45, 100);
		Produto p2 = new Produto(2, "Suco uva DelValle", "Garrafa1L", 4.99,200);
		
		System.out.println("Código do produto: " + p1.codigo);
		System.out.println("Nome do produto:" + p1.nome);
		System.out.println("Unidade de médida: " + p1.unidMedida);
		System.out.println("Preco do produto: " + p1.preco);
		System.out.println("Estoque do produto: " + p1.estoque);
		
		System.out.println("--------//--------");
		System.out.println(p1.toString());
//		
	}

}
