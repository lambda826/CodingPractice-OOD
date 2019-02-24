package ood.design_patterns.adapter.EnumerationToIterator;

import java.util.*;

public class _05_IteratorEnumerationTestDrive {
    public static void main(String args[]) {

        ArrayList<String>  l = new ArrayList<String> (Arrays.asList(args));
        Enumeration<String>  enumeration = new _04_IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
