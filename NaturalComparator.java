package binarytrees;

import java.util.Comparator;

public class NaturalComparator implements Comparator<Object>
{
	public int compare(Object o1, Object o2)
	{
		return ((Comparable) o1).compareTo(o2);
	}
	
	public boolean equals(Object o)
	{
		boolean flag;
		flag = (o != null) && (o instanceof NaturalComparator);
		return flag;
	}
}
