package org.japjot.implemetation.arraylist;

import java.util.Arrays;

public class JapjotArrayList {

	
	Object arr [];
	private int actsize=0;
	
	public JapjotArrayList(){
		arr = new Object[10];
	}
	public int size() {
		return actsize;
	}
	public void add(Object a)
	{
		if(arr.length-actsize<=5)
			increaseArraySize();
		else
		{
			arr[actsize++] = a; 
		}
		
	}
	public Object get(int index) {
		if(index<actsize)
		{
			return arr[index];
		}
		else
			throw new ArrayIndexOutOfBoundsException() ;
	}

	public Object remove(int index)
	{
		
		if(index<actsize)
		{
			int temp = index ;
			Object a = arr[index];
			arr[index] = null;
			while(temp!=arr.length-1)
			{
				arr[temp] = arr[temp+1];
				arr[temp+1] = null;
				temp++;
			}
			actsize--;
			return a;
		}
		else 
			throw new ArrayIndexOutOfBoundsException() ;
		
	}
	public void increaseArraySize() {
		  arr = Arrays.copyOf(arr, arr.length*2);
		
	}
	 public void add(int index, Object a)
	 {
		 if(arr.length-actsize<=5)
				increaseArraySize();
			else
			{
				int temp = index;
				if(arr[index]!=null)
				{
					actsize++;
					temp=arr.length-1;
					while (temp>index)
					{
						arr[temp]= arr[temp-1];
						temp--;
					}
					arr[index]=a;
				}
				else
				{
					arr[index]=a;
					actsize++;
				}
				
			}
	 }
	
	
	
}
