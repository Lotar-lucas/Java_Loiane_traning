package curso_java_basico_exercicios_interfaces;

public class Triangulo extends Figura2D  implements DimensaoSuperficial{
	private double altura;
	private double base;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	@Override
	public double calcularArea() {
		return ((altura * base) / 2);
		
	}
	@Override
	public double calcularVolume() {
		return 0;
		
	}
}
