package remi_generics;
/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */


import java.util.HashMap;
import java.util.Map;

 

/**
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class BoxRunner {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap();
        GenericBox<Map> gb = new GenericBox<>();
        gb.add(map);
        
        map.put("Bas", "Asus");
        map.put("Brian", "Acer");
        map.put("Lorenzo", "Asus");
        
        System.out.println(map.get("Lorenzo"));
        
    }
    
    public <T, U> T getStuffDone(T type, U anderType){
        return (T) new Object();
    }
    
}
