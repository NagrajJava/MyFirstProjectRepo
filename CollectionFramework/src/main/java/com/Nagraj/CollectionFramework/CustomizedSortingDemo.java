package com.Nagraj.CollectionFramework;

import java.util.TreeSet;

public class CustomizedSortingDemo
{
   public static void main(String args[])
   {
	   TreeSet<EmpSortingByID> ts = new TreeSet<EmpSortingByID>();
	     ts.add(new EmpSortingByID(1, "nagraj"));
	     ts.add(new EmpSortingByID(2,"raju"));
	     ts.add(new EmpSortingByID(6,"arogya"));
	     ts.add(new EmpSortingByID(3,"kislay"));
	     ts.add(new EmpSortingByID(5,"guru"));
	     ts.add(new EmpSortingByID(7,"badra"));
	     ts.add(new EmpSortingByID(4,"kiran"));
	     System.out.println(ts);
	     
	     TreeSet<EmpSortingByID> ts1 = new TreeSet<EmpSortingByID>(new EmpSortingByName());
	     ts1.add(new EmpSortingByID(1, "nagraj"));
	     ts1.add(new EmpSortingByID(2,"raju"));
	     ts1.add(new EmpSortingByID(6,"arogya"));
	     ts1.add(new EmpSortingByID(3,"kislay"));
	     ts1.add(new EmpSortingByID(5,"guru"));
	     ts1.add(new EmpSortingByID(7,"badra"));
	     ts1.add(new EmpSortingByID(4,"kiran"));
	     System.out.println(ts1);
   }
}
