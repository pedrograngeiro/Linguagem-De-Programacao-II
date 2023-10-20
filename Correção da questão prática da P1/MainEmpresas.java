package principal;

import java.util.Scanner;

import modelo.Empresa;

public class MainEmpresas {
	
	public static void exibirMenu() {
		System.out.println("\n****Menu****");
		System.out.println("\n1- Cadastrar");
		System.out.println("\n2- Exibir todas as empresas");
		System.out.println("\n3- Finalizar\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Empresa[] empresas = new Empresa[30];
		int qtde=0;
		int op;
		do {
			exibirMenu();
			System.out.println("\nO que deseja fazer?");
			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
				case 1:{
					if (qtde<30) {
						empresas[qtde] = new Empresa();
						System.out.println("Nome da empresa: ");
						empresas[qtde].setNome(sc.nextLine());
						sc.nextLine();
						System.out.println("Endereço da empresa: ");
						empresas[qtde].setEndereco(sc.nextLine());
						sc.nextLine();
						System.out.println("CNPJ da empresa: ");
						empresas[qtde].setCNPJ(sc.nextLine());
						sc.nextLine();
						System.out.println("Estado da empresa: ");
						empresas[qtde].setEstado(sc.nextLine());
						sc.nextLine();
						System.out.println("Cidade da empresa: ");
						empresas[qtde].setCidade(sc.nextLine());
						sc.nextLine();
						System.out.println("Telefone da empresa: ");
						empresas[qtde].setTelefone(sc.nextLine());
						sc.nextLine();
						System.out.println("Quantidade de funcionários da empresa: ");
						empresas[qtde].setQtdeFunc(sc.nextInt());
						sc.nextLine();
						qtde++;
					}
					else {
						System.out.println("Limite de empresas atingido!");
					}
					break;
				}
				case 2:{
					if (qtde>0) {
						for(int i=0;i<qtde;i++) {
							System.out.println(empresas[i]);
						}
					}
					else {
						System.out.println("\nNão há empresa cadastrada!");
					}
					break;
				}
				case 3:{
					System.out.println("\nEncerrando o programa...");
					break;
				}
				default:{
					System.out.println("\nOpção inválida!");
					break;
				}
			}
		}while(op!=3);
		
	}

}
