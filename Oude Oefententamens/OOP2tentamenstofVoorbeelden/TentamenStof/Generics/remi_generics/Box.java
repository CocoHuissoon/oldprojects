package remi_generics;
/*
 *  Vergeet het doel en de HBO-ICT Codeconventies niet!
 */


import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Remi de Boer <r.d.d.de.boer@hva.nl>
 */
public class Box {
    private Object value;
    
    public void add(Object obj){
        this.value = obj;
    }
    
    public Object getValue(){
        return this.value; // alleen maar object
    }
}


class StringBox {
    private String value;
    
    private void add(String obj){
        this.value = obj;
    }
    
    private String getValue(){
        return this.value; // alleen maar object
    }
}

class IntegerBox {
    private Integer value;
    
    private void add(Integer obj){
        this.value = obj;
    }
    
    private Integer getValue(){
        return this.value; // alleen maar object
    }
}

class IntegerObjectBox {
    private Object value;
    
    private void add(Object obj){ // bij gebruik zal hier @compile time met behulp van het formele parameter gecontroleerd worden of het Object van het juiste type is 
        this.value = obj;
    }
    
    private Integer getValue(){
        return (Integer) this.value; // de cast is wat de compiler produceert bij gebruik Generics
    }
}


class GenericBox<Type> {
    private Type value;
    
    public void add(Type obj){ // bij gebruik zal hier @compile time met behulp van het formele parameter gecontroleerd worden of het Object van het juiste type is 
        this.value = obj;
    }
    
    public Type getValue(){
        return this.value; // de cast is wat de compiler produceert bij gebruik Generics
    }
}

class GenericNumberBox<T extends Number> {
    private T value;
    
    public void add(T obj){ // bij gebruik zal hier @compile time met behulp van het formele parameter gecontroleerd worden of het Object van het juiste type is 
        this.value = obj;
    }
    
    public T getValue(){
        return this.value; // de cast is wat de compiler produceert bij gebruik Generics
    }
}

class GenericBoxTwo<Type, Type2> {
    private Type value;
    private Type2 value2;
    
    
    public void add(Type obj){ // bij gebruik zal hier @compile time met behulp van het formele parameter gecontroleerd worden of het Object van het juiste type is 
        this.value = obj;
    }
    
    public void add2(Type2 obj){ // bij gebruik zal hier @compile time met behulp van het formele parameter gecontroleerd worden of het Object van het juiste type is 
        this.value2 = obj;
    }
    
    public Type getValue(){
        return this.value; // de cast is wat de compiler produceert bij gebruik Generics
    }
    
    public Type2 getValue2(){
        return this.value2; // de cast is wat de compiler produceert bij gebruik Generics
    }
    
}


class ArrayListContainer<T, S> {
    ArrayList<T> listT = new ArrayList();
    ArrayList<S> listS;
    GenericNumberBox<Number> nb = new GenericNumberBox();
}

class GenericArrayList<T> {
    private T[] mijnArray;
    
    public GenericArrayList(){
        mijnArray = (T[]) new Object[10];
    }
}


class Persoon {
    String name;
    int age;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persoon other = (Persoon) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}