package Capitulo10.Banco;

public class CuentaCorriente extends CuentaBancaria {
  public CuentaCorriente(String iban, double saldo) {
      super(iban, saldo);
  }

  public void calcularIntereses() {
      double intereses = getSaldo() * interesAnualBasico;
      añadir(intereses);
  }
}
  

