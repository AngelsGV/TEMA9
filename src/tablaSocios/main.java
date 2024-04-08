package tablaSocios;

import java.util.Arrays;


public class main {
    public static void main(String[] args) {

        Socio[] socios = new Socio[]{
                new Socio("Eriòs", 29),
                new Socio("Angels", 24),
                new Socio("Javi", 30),
                new Socio("Lara", 27)
        };

        // Ordenar la lista de socios por nombre
        Arrays.sort(socios);
        System.out.println(Arrays.deepToString(socios) + "\n");


        // Mostrar la lista ordenada por pantalla
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}
