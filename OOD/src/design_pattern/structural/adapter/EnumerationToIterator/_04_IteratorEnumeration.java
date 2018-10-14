package design_pattern.structural.adapter.EnumerationToIterator;

import java.util.*;

public class _04_IteratorEnumeration implements Enumeration {
    
	Iterator iterator;
 
	public _04_IteratorEnumeration(Iterator iterator) {
		this.iterator = iterator;
	}
 
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}
 
	public Object nextElement() {
		return iterator.next();
	}
}
