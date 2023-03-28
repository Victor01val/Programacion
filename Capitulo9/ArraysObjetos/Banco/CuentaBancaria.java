package Capitulo9.ArraysObjetos.Banco;

public abstract class CuentaBancaria {
  private String iban;
  private double saldo;
  protected static double interesAnualBasico = 0.01; // Tasa de interés anual básico

  public CuentaBancaria(String iban, double saldo) {
      this.iban = iban;
      this.saldo = saldo;
  }

  public String getIban() {
      return iban;
  }

  public double getSaldo() {
      return saldo;
  }

  public void ingresar(double cantidad) {
      añadir(cantidad);
  }

  public void retirar(double cantidad) {
      añadir(-cantidad);
  }

  public void transferir(double cantidad, CuentaBancaria destino) {
      retirar(cantidad);
      destino.ingresar(cantidad);
  }

  public void añadir(double cantidad) {
      saldo += cantidad;
  }

  public abstract void calcularIntereses();

  public void mostrarDatos() {
      System.out.println("IBAN: " + iban);
      System.out.println("Saldo: " + saldo);
  }
}
  

