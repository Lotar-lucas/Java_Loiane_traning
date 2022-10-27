package curso_java_basico_exercicios_agenda;

public class Agenda {
	private Contato[] contatos;
	private String name;
	
	public Agenda(String name) {
		this.name = name;
	}
	
	public Agenda() {
	}

	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String nameAgenda) {
		this.name = nameAgenda;
	}
	
	

}
