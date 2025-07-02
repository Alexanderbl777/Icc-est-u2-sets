package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparador implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        //Alfanumerico con apellidos
        int resultComparacionApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());

        //son iguales 
        if(resultComparacionApellido!=0){
            return resultComparacionApellido;
        }
        int resultComparacionNombre = o1.getNombre().compareToIgnoreCase(o2.getNombre());
        return resultComparacionNombre;
    }
    
}
