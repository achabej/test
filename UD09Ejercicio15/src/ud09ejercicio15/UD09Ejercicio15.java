
package ud09ejercicio15;

import java.util.*;

public class UD09Ejercicio15 {

    public static void main(String[] args) {
        List<Integer> coleccionNum = new ArrayList<>();
        
        for(int i = 0; i < 20; i++)
            coleccionNum.add((int)(Math.random() * 10+1));
        
        System.out.println("Coleccion Original:");
        //Comparator<Integer> c = new Comparator.naturalOrder();
        //coleccionNum.sort(c);
        System.out.println(coleccionNum);
        
        Set<Integer> coleccionNumIndiv = new LinkedHashSet<>();
        coleccionNumIndiv.addAll(coleccionNum);
        
        System.out.println("\nColeccion Sin Repetidos:");
        System.out.println(coleccionNumIndiv);
        
        Set<Integer> coleccionNumRepet = new TreeSet<>();

        for(Integer e : coleccionNumIndiv){
            coleccionNum.remove(e);
        }
        coleccionNumRepet.addAll(coleccionNum);
        
        System.out.println("\nColeccion Solo Repetidos:");
        System.out.println(coleccionNumRepet);
        
        Set<Integer> coleccionNumNoRepet = new TreeSet<>();
        coleccionNumNoRepet.addAll(coleccionNumIndiv);
        coleccionNumNoRepet.removeAll(coleccionNumRepet);
        
        System.out.println("\nColeccion Solo No Repetidos:");
        System.out.println(coleccionNumNoRepet);
    }
    
}
