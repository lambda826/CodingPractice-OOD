package ood.design_patterns.adapter.EnumerationToIterator;

import java.util.*;

public class _03_EnumerationIteratorTestDrive {
    public static void main(String args[]) {

        Vector<String>  v = new Vector<String> (Arrays.asList(args));
        Iterator<String>  iterator = new _02_EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
