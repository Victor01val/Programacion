/**
 * @Víctor
 * Banco con cuenta de ahorro y cuenta corriente
 */
package Capitulo10.Banco;
import java.util.ArrayList;
public class Main {
 


    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        // Crear algunas cuentas bancarias
        CuentaCorriente cc1 = new CuentaCorriente("ES11111111111111111111", 5000.0);
        CuentaAhorro ca1 = new CuentaAhorro("ES22222222222222222222", 1500.0);
        CuentaCorriente cc2 = new CuentaCorriente("ES33333333333333333333", 8000.0);
        CuentaAhorro ca2 = new CuentaAhorro("ES44444444444444444444", 2000.0);

        // Añadir las cuentas al ArrayList
        cuentas.add(cc1);
        cuentas.add(ca1);
        cuentas.add(cc2);
        cuentas.add(ca2);

        // Realizar algunas operaciones
        cc1.ingresar(1000.0);
        ca1.retirar(500.0);
        cc1.transferir(2000.0, ca1);
        ca1.transferir(1000.0, cc2);
        cc2.calcularIntereses();
        ca2.calcularIntereses();

        // Mostrar los datos de las cuentas y los intereses
        for (CuentaBancaria cuenta : cuentas) {
            cuenta.mostrarDatos();
            cuenta.calcularIntereses();
            

}
    }
  }

