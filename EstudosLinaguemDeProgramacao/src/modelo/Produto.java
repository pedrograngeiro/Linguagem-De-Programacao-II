package modelo;

public class Produto {
	public int codigo;
	public String nome;
	public String unidMedida;
	public double preco;
	public double estoque;
	
	
	public Produto(int codigo, String nome, String unidMedida, double preco, double estoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.unidMedida = unidMedida;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public Produto() {
		
	}
	
	
}
