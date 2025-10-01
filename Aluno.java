public class Aluno {
	private String nome;
	private float nota;

	public Aluno2(String nome, float nota) {
		this.nome = nome;
		this.nota = nota;
	}
	public Aluno2(String nome) {
		this(nome, 0.0f);
	}
	public Aluno2() {
		this("", 0.0f);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota() {
		return this.nota;
	}

	public String toString() {
		String r;
		r = "\nNome: "+this.nome+"\nNota: "+this.nota;
		return r;
	}
}
