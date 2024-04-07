package tablaSocios;

public class main {
    public static void main(String[] args) {
        List<tablaSocios> socios = new ArrayList<>();
        socios.add(new Socio("Juan", 1));
        socios.add(new Socio("María", 2));
        socios.add(new Socio("Pedro", 3));
        socios.add(new Socio("Ana", 4));

        // Ordenar la lista de socios por nombre
        Collections.sort(socios);

        // Mostrar la lista ordenada por pantalla
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}
