package org.japjot.implemetation.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
	JapjotLinkedList jpj = new JapjotLinkedList();
    jpj.insert(jpj, 12);
    jpj.insert(jpj, 13);
    jpj.insert(jpj, 14);
    jpj.insert(jpj, 15);
    jpj.insert(jpj, 16);
    jpj.deletebykey(jpj, 14);
	
jpj.printAll(jpj);
	
	
	}
}
