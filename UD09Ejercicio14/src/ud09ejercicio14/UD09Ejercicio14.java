
package ud09ejercicio14;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UD09Ejercicio14 {

    public static void main(String[] args) {
        Set<Cliente> conjuntoClientes = new LinkedHashSet<>();
        
        conjuntoClientes.add(new Cliente("111", "Marta", "12-02-2000"));
        conjuntoClientes.add(new Cliente("115", "Jorge", "16-03-1999"));
        conjuntoClientes.add(new Cliente("112", "Carlos", "01-10-2002"));
        
        System.out.println("Conjunto original");
        System.out.println(conjuntoClientes);
        
        Set<Cliente> conjuntoOrdenadoEdad = new TreeSet<>(new CompararEdad());
        
        conjuntoOrdenadoEdad.addAll(conjuntoClientes);
        System.out.println("\nOrdenado por edad");
        System.out.println(conjuntoOrdenadoEdad);

        Set<Cliente> conjuntoOrdenadoNombre = new TreeSet<>(new CompararNombre());
               
        conjuntoOrdenadoNombre.addAll(conjuntoClientes);
        System.out.println("\nOrdenado por nombre");
        System.out.println(conjuntoOrdenadoNombre);
    }
    
}
