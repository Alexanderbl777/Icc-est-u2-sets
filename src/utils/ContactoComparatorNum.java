package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparatorNum implements Comparator<Contacto>{

     @Override
    public int compare(Contacto o1, Contacto o2) {
    // Comparar por apellido
        int result = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        if (result != 0) return result;

    // Si apellidos son iguales, comparar por nombre
        result = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        if (result != 0) return result;

    // Si nombre también es igual, comparar por teléfono
        return o1.getTelefono().compareToIgnoreCase(o2.getTelefono());
    }
    
}