package utils;

import java.util.Comparator;


import models.Contacto;

public class ContactoComparatorHash implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int res = Integer.compare(
            o1.getNombre().hashCode(), 
            o2.getNombre().hashCode()
        );

        if (res != 0) {
            return res;
        }

       
        return 0;
}



    
}
