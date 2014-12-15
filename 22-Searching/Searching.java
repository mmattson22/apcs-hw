import java.util.*;
import java.io.*;

public class Searching {
    private Comparable[] a;

    public Searching(int n) {
        a=new Comparable[n];
    }

    public String toString() {
        return Arrays.toString(a);
    }

    public void additem(Comparable c, int index) {
        a[index]=c;
    }

    public void sort() {
        Arrays.sort(a);
    }

    private boolean matches(Comparable a, Comparable b) {
        return a.compareTo(b)==0;
    }

   

    public Comparable bSearch(Comparable object) {
        int initial=0;
        int end=a.length;
        while (end-initial > 1) {
            System.out.println(initial);
            System.out.println(end);
            int center=(initial + end)/2;
            if (matches(a[center], object)) {
                return center;
            } if (a[center].compareTo(object) > 0) {
                end=center; // go to the smaller half
            } else {
                initial=center; // go to the bigger half
            }
        }
        if (matches(a[initial], object)) {
            return initial;
        } else {
            return null;
        }
    }


    private Comparable rbSearch (Comparable object) {
	int initial = 0;
	int end = a.length;
        System.out.println(initial);
        System.out.println(end);
        if (end-initial <= 1) { 
            if (matches(a[initial], object)) {
                return initial;
            } else {
                return null;
            }
        } else {
            int center=(initial + end) / 2;
            if (matches(a[center], object)) {
                return center;
            } if (a[center].compareTo(object) > 0) {
                return rbSearch(object, initial, center);
            } else {
                return rbSearch(object, center, end);
            }
        }
    }

 
 public Comparable iSearch(Comparable object) {
        for (int i = 0; i < a.length; i++) {
            if (matches(object, a[i])) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int numItems = 50;
        Searching s = new Searching(numItems);
        for (int i = 0; i < numItems; i++) {
            s.additem((int)(Math.random() * numItems), i);
        }
        System.out.println(s);
        System.out.println(s.iSearch(4));
        s.sort();
        System.out.println(s);
        System.out.println("Done!");
        System.out.println(s.bSearch(7));
        System.out.println(s.rbSearch(18));
    }
}
