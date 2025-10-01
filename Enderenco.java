public class Endereco {
	
	private String log;
	private int num;

	public void setLog(String log) {
		this.log = log;
	}	
	public String getLog() {
		return this.log;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}

	public void setEnd(Endereco end) {
		this.log = end.log;
		this.num = end.num;
	}
	public Endereco getEnd() {
		Endereco end = new Endereco();
		end.log = this.log;
		end.num = this.num;
		return end;
	}

	public boolean comparaEnderecos(Endereco end) {
		return ( this.log.equals(end.log) && this.num==end.num );
	}

	public String toString() {
		String r = "\nLogradouro: " + log + "\nNúmero: " + num;
		return r;
	}
}
