package cuenta;

/**
 * La clase CuentaSGJA2324T4 representa una cuenta bancaria con funcionalidades básicas
 * como ingresar dinero, retirar dinero y obtener el saldo actual.
 * Esta clase proporciona métodos para realizar estas operaciones de forma segura.
 * La cuenta está identificada por un nombre de titular, un número de cuenta IBAN,
 * un saldo inicial y un límite de descubierto.
 * @author sgja2324
 */
public class CuentaSGJA2324T4 {

    private String titular; 
    private String iban;    
    private double saldo;   
    private double descubierto; 

    /**
     * Constructor para la clase CuentaSGJA2324T4.
     * @param titular Nombre del titular de la cuenta.
     * @param iban Número de cuenta IBAN.
     * @param saldo Saldo inicial de la cuenta.
     * @param descubierto Límite de descubierto permitido para la cuenta.
     */
    public CuentaSGJA2324T4(String titular, String iban, double saldo, double descubierto) {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
        this.descubierto = descubierto;
    }

    /**
     * Método para obtener el estado actual de la cuenta.
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Método para ingresar dinero en la cuenta.
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa.");
        }
        saldo += cantidad;
    }

    /**
     * Método para retirar dinero de la cuenta.
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad a retirar excede el saldo más el límite de descubierto.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa.");
        }
        if (saldo - cantidad < -descubierto) {
            throw new Exception("No se puede retirar más dinero del disponible (incluyendo el descubierto).");
        }
        saldo -= cantidad;
    }
}