package curso_java_basico_exercicios_interfaces;

public class Cilindro extends Figura3D {
	private int altura;
	private double raio;

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public double calcularVolume() {
		return  Math.PI * Math.pow(raio, 2) * altura;
		
	}
	@Override
	public double calcularArea() {
		 double areaBase = Math.PI * Math.pow(raio, 2);
		 double areaLateral = 2 *  Math.PI * raio * altura;
		 double areaTotal = (2 * areaBase) + areaLateral;

		return areaTotal;
	}

}
