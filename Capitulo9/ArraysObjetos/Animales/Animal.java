package Capitulo9.ArraysObjetos.Animales;

// Creamos la clase Animal, de la que heredarán las clases concretas de cada tipo de animal

public class Animal {

    // Atributos comunes a todos los animales

    private String nombre;
    private String tipo;
    // Constructor de la clase Animal

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    // Métodos get y set del atributo nombre

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
}
// Clase concreta Perro que hereda de la clase Animal

class Perro extends Animal {
    private int edad;
    // Constructor de la clase Perro

    public Perro(String nombre, int edad) {
        super(nombre, "Perro");
        this.edad = edad;
    }
    // Método get del atributo edad

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Edad: " + edad);
    }
}
// Clase concreta Gato que hereda de la clase Animal

class Gato extends Animal {
    private String raza;
    // Constructor de la clase Gato

    public Gato(String nombre, String raza) {
        super(nombre, "Gato");
        this.raza = raza;
    }
    // Método get del atributo raza

    public String getRaza() {
        return raza;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Raza: " + raza);
    }
}
// Clase concreta Loro que hereda de la clase Animal

class Loro extends Animal {
    // Atributos específicos del loro

    private String color;
    // Constructor de la clase Loro

    public Loro(String nombre, String color) {
        super(nombre, "Loro");
        this.color = color;
    }
    // Método get del atributo color

    public String getColor() {
        return color;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color: " + color);
    }
}
// Clase concreta Canario que hereda de la clase Animal

class Canario extends Animal {
    // Atributos específicos del canario

    private boolean canta;
    // Constructor de la clase Canario

    public Canario(String nombre, boolean canta) {
        super(nombre, "Canario");
        this.canta = canta;
    }
    // Métodos get atributo canta

    public boolean getCanta() {
        return canta;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Canta: " + canta);
    }
}
