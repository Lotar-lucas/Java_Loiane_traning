
public class ThreadSemaforos implements Runnable {
	private boolean parar;
	private CorSemaforo cor;
	private boolean corMudou;

	public ThreadSemaforos() {
		this.cor = CorSemaforo.VERMELHO;

		new Thread(this).start();
	}

	@Override
	public void run() {

		while (!parar) {

			try {
				/*switch (this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;

				case AMARELO:
					Thread.sleep(200);
					break;

				case VERDE:
					Thread.sleep(3000);
					break;

				default:
					break;
				}*/
				
				Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemaforo.VERDE;
			break;

		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;

		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;

		default:
			break;
		}
		this.corMudou = true;
		notify();
	}
	
	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou = false;
		
	}
	
	public synchronized void desligarSemaforo() {
		this.parar = true;
	}

	public CorSemaforo getCor() {
		return cor;
	}
}
