package aula_03_condicionais;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String produto = "";
		int id, quantidade, valor = 0, valorTotal;

		System.out.println("********************************************");
		System.out.println("                 CARDÁPIO                   ");
		System.out.println("********************************************");
		System.out.println("1 - Cachorro Quente - R$ 10.00");
		System.out.println("2 - X-Salada        - R$ 15.00");
		System.out.println("3 - X-Bacon         - R$ 18.00");
		System.out.println("4 - Bauru           - R$ 12.00");
		System.out.println("5 - Refrigerante    - R$  8.00");
		System.out.println("6 - Suco de Laranja - R$ 13.00");
		System.out.println("********************************************");

		System.out.print("Código do Produto: ");
		id = leia.nextInt();

		System.out.print("Quantidade: ");
		quantidade = leia.nextInt();

		switch (id) {

		case 1:
			produto = "Cachorro Quente";
			valor = 10;
			break;

		case 2:
			produto = "X-Salada";
			valor = 15;
			break;

		case 3:
			produto = "X-Bacon";
			valor = 18;
			break;

		case 4:
			produto = "Bauru";
			valor = 12;
			break;

		case 5:
			produto = "Refrigerante";
			valor = 8;
			break;

		case 6:
			produto = "Suco de Laranja";
			valor = 13;
			break;

		default:
			System.out.println("Código de produto inválido!");
			leia.close();
			return;
		}

		valorTotal = quantidade * valor;

		System.out.printf("Produto: %s\n", produto);
		System.out.printf("Valor Total: R$ %d", valorTotal);

		leia.close();
	}
}