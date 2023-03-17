
/*
*Este ejercicio no lo entendía muy bien, lo he copiado del libro, pero ya lo he entendido
*/
package Capitulo9.Objetos.TarjetaRegalo;

import java.text.DecimalFormat;

public class TarjetaRegalo {
  String numero;
  double saldo;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;

    this.numero = "";
    for (int i = 0; i < 5; i++) {
      this.numero += (int) (Math.random() * 10);
    }
  }

  public String toString() {
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + "€";
  }

  void gasta(double gasto) {
    if (gasto > saldo) {
      System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", gasto);

    } else {
      saldo -= gasto;
    }
  }

  TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    double nuevoSaldo = this.getSaldo() + t.getSaldo();
    this.setSaldo(0);
    t.setSaldo(0);
    return new TarjetaRegalo(nuevoSaldo);
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }
}
