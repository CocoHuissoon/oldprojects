package remi_generics;
/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class GenericsWithMethods {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList();
        
        list.add("Hallo");
        list.add("Wereld");
        list.add("Jupiter");
        list.add("Wereld");
        

      
        Comparator comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1.equals(o2)){
                    return 0;
                }else {
                    return 1;
                }
            }
        };
        
        Collections.sort(list, comp);
        System.out.println(list);
        
    }
    
    // formeel parameter op methode alleen
    public <T> void doStuff(T t){
        System.out.println(t);
    }
    
    // met meerdere
    public <T, U> U doMoreStuff(T t){
        System.out.println(t);
        
        return (U) new Object();
    }
    
    // met meerdere
    public <T, U> void doEvenMoreStuff(T t, U u){
        System.out.println(" " + t + u);
    }
}
