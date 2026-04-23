public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double interes;
    private double saldo;

    public Cuenta() {
        this.nombreCliente = "";
        this.numeroCuenta = "";
        this.interes = 0;
        this.saldo = 0;
    }

    public Cuenta(String nombreCliente, String numeroCuenta, double interes, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double cantidad) {
        if (cantidad < 0) {
            return false;
        }
        saldo += cantidad;
        return true;
    }

    public boolean extraccion(double cantidad) {
        if (cantidad < 0 || saldo < cantidad) {
            return false;
        }
        saldo -= cantidad;
        return true;
    }

    public boolean transferencia(Cuenta destino, double importe) {
        if (importe < 0 || saldo < importe) {
            return false;
        }
        this.saldo -= importe;
        destino.saldo += importe;
        return true;
    }
}