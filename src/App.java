//import java.util.HashSet;

import java.util.Set;

import controllers.ContactoControler;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {

        
        ContactoControler contact = new ContactoControler();
        

        /** 
       System.out.println("Alexander Beltran");
        Sets sets = new Sets();
        System.out.println("-> HashSet");
        runHashSet(sets);
        System.out.println("-------------------------");
        System.out.println("-> LinkedHashSet");
        runLinkedHashSet(sets);
        System.out.println("-------------------------");
        System.out.println("-> TreeSet");
        runTreeSet(sets);
        System.out.println("-------------------------");
        System.out.println("-> TreeSetComparador");
        runTreeSetCom(sets);
        System.out.println("-------------------------");
        System.out.println("-> TreeSetComparador");
        runTreeSetComR(sets);*/
    }

    public static void runHashSet(Sets sets){

        Set<String> palabras = sets.construirHashSet();
        for (String p : palabras) {
            System.out.println(p);
        }
    }

    public static void runLinkedHashSet(Sets sets){

        Set<String> palabras = sets.construirLinkedHashSet();
        for (String p : palabras) {
            System.out.println(p);
        }
    }

    public static void runTreeSet(Sets sets){

        Set<String> palabras = sets.construirTreeSet();
        for (String p : palabras) {
            System.out.println(p);
        }
    }

    public static void runTreeSetCom(Sets sets){

        Set<String> palabras = sets.construirTreeSetConComparador();
        for (String p : palabras) {
            System.out.println(p);
        }
    }

    public static void runTreeSetComR(Sets sets){

        Set<String> palabras = sets.construirTreeSetConComparadorR();
        for (String p : palabras) {
            System.out.println(p);
        }
    }
}
