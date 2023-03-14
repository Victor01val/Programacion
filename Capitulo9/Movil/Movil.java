package Capitulo9.Movil;

public class Movil extends PruebaMoviles {
  private String tarifa;
private double totalTarificado;
    private String n1;
    private int tiempodeConversacion;
    private String animal;
  Movil(String numero, String tarifa) {

this.tarifa = tarifa;
this.totalTarificado = 0;
}
    
    public void llama(Movil t, int segundosDeLlamada) {
    
      double minutos = (double) segundosDeLlamada / 60;
      switch (this.tarifa) {
      case "rata":
      this.totalTarificado += minutos * 0.06;
      break;
      case "mono":
      this.totalTarificado += minutos * 0.12;
      break;
      case "bisonte":
      this.totalTarificado += minutos * 0.30;
      break;
      default:
      }
      }
    public void tiempo(int tiempo){
      this.tiempodeConversacion = this.tiempodeConversacion+tiempodeConversacion;
    }
    public int get(){
      return tiempodeConversacion;
    }
    public String toString() {
      return "N. " + n1 + " " + "tiempo de conversacion " +this.get() +" "+animal;
    }
  }
  
  