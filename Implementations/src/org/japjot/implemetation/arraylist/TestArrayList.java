package org.japjot.implemetation.arraylist;

import java.util.LinkedList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
	JapjotArrayList jpj = new JapjotArrayList();
	jpj.add(54);
	jpj.add(56);
	jpj.add(58);
	jpj.add(2,60);
	for( int i=0;i<jpj.size();i++)
	{
		System.out.println(jpj.get(i));
	}
	}
}
