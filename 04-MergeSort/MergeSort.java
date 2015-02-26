import java.util.*;
import java.io.*;

public class MergeSort{


    public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
	ArrayList<Integer> ans = new ArrayList<Integer>();
	while(a.size() > 0 || b.size() > 0){
	    if(a.size() > 0 && b.size() > 0){
		if(a.get(0) <= b.get(0)){
		    ans.add(a.remove(0));
		} else {
		    ans.add(b.remove(0));
		}
	    } else {
		while(b.size() > 0){
		    ans.add(b.remove(0));
		}
		while(a.size() > 0){
		    ans.add(a.remove(0));
		}
	    }
	
	}
	return ans;
    }

    //public ArrayList<Integer>


    public static void main(String[] args){
	MergeSort ms = new MergeSort();
	ArrayList<Integer> a,b;
	a = new ArrayList<Integer>();
	b = new ArrayList<Integer>();
	for(int i =0;i<10;i++){
	    a.add(i);
	    if(i%2 == 0){
		b.add(i);
	    }
	}
	System.out.println(ms.merge(a,b));
    }
}
