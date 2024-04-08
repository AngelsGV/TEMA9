package tablaSocios;

class Socio implements Comparable { //Utilizo la interfaz que pide el problema
    // Atributos
    String nombre;
    int edad;

    // Constructor
    public Socio(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    // Para ordenar por nombre
    @Override
    public int compareTo(Object ob) {
        Socio otroSocio = (Socio) ob;
        return this.nombre.compareTo(otroSocio.getNombre());
    }

    // Para mostrar en pantalla
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
