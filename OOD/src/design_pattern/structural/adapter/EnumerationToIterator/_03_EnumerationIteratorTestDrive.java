package design_pattern.structural.adapter.EnumerationToIterator;

import java.util.*;

public class _03_EnumerationIteratorTestDrive {
    public static void main(String args[]) {

        Vector v = new Vector(Arrays.asList(args));
        Iterator iterator = new _02_EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
