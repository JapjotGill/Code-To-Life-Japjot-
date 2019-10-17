package org.japjot.implementation.queue;

public class TestQueue {

	public static void main(String[] args)
	{
		JapjotQueue jpj = new JapjotQueue(10);
		jpj.add(5);
		jpj.add(6);
		jpj.add(7);
		jpj.add(8);
		System.out.println("Removed " + jpj.remove());
		jpj.getAll();
	}
	
	
	
	
	
}
