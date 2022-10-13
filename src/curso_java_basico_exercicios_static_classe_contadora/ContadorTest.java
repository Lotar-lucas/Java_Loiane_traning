package curso_java_basico_exercicios_static_classe_contadora;

public class ContadorTest {
	
 public static void main(String[] args) {
	 
	 //inicializar classe
	 
	 Contador contador = new Contador();
	 System.out.println(Contador.returnValor());
	 
	 //incrementar
	  
	 Contador.incrementar();
	  
	 System.out.println(Contador.returnValor());
	
	 
	 //zerar
	 Contador.zerarContador();
	 System.out.println(Contador.returnValor());
	 
	
}

}
