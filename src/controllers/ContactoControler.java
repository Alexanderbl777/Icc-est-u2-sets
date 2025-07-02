package controllers;

import java.util.Set;
import java.util.TreeSet;
import models.*;
import utils.ContactoComparador;
import utils.ContactoComparatorHash;
import utils.ContactoComparatorNum;

public class ContactoControler {
    
    public ContactoControler(){
        System.out.println("Orden por Apellidos-Nombre");
        runTreeContact();
        System.out.println("Orden por Apellidos-Nombre-telefono");
        runTreeContactNum();
        System.out.println("Ordenar con HashCode");
        runTreeContactHash();
    }

    public void runTreeContact(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Gonzales", "2222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "2222222222"));

        for (Contacto a : agenda) {
            System.out.println(a);
        }
    }

    public void runTreeContactNum(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorNum());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Gonzales", "2222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "2222222222"));

        for (Contacto a : agenda) {
            System.out.println(a);
        }
    }

    public void runTreeContactHash(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparatorHash());
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Gonzales", "2222222222"));
        agenda.add(new Contacto("Pablo", "Lopez", "2222222222"));

        for (Contacto a : agenda) {
            System.out.println(a);
        }
    }

}
