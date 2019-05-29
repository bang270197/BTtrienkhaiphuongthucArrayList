package com.company;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        if (size >= element.length) {
            E[] newElement = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(element, 0, newElement, 0, size);
            element = newElement;
        }


    }

    //get v
    public E get(int index) {
        checkIndex(index);
        return (E) element[index];
    }

    //add v
    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    //add,index
    public void add(int index, E e) {
        ensureCapa();
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = e;
        size++;
    }

    //checkIndex
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException
                    ("Index " + index + " out of bounds");
        }
    }

    //remove
    public E remove(int index) {
        checkIndex(index);
        E e = (E) element[index];
        for (int i = index; i < size - 1; i++) {
            element[i] = element[i + 1];
        }
        element[size - 1] = null;
        size--;
        return e;
    }

    //side
    public int size() {
        return element.length;
    }

    //contains
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(element[i])) {
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e){
        for(int i=0;i<size;i++){
            if (e.equals(element[i]))
                return i;
        }
        return -1;
    }
    public void clear(){
        element=(E[])new Override[DEFAULT_CAPACITY];
    size=0;
    }
}
