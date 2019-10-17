package org.japjot.implementation.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

import org.japjot.implemetation.linkedlist.JapjotLinkedList.Node;

public class JapjotHashmap {

	public class Key{
		String key;
		Key (String key)
		{
			this.key = key;
		}
		@Override
		public int hashCode()
		{
			return (int)key.charAt(0);
		}
		@Override
		public boolean equals(Object obj)
		{
			return key.equals((String)obj);
		}
		Node head;
		
		 class Node
		{
			int data;
			Node next;
			Key key;
			int hash;
		      Node (int d, Key key)
		    {
			    data = d;
			    this.key = key;
			    this.hash = hashCode();
			    this.next = null;
		    }
		}
		
	}
	
	
	
	
	
}
