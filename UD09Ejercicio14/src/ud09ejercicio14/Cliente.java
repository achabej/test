
package ud09ejercicio14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    String DNI;
    String nombre;
    String fechaNac;
    
    Cliente(String DNI, String nombre, String fechaNac){
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public String toString(){
        return "DNI: " + DNI + "/ nombre: " + nombre + "/ fechaNac: " + fechaNac;
    }
}
