package Capitulo9.Objetos.Movil;

public class Movil extends PruebaMoviles {
  private String tarifa;
private String n1;
    private int tiempodeConversacion;
    private String animal;
  Movil(String numero, String tarifa) {

this.tarifa = tarifa;
}
    
    public void llama(Movil t, int segundosDeLlamada) {
    
      switch (this.tarifa) {
      case "rata":
          break;
      case "mono":
          break;
      case "bisonte":
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
  
  