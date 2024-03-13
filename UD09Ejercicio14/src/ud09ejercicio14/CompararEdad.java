package ud09ejercicio14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class CompararEdad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int orden = 0;
        
        LocalDate o1Fecha = LocalDate.parse(((Cliente)o1).fechaNac, f);
        LocalDate o2Fecha = LocalDate.parse(((Cliente)o2).fechaNac, f);
        
        if(o1Fecha.isBefore(o2Fecha))
            orden = -1;
        else
            orden = 1;
        return orden;
    }
    
}
