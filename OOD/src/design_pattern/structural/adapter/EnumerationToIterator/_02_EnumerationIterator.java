package design_pattern.structural.adapter.EnumerationToIterator;

import java.util.Enumeration;
import java.util.Iterator;

public class _02_EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public _02_EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
