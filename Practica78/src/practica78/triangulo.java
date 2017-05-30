package practica78;

public class triangulo {

    double base;

    double altura;

    double resultado;

    public void SetArea(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.resultado = (base * altura) / 2;
    }

    public double GetResultado() {
        return resultado;
    }
}
