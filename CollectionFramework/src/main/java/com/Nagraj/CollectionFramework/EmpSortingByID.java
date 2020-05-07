package com.Nagraj.CollectionFramework;

public class EmpSortingByID implements Comparable<Object>
{
   int id;
   String name;
public EmpSortingByID(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "EmpSortingByID [id=" + id + ", name=" + name + "]";
}
public int compareTo(Object o) {
	int id1 = this.id;
	EmpSortingByID e = (EmpSortingByID) o;
	int id2 = e.id;
	if(id1<id2)
		return -1;
	if(id1>id2)
		return 1;
	else 
		return 0;
}
   
   
}
