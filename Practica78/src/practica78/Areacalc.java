package practica78;

public class Areacalc {

    double base;

    double altura;

    double resultado;

    public void setArea(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.resultado = (base * altura) / 2;
    }

    public double getResultado() {
        return resultado;
    }
}
