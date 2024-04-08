package tablaSocios;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(new Socio("Eriòs", 1324));
        socios.add(new Socio("Angels", 2938));
        socios.add(new Socio("Javi", 3345));
        socios.add(new Socio("Lara", 12434));

        // Ordenar la lista de socios por nombre
        Collections.sort(socios);

        // Mostrar la lista ordenada por pantalla
        for (Socio socio : socios) {
            System.out.println(socio);
        }
    }
}
