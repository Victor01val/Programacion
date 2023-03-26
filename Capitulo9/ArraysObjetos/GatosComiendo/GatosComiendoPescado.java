package Capitulo9.ArraysObjetos.GatosComiendo;



public class GatosComiendoPescado {
    
    public static void main(String[] args) {
        
        // Creamos un array de gatos
        Gato[] gatos = {new Gato("Tom"), new Gato("Lisa"), new Gato("Jerry"), new Gato("Leo"), new Gato("Caty")};
        
        // Creamos un array de pescados
        Pescado[] pescados = new Pescado[10];
        for(int i = 0; i < pescados.length; i++) {
            pescados[i] = new Pescado();
        }
        
        // Cada gato come los pescados en proporción igual
        //Calculamos cuántos pescados debe comer cada gato en proporción igual, teniendo en cuenta que puede haber pescados sobrantes que se repartirán entre los gatos restantes.
        int pescadosPorGato = pescados.length / gatos.length;
        int pescadosRestantes = pescados.length % gatos.length;
        int indexPescado = 0;
        for(Gato gato : gatos) {
            int pescadosEsteGato = pescadosPorGato;
            if(pescadosRestantes > 0) {
                pescadosEsteGato++;
                pescadosRestantes--;
            }
             // iteramos por cada pescado que le corresponde a este gato y comprobamos si aún no ha sido comido. Si el pescado no ha sido comido, imprimimos el nombre del gato seguido de "Ñam" y marcamos el pescado como comido.-;
            System.out.println("El gato " + gato.getNombre() + " está comiendo " + pescadosEsteGato + " pescados...");
            for(int i = 0; i < pescadosEsteGato; i++) {
                System.out.println(gato.getNombre() + ": Ñam");
                pescados[indexPescado].comer();
                indexPescado++;
            }
            System.out.println("El gato " + gato.getNombre() + " ha terminado de comer.");
        }
        
    }
    
}

class Gato {
    
    private String nombre;
    
    public Gato(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
}

class Pescado {
    
    private boolean comido;
    
    public Pescado() {
        this.comido = false;
    }
    
    public boolean estaComido() {
        return this.comido;
    }
    
    public void comer() {
        this.comido = true;
    }
    
}
