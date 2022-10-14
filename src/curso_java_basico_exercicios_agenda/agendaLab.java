package curso_java_basico_exercicios_agenda;

import java.util.Scanner;

public class agendaLab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda:");
		Agenda agenda = new Agenda(scan.nextLine());
		
		//intancia de Array
		Contato[] contatos = new Contato[3];
		
		for (int index = 0 ; index < 3; index++) {
			System.out.println("Digite oas informações do contato " + (index + 1));
			Contato cont = new Contato();
			
			System.out.println("Entre com o nome:");
			cont.setName(scan.nextLine());
			
			System.out.println("Entre com o telefone:");
			cont.setNumero(scan.nextLine());
			
			System.out.println("Entre com o email:");
			cont.setEmail(scan.nextLine());
			
			contatos[index]= cont;
		}
		
		agenda.setContatos(contatos);

	}

}
