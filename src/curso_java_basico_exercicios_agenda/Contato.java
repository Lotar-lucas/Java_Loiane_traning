package curso_java_basico_exercicios_agenda;

public class Contato {
	private String name;
	private String telefone;
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String nameContato) {
		this.name = nameContato;
	}
	
	public String getNumero() {
		return this.telefone;
	}
	
	public void setNumero(String numeroContato) {
		this.telefone = numeroContato;
	}
	

}
