package curso_java_basico_exercicios_static_classe_contadora;

public class Contador {
	
	private static int contador;
	
	public Contador() {
		super();
		Contador.contador++;
	}
	
	public static void zerarContador() {
		contador = 0;
	}
	
	public static void incrementar() {
		contador++;
	}
	
	public static int returnValor() {
		return contador;
	}
	

}
