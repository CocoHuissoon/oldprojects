package remi_generics;
/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */
/**
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class CustomException extends Exception {

    public CustomException() {
    }

    CustomException(String de_fout) {
        super(de_fout);
    }
    
}
