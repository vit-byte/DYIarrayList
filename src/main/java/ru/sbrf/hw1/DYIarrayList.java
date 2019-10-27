package ru.sbrf.hw1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DYIarrayList<T> implements List<T> {

    public T [] elements;
    //private int eSize = 20;
    public DYIarrayList() {
        elements = (T[]) new Object[0];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() { return false; }
    @Override
    public boolean contains(Object o) { return false; }
    @Override
    public Iterator<T> iterator() { return null; }
    @Override
    public Object[] toArray() { return new Object[0]; }
    @Override
    public <T1> T1[] toArray(T1[] a) { return null; }

    @Override
    public boolean add(T t) {
        try {
            T[] tmp = elements;
            elements = (T[]) new Object[elements.length+1];
            System.arraycopy(tmp, 0, elements,0, tmp.length);
            elements[elements.length-1]=t;
            return true;
        } catch (ClassCastException e) {
            return false;
        }
    }


    @Override
    public boolean remove(Object o) { return false; }
    @Override
    public boolean containsAll(Collection<?> c) { return false;}

    @Override
    public boolean addAll(Collection<? extends T> c) {
        T[] tmpElements = elements;
        if (elements.length > 0 ) {
            elements = (T[]) new Object[elements.length + c.size()];
            System.arraycopy(tmpElements, 0, elements, 0, tmpElements.length);
            System.arraycopy(tmpElements, 0, c, (elements.length - c.size()), c.size());
            return true;
        } else {
            System.arraycopy(tmpElements, 0, c, 0, c.size());
            return true;
        }
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) { return false; }
    @Override
    public boolean removeAll(Collection<?> c) { return false; }
    @Override
    public boolean retainAll(Collection<?> c) { return false; }
    @Override
    public void clear() { }
    @Override
    public T get(int index) {
        return getElements()[index]; }
    @Override
    public T set(int index, T element) { return null; }
    @Override
    public void add(int index, T element) { }
    @Override
    public T remove(int index) { return null; }
    @Override
    public int indexOf(Object o) { return 0; }
    @Override
    public int lastIndexOf(Object o) { return 0; }
    @Override
    public ListIterator<T> listIterator() { return null; }
    @Override
    public ListIterator<T> listIterator(int index) { return null; }
    @Override
    public List<T> subList(int fromIndex, int toIndex) { return null; }

    public T[] getElements() {
        return elements;
    }

    public void setElements(T[] elements) {
        this.elements = elements;
    }
}
