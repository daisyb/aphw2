import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String[] args) {
	LList<String> l = new LList<String>();
	//ArrayList<String> l = new ArrayList<String>();
	//LinkedList<String> l = new LinkedList<String>();

	LList<Integer> l2 = new LList<Integer>();
	// ArrayList<Integer> l2 = new ArrayList<Integer>();
	//LinkedList<Integer> l2 = new LinkedList<Integer>();
				
	l.add("Hello");
	l.add("world");
	l.add("abc");
	l.add("something");
	l.add("else");

   
	for (int i=0;i < 5; i++){
	    l2.add(i);
	}

	System.out.println(l2);
	System.out.println();
	Iterator<String> i = l.iterator();
	int index = 0;
	while (i.hasNext()){
	    
	    System.out.println(i.next());
	    if(index==2) i.remove();
	    index++;
	    
	}
	System.out.println(l);
	
	Iterator<Integer> i2 = l2.iterator();
	while (i2.hasNext())
	    System.out.println(i2.next());
				
	// foreach or for in loop in Java
	for (String s : l){
	    System.out.print(s+", ");
	}
	System.out.println();
	for (int j : l2){
	    System.out.print(j+", ");
	}
	System.out.println();
				
    }
}
