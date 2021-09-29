package Java_B10_java.util.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[] ;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = (E[]) new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(E e) {
        size += 1;
        ensureCapa();
        elements[size - 1] = e;
    }

    public boolean add(E e, int index) {
        if (index >= 0 && index <= size) {
            size += 1;
            ensureCapa();
            for (int i = size - 2; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            return true;
        }
        return false;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            size -= 1;
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public MyList clone() {
        MyList<E> clone = new MyList<>(elements.length);
        for (E x : elements) {
            clone.add(x);
        }
        return clone;
    }


    public boolean contains(E e) {
        for (Object x : elements) {
            if (e.equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    public E get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public E[] getData() {
        return this.elements;
    }

}
