import java.util.*;

public class  Driver{
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.find(5));
	System.out.println(l.find(12));
	l.insert(0,"W");
	l.insert(3,"c");
	System.out.println(l);
    }
}
