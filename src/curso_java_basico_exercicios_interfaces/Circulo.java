package curso_java_basico_exercicios_interfaces;

public class Circulo extends Figura2D{
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return (raio * raio) * Math.PI;
		
	}

	@Override
	public double calcularVolume() {
		return 0;
		// TODO Auto-generated method stub
		
	}
}
