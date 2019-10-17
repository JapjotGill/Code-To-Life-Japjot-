package org.japjot.implementation.queue;

public class JapjotQueue {
	
    int capacity;
	int arr[] ;
	int front;
	int rear;
	int size;
	
	JapjotQueue(int capacity) 
	{
		this.capacity = capacity;
		rear = 0;
		arr = new int[this.capacity];
	    front = size= 0;
	}
	
	public boolean add(int x)
	{
		if(size>capacity)
		{
			System.out.println("Queue is Full");
			return false ;
		}
		else
		{
		arr[rear] = x;
		rear = (rear+1)%capacity;
		size++;
		return true;
		}
	}
	
	public Object remove()
	{
		if(size==0)
		{
			System.out.println("No element added");
			return null;
		}
	
		else
		{
			int d = arr[front];
			front = (front+1)%capacity;
			size--;
			return d;
		}
	}
	public void getAll()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[front+i] + " ");
		}
	}
	
	
	
	
	}
	
