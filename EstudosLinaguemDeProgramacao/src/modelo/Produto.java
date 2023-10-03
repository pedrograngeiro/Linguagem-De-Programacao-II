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


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getUnidMedida() {
		return unidMedida;
	}


	public void setUnidMedida(String unidMedida) {
		this.unidMedida = unidMedida;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getEstoque() {
		return estoque;
	}


	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}


	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", unidMedida=" + unidMedida + ", preco=" + preco
				+ ", estoque=" + estoque + "]";
	}
	
	
	
	
}
