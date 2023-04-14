package Capitulo9.ArraysObjetos.Vehiculos;

//La clase abstracta Vehiculo, que tiene dos atributos privados
 abstract class Vehiculo {
  
    private String matricula;
    private String modelo;
//Constructor
    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
// Tiene dos métodos getMatricula() y getModelo().
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
//Declara un metodo abstracto para el resto de clases hijas
    public abstract void imprimir();
}
//La clase abstracta VehiculoTerrestre extiende Vehiculo y agrega un atributo numRuedas y un metodo getNumRuedas
abstract class VehiculoTerrestre extends Vehiculo {
    private int numRuedas;
//Constructor
    public VehiculoTerrestre(String matricula, String modelo, int numRuedas) {
        super(matricula, modelo);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
}
//La clase abstracta VehiculoAcuatico extiende Vehiculo y agrega un atributo eslora y un metodo getEslora()
abstract class VehiculoAcuatico extends Vehiculo {
    private double eslora;
//Constructor
    public VehiculoAcuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }
}
 
//La clase VehiculoAereo extiende Vehiculo y agrega un atributo numAsientos y el metodo getnumAsientos()
abstract class VehiculoAereo extends Vehiculo {
    private int numAsientos;
//Constructor
    public VehiculoAereo(String matricula, String modelo, int numAsientos) {
        super(matricula, modelo);
        this.numAsientos = numAsientos;
    }

    public int getNumAsientos() {
        return numAsientos;
    }
}
class Helicoptero extends VehiculoAereo { //La clase Helicoptero extiende VehiculoAereo y agrega un atributo numHelices y el metodo
    private int numHelices;
//Constructor
    public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }

    @Override
    public void imprimir() {
        System.out.println("Helicoptero: " + getMatricula() + ", modelo: " + getModelo() + ", num. asientos: "
                + getNumAsientos() + ", num. helices: " + numHelices);
    }
}
class Avion extends VehiculoAereo { //La clase Avion extiende VehiculoAereo y agrega un atributo tiempoMaximoVuelo y el metodo
    private int tiempoMaximoVuelo;
//Constructor
    public Avion(String matricula, String modelo, int numAsientos, int tiempoMaximoVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    public int getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }

    public void setTiempoMaximoVuelo(int tiempoMaximoVuelo) {
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    @Override
    public void imprimir() {
        System.out.printf("Avión: matrícula=%s, modelo=%s, numAsientos=%d, tiempoMaximoVuelo=%d%n",
                getMatricula(), getModelo(), getNumAsientos(), tiempoMaximoVuelo);
    }
}
class Submarino extends VehiculoAcuatico { //La clase Submarino extiende VehiculoAcuatico y agrega un atributo profundidadMaxima y el metodo
    private int profundidadMaxima;
//Constructor
    public Submarino(String matricula, String modelo, double eslora, int profundidadMaxima) {
        super(matricula, modelo, eslora);
        this.profundidadMaxima = profundidadMaxima;
    }

    public int getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(int profundidadMaxima) {
        this.profundidadMaxima = profundidadMaxima;
    }

    @Override
    public void imprimir() {
        System.out.printf("Submarino: matrícula=%s, modelo=%s, eslora=%.2f, profundidadMaxima=%d%n",
                getMatricula(), getModelo(), getEslora(), profundidadMaxima);
    }
}
class Coche extends VehiculoTerrestre { //La clase Coche extiende VehiculoTerrestre y agrega un atributo aireAcondicionado y el metodo getaireAcondicionado
    private boolean aireAcondicionado;
//Constructor
    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }

    public void imprimir() {
        System.out.println("Coche " + getModelo() + " con matrícula " + getMatricula() + ", " + getNumRuedas() + " ruedas y " + (aireAcondicionado ? "con aire acondicionado" : "sin aire acondicionado"));
    }
}

class Moto extends VehiculoTerrestre { //La clase Moto extiende VehiculoTerrestre y agrega un atributo color y el metodo getColor
    private String color;
//Constructor
    public Moto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void imprimir() {
        System.out.println("Moto " + getModelo() + " de color " + color + " con matrícula " + getMatricula() + " y " + getNumRuedas() + " ruedas");
    }
}

class Barco extends VehiculoAcuatico {
    private boolean tieneMotor;
//Constructor
    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }

    public boolean tieneMotor() {
        return tieneMotor;
    }

    public void imprimir() {
        System.out.println("Barco " + getModelo() + " con matrícula " + getMatricula() + " y eslora " +getEslora() );

}
    }

