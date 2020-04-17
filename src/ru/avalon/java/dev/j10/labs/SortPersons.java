package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;

public class SortPersons implements Sort {
    private Object[] objectsArray;
    private Comparable[] comparable;
    private PersonInfo[] personInfo;

    @Override
    public void sort(Object[] array) {

    }

    @Override
    public void sort(Comparable[] array){
        sortComparable(array, 0, array.length - 1);
    }
    public void sortComparable(Comparable[] a, int lo, int hi){
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sortComparable(a, lo, mid);
        sortComparable(a, mid + 1, hi);

        Comparable[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }

        this.comparable = a;
    }

    public Comparable[] getComparable(){
        return comparable;
    }

    public void sort(PersonInfo[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);

        PersonInfo[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }

        this.personInfo = a;
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        Arrays.sort(array, comparator);
    }

    public PersonInfo[] getPersonInfoArray() {
        return personInfo;
    }

    public Object[] getObjectsArray() {
        return objectsArray;
    }
}
