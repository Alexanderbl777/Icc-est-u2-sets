package controllers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio {
    

    public Ejercicio(){
        System.out.println("Ejercicio 1");
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[] {1,2,3,4,5,4,3,2,45}));
        System.out.println("Ejercicio 2");
        System.out.println(esIsograma(new String("murcielago")));
        System.out.println(esIsograma(new String("camaleon")));
        String frase = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";      

        System.out.println("Ejercicio 3");
        System.out.println(contarPalabrasUnicas(new String(frase)));
        System.out.println(contarPalabrasUnicas(texto1));
        System.out.println(contarPalabrasUnicas(texto2));
        System.out.println("Ejercicio");
        System.out.println(palabrasComunes(texto1, texto2));
        System.out.println(porcentaje(texto1, texto2)+"%");
        System.out.println("Palabras unicas -> "+palabrasUnicasT(texto1, texto2));

    }
    public boolean tieneDuplicados(int[] numeros){

        Set<Integer> set = new HashSet<>();

        for (int i : numeros) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra){
        Set<Character> set = new HashSet<>();

        for (char p : palabra.toCharArray()) {
            if (!set.add(p)) {
                return false;
            }
        }
        return true;
    }

    public int contarPalabrasUnicas(String frase){
        int cont = 0;
        Set<String> set = new HashSet<>();

        for (String f : frase.split(" ")) {
            if(set.add(f)){
                cont++;
            }
        }
        return cont;
        
    }

    public int palabrasComunes(String text1, String text2){
        
        Set<String> set1 = new HashSet<>(Arrays.asList(text1.split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(text2.split("\\s+")));

        set1.retainAll(set2); 
        return set1.size(); 

    }
    
    public double porcentaje(String text1, String text2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(text1.split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(text2.split("\\s+")));

        Set<String> comunes = new HashSet<>(set1);
        comunes.retainAll(set2); 

        Set<String> totalUnico = new HashSet<>(set1);
        totalUnico.addAll(set2); 

        if (totalUnico.isEmpty()) return 0.0; 

        return (comunes.size() * 100.0) / totalUnico.size();
    }
    
    public Set<String> palabrasUnicasT(String text1, String text2) {
        Set<String> set1 = new HashSet<>(Arrays.asList(text1.split("\\s+")));
        Set<String> set2 = new HashSet<>(Arrays.asList(text2.split("\\s+")));

        Set<String> unicas = new HashSet<>(set1);
        unicas.addAll(set2);

        Set<String> comunes = new HashSet<>(set1);
        comunes.retainAll(set2); 

        unicas.removeAll(comunes); 
        return unicas;
}


}
