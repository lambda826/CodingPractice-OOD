package ood.design_pattern.structural.adapter.EnumerationToIterator;

import java.util.Enumeration;
import java.util.Iterator;

public class _02_EnumerationIterator implements Iterator<String>  {

    Enumeration<String> enumeration;

    public _02_EnumerationIterator(Enumeration<String> enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public String next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
