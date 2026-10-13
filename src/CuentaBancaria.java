public class CuentaBancaria {

private String nombreTitular;
private int numeroCuenta;
private double saldoActual;

public CuentaBancaria(String nombreTitular, int numeroCuenta, double saldoActual){
    this.nombreTitular = nombreTitular;
    this.numeroCuenta = numeroCuenta;
    this.saldoActual = saldoActual;
}

    private String getNombreTitular(){
    return nombreTitular;
}

    private int getNumeroCuenta(){
    return numeroCuenta;
}

    private double getSaldoActual(){
    return saldoActual;
}

    private void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    private void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    private void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

   public void agregarSaldo(double monto){
        if (monto <= 0){
            System.out.println("Ingrese una cantidad positiva de dinero");
        }else{
            saldoActual += monto;
            System.out.println("Se agregó " + monto + " a la cuenta");
            System.out.println("Saldo actualizado: " + saldoActual);
        }
    }

    public boolean retirarSaldo(double monto){
        if (monto <= 0){
            System.out.println("Ingrese una cantidad positiva de dinero");
        }
        if(monto > saldoActual){
            System.out.println("El monto excede el saldo de la cuenta. " );
        }else{
            saldoActual -= monto;
            System.out.println("Se retiro " + monto + " de la cuenta");
            System.out.println("Saldo actualizado: " + saldoActual);

        }
        return false;
    }
void mostrarDatos(){
    System.out.println("================================================");
    System.out.println("Nombre del titular: " + this.nombreTitular);
    System.out.println("Saldo actual: " + this.saldoActual);
    System.out.println("================================================");
}
}
