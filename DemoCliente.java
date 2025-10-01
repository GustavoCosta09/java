mport java.util.Scanner;

public class DemoCliente {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cliente[] c;

		int n;
		String nome;
		float montanteVendas;
		float soma;

		System.out.print("\nEntre com o número de clientes: ");
		n = sc.nextInt();

		c = new Cliente[n];

		System.out.print("\n=== Entrada de dados ===\n");
		for(int i=0;i<c.length;i++) {
			sc.nextLine();
			c[i] = new Cliente();
			System.out.print("\nDados do cliente "+(i+1)+": ");
			System.out.print("\nNome: ");
			nome = sc.nextLine();
			System.out.print("Montante de vendas: ");
			montanteVendas = sc.nextFloat();
			c[i].setNome(nome);
			c[i].setMontanteVendas(montanteVendas);

			System.out.print("*\n");
		}
		
		System.out.print("\n=== Impressão de dados ===\n");
		for(int i=0;i<c.length;i++) {
			System.out.print("\nDados do Cliente "+(i+1)+": "+c[i]);

			System.out.print("\n***\n");
		}

		System.out.print("\n=== Soma do Montante de Vendas dos Clientes ===\n");
		soma = 0.0f;
		for(int i=0;i<c.length;i++) {
			soma = soma + c[i].getMontanteVendas();
		}
		System.out.print("\nResultado total do montante de vendas: "+soma);

		sc.close();

		System.out.print("\n\n");
		
	}
}
