package cuenta;


public class Main {
    public static void main(String[] args) {
        CuentaSGJA2324T4 miCuentaSGJA2324T4;
        double saldoActual;
        int x;

        miCuentaSGJA2324T4 = new CuentaSGJA2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaSGJA2324T4.estado()+"€");
        retiraDineroSGJA(miCuentaSGJA2324T4);

        ingresaDineroSGJA(miCuentaSGJA2324T4);
        saldoActual = miCuentaSGJA2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

    private static void ingresaDineroSGJA(CuentaSGJA2324T4 miCuentaSGJA2324T4) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaSGJA2324T4.ingresar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void retiraDineroSGJA(CuentaSGJA2324T4 miCuentaSGJA2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaSGJA2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
