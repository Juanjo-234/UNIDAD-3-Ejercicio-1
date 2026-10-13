//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
CuentaBancaria cuentaBancaria = new CuentaBancaria("Juan Perez", 1234567, 1000);

cuentaBancaria.retirarSaldo(100);
cuentaBancaria.mostrarDatos();
}
