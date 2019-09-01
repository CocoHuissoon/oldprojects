import java.util.ArrayList;



public class Stack<E> {

    private ArrayList<E> stack = new ArrayList<>();

    public Stack() {

    }

    public E peak() {
        return this.stack.get(stack.size() - 1);
    }

    public E pop() {
        return this.stack.remove(stack.size() - 1);
    }

    public void print() {
        System.out.println(this.stack);
    }

    public Stack<E> push(E object) {
        this.stack.add(object);
        return this;
    }
}