package remi_generics;
/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */

import java.util.Iterator;

/**
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class Staks {
    
}


class Stack<E>{
    private E[] stack;
    
    public Iterator<E> iterator(){
        return new StackIterator(stack);
    }
    
    public void push(E object) throws CustomException{
        if(stack.length == 0){
            throw new CustomException("De fout");
        }
    }

}

class StackIterator<T> implements Iterator<T> {

    private T[] list;
    private int pointer;
    
    public StackIterator(T[] list){
        this.list = list;
    }
    
    @Override
    public boolean hasNext() {
        return pointer < list.length - 1; // onvolledig
    }

    @Override
    public T next() {
        // throws Exception if no next is found
        return list[0];
    }
    
}