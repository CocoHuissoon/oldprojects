package remi_generics;
/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */
import java.util.List;

/**
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class Exhibit<T> { // nu alleen niet zeker wat er allemaal in gaat
    private T[] animals;
    private final static int ANIMAL_LIMIT = 8;
    private int animalCount;
    
    public Exhibit() {
        this.animals = (T[]) new Object[ANIMAL_LIMIT]; // kan geen array new T[8], dus cast nodig
    }
    
    public void add(T animal){
        if(animalCount < ANIMAL_LIMIT - 1){
            animals[animalCount] = animal;
            animalCount++;
        }
    }
    
    public int getAnimalCount(){
        return this.animalCount;
    }

}


