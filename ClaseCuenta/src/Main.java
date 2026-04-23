 public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Thiago", "123", 0.02, 1000);
        Cuenta cuenta2 = new Cuenta("Juan", "456", 0.02, 500);

        if (cuenta1.ingreso(200)) {
            System.out.println("Ingreso realizado. Saldo: " + cuenta1.getSaldo());
        }

        if (cuenta1.extraccion(300)) {
            System.out.println("Extracción realizada. Saldo: " + cuenta1.getSaldo());
        }

        if (cuenta1.transferencia(cuenta2, 400)) {
            System.out.println("Transferencia realizada.");
        }

        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
    }
}