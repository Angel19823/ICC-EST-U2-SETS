package utils;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class ContactoComparador {
    public int compare(Contacto c1, Contacto c2) {
        if(comparacionApellido != 0){

        }
    }

    public Set<String> compararNombre(){
        Comparator<String> comparadorPorLongitud = new Comparator<String>(){
            public int compare(String s1, String s2){
                int resultado = Integer.compare(s1.length(), s2.length() );
                if(resultado == 0){
                    resultado = s1.compareTo(s2);
                }
                return resultado;
            }
        };

        Set<String> miTreeSetComparador = new TreeSet<>(comparadorPorLongitud);

        miTreeSetComparador.add("Melon");
        miTreeSetComparador.add("Pera");
        miTreeSetComparador.add("Manzana");
        miTreeSetComparador.add("Fresa");
        miTreeSetComparador.add("Kiwi");
        miTreeSetComparador.add("Melocoton");
        miTreeSetComparador.add("Pera");

        return miTreeSetComparador;
    }
}
