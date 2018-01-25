package mx.calculo;

public class Calculo {
    public double calcular(double s) {
	return s*s;	
    }

    public double calcularIVA(double precio){
	return precio*0.16;
    }

    static public void main(String[] args){
	Calculo c = new Calculo();

	System.out.println("Resultado: " + c.calcular(2.0) + "");
    }
}
