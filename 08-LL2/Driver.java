import java.util.*;
import java.io.*;
import java.lang.System;
/*
  times vary but,
  ArrayList is fast, 
  the built-in is slow,
  and ours is super slow.
 */


public class  Driver{

    public static void main(String[] args) {
	Random r = new Random();
	
	long start,elapsed;
	LList l = new LList();
	LinkedList l2 = new LinkedList();
	ArrayList<Integer> a = new ArrayList<Integer>();
	
	for(int i = 0;i< 50000;i++){
	    a.add(r.nextInt(11));
	    l.add(r.nextInt(11));
	    l2.add(r.nextInt(11));
	}
	/*
	System.out.println(a);
	System.out.println(l);
	System.out.println(l2);
	*/

	int aSum = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<a.size();i++){
	    aSum += a.get(i);
	}
	elapsed = System.currentTimeMillis()-start;
	System.out.println("AList:" + elapsed);

	int lSum = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<l.size();i++){
	    lSum += l.get(i);
	}
	elapsed = System.currentTimeMillis() -start;
	System.out.println("LList:" + elapsed);

	int l2Sum = 0;
	start = System.currentTimeMillis();
	for(int i=0;i<l2.size();i++){
	    l2Sum += (int)l2.get(i);
	}
	elapsed =System.currentTimeMillis()-start;
	System.out.println("L2List:" + elapsed);
	

	/*
	for (int i=0; i < 10; i++){
	    l.add(i);
	}
	System.out.println(l);
	System.out.println(l.get(4));
	System.out.println(l.get(6));
	l.add(0,6);
	l.add(3,5);
	System.out.println("add":l);
	l.remove(5);
	l.remove(20);
	System.out.println("remove:"+l);
	*/
    }
}
