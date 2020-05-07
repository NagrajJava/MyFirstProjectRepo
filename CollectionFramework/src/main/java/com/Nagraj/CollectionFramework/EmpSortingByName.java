package com.Nagraj.CollectionFramework;

import java.util.Comparator;

public class EmpSortingByName implements Comparator<Object>{

	public int compare(Object o1, Object o2) {
		EmpSortingByID ename1 = (EmpSortingByID) o1;
		EmpSortingByID ename2 = (EmpSortingByID) o2;
		String s1 = ename1.name;
		String s2 = ename2.name;
		return s1.compareTo(s2);
		
	}

}
