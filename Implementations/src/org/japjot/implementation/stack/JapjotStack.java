package org.japjot.implementation.stack;

public class JapjotStack {

	//public static final int max = 1000;
	int arr[] ;
	int max;
	int size = max;
	int top;
	JapjotStack(int max)
	{
		this.max = max;
		top=-1;
		arr = new int[this.max];
	}
	
	boolean IsEmpty()
	{
		return(top<0);
	}
	
	void push(int x) 
	{
		if(top>=this.max)
			System.out.println("Stack is overflown");
		else
			arr[++top] = x;
	}
	int pop()
	{
		if(top<0) {
			System.out.println("Stack Underflow");
		return 0;
		}
		else 
		{
			int x1 = arr[top--];
			return x1;
		}
     }
	 
	int peek()
	{
		if(top<0) {
			System.out.println("Stack Underflow");
		    return 0;
		}
		else 
		{
			int x = arr[top];
			return x;
		}
     }
 
	int get(int index)
	{
		if(index<=top)
		{
			return arr[index];
		}
		else 
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
}
