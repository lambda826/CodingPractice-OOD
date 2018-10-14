package design_pattern.structural.adapter.EnumerationToIterator;

import java.util.*;

public class _05_IteratorEnumerationTestDrive {
	public static void main (String args[]) {
	    
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new _04_IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}
}
