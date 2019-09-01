import java.util.ArrayList;
import java.util.NoSuchElementException;

public class HeapArray <T extends Comparable<T>>{
	

	private ArrayList<T> items = new ArrayList<T>();

    public void insert(T item) {
        items.add(item);
        siftUp();
    }

    private void siftUp() {
        int k = items.size() - 1;

        while(k > 0) {
            int p = (k - 1) / 2;

            T child = items.get(k);
            T parent = items.get(p);

            if (child.compareTo(parent) > 0) {
                //swap
                items.set(k, parent);
                items.set(p, child);

                //adjust k
                k = p;
            } else {
                break;
            }
        }

    }

    private void siftDown() {
        int k = 0;
        int left = 1;

        while(left < items.size()) {
            int max = left;
            int right = left + 1;
            if(right < items.size()) {
                if(items.get(right).compareTo(items.get(left)) > 0) {
                    max = right;
                }
            }
            T parent = items.get(k);
            T child = items.get(max);

            if(parent.compareTo(child) < 0) {
                //swap
                items.set(k, child);
                items.set(max, parent);

                k = max;
                left = 2*k+1;
            }
            else {
                break;
            }
        }
    }

    public T remove() throws NoSuchElementException {
        if(items.size() == 0) {
            throw new NoSuchElementException();
        }
        else if (items.size() == 1) {
           return items.remove(0);
        }

        T tmp = items.get(0);
        items.set(0, items.remove(items.size()-1));
        siftDown();
        return tmp;
    }
    @Override
	public String toString() {
		return "MaxHeapArray [items=" + items + "]";
	}


}
