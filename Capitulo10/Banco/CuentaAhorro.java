package Capitulo10.Banco;

public class CuentaAhorro extends CuentaBancaria {
  private static double saldoMinimo = 1000.0; // Saldo mínimo para obtener el interés máximo

  public CuentaAhorro(String iban, double saldo) {
      super(iban, saldo);
  }

  public void calcularIntereses() {
      if (getSaldo() < saldoMinimo) {
          añadir(getSaldo() * (interesAnualBasico / 2));
      } else {
          añadir(getSaldo() * (2 * interesAnualBasico));
      }
  }
}
  

