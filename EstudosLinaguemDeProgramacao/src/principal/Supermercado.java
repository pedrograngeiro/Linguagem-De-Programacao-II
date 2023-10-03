package principal;
import modelo.Produto;
import java.util.Scanner;
public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		Produto p1,p2;
		Produto p1 = new Produto(1,"Arroz tio joão", "kg", 3.45, 100);
		Produto p2 = new Produto(2, "Suco uva DelValle", "Garrafa1L", 4.99,200);
		
		System.out.println(p1.codigo + " " +
				p1.nome + " " +
				p1.unidMedida + " " +
				p1.preco + " " +
				p1.estoque);
//		System.out.println(p1.nome);
	}

}
