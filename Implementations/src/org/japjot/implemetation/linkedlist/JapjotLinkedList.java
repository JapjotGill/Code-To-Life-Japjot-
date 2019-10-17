package org.japjot.implemetation.linkedlist;

public class JapjotLinkedList {

	Node head;
	
	public static class Node
	{
		int data;
		Node next;
	      Node (int d)
	    {
		    data = d;
	    }
	}
	
	public static JapjotLinkedList insert(JapjotLinkedList list , int a)
	{
		Node newNode = new Node(a);
		Node next=null;
		if(list.head==null)
		{
		   list.head = newNode;
		}
		
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next=newNode;
		}
		return list;
		
	}
	public static JapjotLinkedList deletebykey(JapjotLinkedList list , int key)
	{
	      Node currNode = list.head;
	      Node prev = null;
		
		if(currNode!=null && currNode.data==key)
		{
			list.head=currNode.next;
			return list;
		}
		
		
		
		while(currNode!=null && currNode.data!=key)
		{
			prev = currNode;
			currNode=currNode.next;
		}
		
		if(currNode!=null)
		{
			prev.next = currNode.next;
		}
		if(currNode==null)
		{
			System.out.println("Node not found");
		}
		return list;
		
	}
	 public static void printAll(JapjotLinkedList list) 
	    { 
	        Node currNode = list.head; 
	        System.out.print("LinkedList: "); 
	        while (currNode != null) 
	        { 
	            System.out.print(currNode.data + " ");    
	            currNode = currNode.next; 
	        } 
	    } 
	
	
}
