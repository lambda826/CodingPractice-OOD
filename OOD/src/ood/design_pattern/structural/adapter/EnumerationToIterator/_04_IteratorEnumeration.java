package ood.design_pattern.structural.adapter.EnumerationToIterator;

import java.util.*;

public class _04_IteratorEnumeration implements Enumeration<String>  {

    Iterator<String>  iterator;

    public _04_IteratorEnumeration(Iterator<String>  iterator) {
        this.iterator = iterator;
    }

    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    public String nextElement() {
        return iterator.next();
    }
}
