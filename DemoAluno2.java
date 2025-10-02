public class DemoAluno2 {
	public static void main(String[] args) {
    
		Aluno a  = new Aluno("João", 8.5f);

		System.out.print("\nValores nos atributos: "+a);

		System.out.print("\n\n=================\n");

		a.setNome("Maria");
		a.setNota(10.0f);
		System.out.print("\nValores nos atributos: "+a);

		System.out.print("\n\n");		
	}
}
