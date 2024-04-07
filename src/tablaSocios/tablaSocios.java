package tablaSocios;

class tablaSocios implements Comparable<tablaSocios> {
    private String nombre;
    private int id;

    public tablaSocios(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(tablaSocios otroSocio) {
        return this.nombre.compareTo(otroSocio.nombre);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}