package Capitulo9.Terminal;

public class Term {
  private String n1;
  private int tiempodeConversacion;

  Term(String n1){
  this.n1 = n1;
  tiempodeConversacion = 0;
  }
  
  public void llama(Term t, int tiempodeConversacion){
    this.tiempodeConversacion = this.tiempodeConversacion+tiempodeConversacion;
    
  }
  public void tiempo(int tiempo){
    this.tiempodeConversacion = this.tiempodeConversacion+tiempodeConversacion;
  }
  public int get(){
    return tiempodeConversacion;
  }
  public String toString() {
    return "N. " + n1 + " " + "tiempo de conversacion " +this.get();
  }
}

