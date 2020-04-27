package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    public int compare(String one, String two){
        return two.compareTo(one);
    }
}
