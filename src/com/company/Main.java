package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	    List list = new List();
	    list.addLast(34.5);
	    list.addLast(98.1);
	    list.addLast(71.3);
	    list.addLast(83.44);
	    list.addLast(45.68);
	    list.addLast(21.97);
	    list.removeFromTo(1,3);
	    list.toArray();

	    for (int i = 0; i < list.size - 1; i++) {
	    	System.out.println(list.get(i));
		}


    }
}
