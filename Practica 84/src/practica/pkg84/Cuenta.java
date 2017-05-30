package practica.pkg84;

public class Cuenta {

    private String nombre;

    private String apellido1;

    private String apellido2;

    private String dni;

    private String tipo;

    private long n_cuenta;

    private double interes;

    private double saldo;

    public Cuenta(String nombre, String apellido1, String apellido2, String dni, String tipo, long n_cuenta, double interest, double saldo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.tipo = tipo;
        this.n_cuenta = n_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(Cuenta C1) {
        this.nombre = C1.nombre;
        this.apellido1 = C1.apellido1;
        this.apellido2 = C1.apellido2;
        this.dni = C1.dni;
        this.tipo = C1.tipo;
        this.n_cuenta = C1.n_cuenta;
        this.interes = C1.interes;
        this.saldo = C1.saldo;
    }

    public void setIngreso(double cantidad) {
        this.saldo += cantidad;
    }

    public void setReintegro(double cantidad) {
        this.saldo -= cantidad;
    }

    public void setTransferencia(Cuenta C2, double cantidad) {
        this.saldo -= cantidad;
        C2.saldo += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDni() {
        return dni;
    }

    public String getTipo() {
        return tipo;
    }

    public long getN_cuenta() {
        return n_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setN_cuenta(long n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
