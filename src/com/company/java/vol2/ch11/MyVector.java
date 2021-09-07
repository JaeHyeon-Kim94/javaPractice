package com.company.java.vol2.ch11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {

    //Field
    Object[] data = null;   //객체를 담기 위한 배열
    int capacity = 0;       //용량
    int size = 0;           //크기

    //Constructor
    public MyVector(int capacity){
        if ( capacity < 0 ){
            throw new IllegalArgumentException("유효하지 않은 값입니다. :" + capacity);
        }

        this.capacity = capacity;
        data = new Object[capacity];

    }

    public MyVector(){
        this(10);
    }

    //method

    public void ensureCapacity(int minCapacity){
        if(minCapacity - data.length > 0){
            setCapacity(minCapacity);
        }
    }

    public boolean add(Object obj) {
        ensureCapacity(size+1);
        data[size++] = obj;
        return true;
    }

    public Object get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }

        return data[index];
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index){
        Object oldObj = null;

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }

        oldObj = data[index];

        if(index != size-1){
            System.arraycopy(data, index+1, data, index, size-index-1);
        }
        data[size-1] = null;
        size--;
        return oldObj;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean remove(Object obj){
        for(int i=0; i<size; i++){
            if(obj.equals(data[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public void trimTosize(){
        setCapacity(size);
    }

    private void setCapacity(int capacity){
        if(this.capacity==capacity) {
            return;
        }

        Object[] temp = new Object[capacity];
        System.arraycopy(data, 0, temp, 0, size);
        data = temp;
        this.capacity = capacity;
    }

    public void clear() {
        for(int i = 0; i < size; i++){
            data[i] = null;
        }
        size = 0;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public int capacity() {
        return capacity;
    }

    public int size() {
        return size;
    }


}
