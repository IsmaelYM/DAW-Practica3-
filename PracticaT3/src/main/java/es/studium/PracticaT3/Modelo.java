package es.studium.PracticaT3;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
	Modelo() {}
	
	public static List<String> filtrarPalabrasPorLetra(String palabrasInput, char letra) {
        String[] palabrasArray = palabrasInput.split(",");
        List<String> palabras = new ArrayList<>();
        
        
        for (String palabra : palabrasArray) {
            palabras.add(palabra);
        }
        
     
        List<String> palabrasConLetra = new ArrayList<>();
        for (String palabra : palabras) {
            if (palabra.contains(Character.toString(letra))) {
                palabrasConLetra.add(palabra);
            }
        }
        return palabrasConLetra;
    }
}
