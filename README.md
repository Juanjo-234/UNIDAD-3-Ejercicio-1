Este programa está diseñado para modelar y gestionar una cuenta bancaria segura mediante la aplicación estricta del principio de encapsulamiento (ocultación de datos), validaciones defensivas de negocio para depósitos y extracciones, y el control de estado interno utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase CuentaBancaria: Declara atributos privados (titular, numeroCuenta, saldoActual) para proteger el estado interno de accesos externos directos.

Implementa métodos de negocio con validaciones estrictas:

depositar(double monto): Verifica que el monto sea estrictamente mayor a cero antes de incrementar el saldo.

extraer(double monto): Comprueba que el monto sea positivo y que no supere el saldo disponible, previniendo sobregiros o saldos negativos.

Proporciona métodos de acceso seguros (Getters/Setters y consulta): Permiten consultar la información general de la cuenta respetando la encapsulación de los datos sensibles.

Ejecuta la prueba en el main: Instancia una cuenta bancaria, prueba operaciones válidas (depósitos y extracciones correctas) e inválidas (intentar depositar montos negativos o extraer más dinero del disponible) y muestra los resultados y alertas por consola.
