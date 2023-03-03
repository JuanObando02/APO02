package actividadclase5;

public class cuenta {
	private double saldo;
	
	public cuenta (double x) {
		if (x > 0.0) {
			saldo = x;
		}
	}
	public void abonar(double monto) {
		saldo=+monto;
	}
	public double obtenersaldo() {
		return saldo;
	}
	public void retiro(double retiro) {
		saldo=-retiro;
	}
	

}
