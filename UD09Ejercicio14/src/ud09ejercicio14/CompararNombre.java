
package ud09ejercicio14;

import java.util.Comparator;

public class CompararNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int orden = 0;
        if(((Cliente)o1).nombre.compareTo(((Cliente)o2).nombre) > 0)
            orden = 1;
        else
            orden = -1;
        return orden;
    }
    
}
