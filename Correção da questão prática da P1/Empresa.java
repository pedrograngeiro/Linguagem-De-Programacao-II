package modelo;

public class Empresa {

	private String nome;
	private String CNPJ;
	private String endereco;
	private String cidade;
	private String estado;
	private String telefone;
	private int qtdeFunc;
	
	public Empresa() {
		
	}
	public Empresa(String nome, String cNPJ, String endereco, String cidade, String estado, String telefone,
			int qtdeFunc) {
		this.nome = nome;
		CNPJ = cNPJ;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.qtdeFunc = qtdeFunc;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getQtdeFunc() {
		return qtdeFunc;
	}
	public void setQtdeFunc(int qtdeFunc) {
		this.qtdeFunc = qtdeFunc;
	}
	
	public String toString() {
		return "\nNome da empresa: "+this.nome
				+ "\nCNPJ: "+this.CNPJ+
				"\nEndereço: "+this.endereco+
				"\nCidade: "+this.cidade+
				"\nEstado: "+this.estado+
				"\nTelefone: "+this.telefone+
				"\nQuantidade de funcionários: "+
				this.qtdeFunc+"\n";
	 }
	
}
