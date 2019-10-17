package org.japjot.implementation.stack;

public class TestStack {

	public static void main(String[] args) {
		JapjotStack jpj = new JapjotStack(4);
		jpj.push(5);
		jpj.push(6);
        jpj.push(7);
        jpj.push(8);
      System.out.println(jpj.get(0));
      System.out.println(jpj.get(1));
      System.out.println(jpj.get(2));
      System.out.println(jpj.get(3));
      System.out.println(jpj.peek());
      System.out.println(jpj.pop() + " Removed");
	  System.out.println(jpj.get(1));
	  System.out.println(jpj.peek());
	
	}

}
