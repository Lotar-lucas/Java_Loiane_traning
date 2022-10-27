package curso_java_basico_exercicios_interfaces;

public class Quadrado extends Figura2D {
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularVolume() {
		return 0;
	}

}
