
public class SimuladorSemaforo {

	public static void main(String[] args) {
		ThreadSemaforos semaforo = new ThreadSemaforos();

		for (int i = 0; i < 10; i++) {
			System.out.println(semaforo.getCor());

			semaforo.esperaCorMudar();
		}
		
		semaforo.desligarSemaforo();
	}

}
