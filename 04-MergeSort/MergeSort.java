import java.util.*;
import java.io.*;

public class MergeSort{

    //AARAY
    public int[] merge(int[] a, int[] b){
	int[] ans = new int[a.length + b.length];
	int aIndex = 0;
	int bIndex = 0;
	for(int i = 0; i < a.length + b.length;i++){
	    if(aIndex < a.length && bIndex < b.length){
		if(a[aIndex] <= b[bIndex]){
		    ans[i] = a[aIndex];
		    aIndex +=1;
		} else {
		    ans[i] = b[bIndex];
		    bIndex += 1;
		}
	    }else if (aIndex < a.length){
		ans[i] = a[aIndex];
		aIndex += 1;
	    } else {
		ans[i] = b[bIndex];
		bIndex +=1;
	    }
	}
	return ans;
    }

    public int[] sort(int[] a){
     	int[] c = new int[a.length/2];
	int[] d = new int[a.length - a.length/2];
	if(a.length <= 1){
	    return a;
	} else {
	    int dIn = 0; //d index
	    for(int i = 0;i<a.length;i++){ //splits array
		if(i<a.length/2){
		    c[i] = a[i];
		}
		else {
		    d[dIn] = a[i];
		    dIn++;
		}
	    }
	    a = merge(sort(c),sort(d));
	}
	return a;

    }
	    


    //ARRAYLIST
    public ArrayList<Integer> mergeList(ArrayList<Integer> a, ArrayList<Integer> b){
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
    

    public ArrayList<Integer> sortList(ArrayList<Integer> a){
	ArrayList<Integer> b = new ArrayList<Integer>();
	
	if(a.size() <= 1){
	    return a;
	} else {
	    for(int i =0; i<(a.size()/2);i++){ //splits array
		b.add(a.remove(i));
	    }
	    a = mergeList(sortList(a), sortList(b));
	}
	return a;
    }

    public static String printArray(int[] a){
	String s = "[";
	for(int i = 0; i < a.length; i++){
	    s += a[i] + ",";
	}
	return s + "]";
    }


    public static void main(String[] args){
	MergeSort ms = new MergeSort();
	Random rnd = new Random();
	ArrayList<Integer> a,b;
	a = new ArrayList<Integer>();
	b = new ArrayList<Integer>();
	for(int i =0;i<52;i++){
	    // a.add(i);
	    // if(i%2 == 0){
	    // 	b.add(i);
	    // }
	    a.add(rnd.nextInt(100));
	}
	//System.out.println(ms.mergeList(a,b));
	//System.out.println(a + "\n\n");
	//System.out.println(ms.sortList(a));
	int[] c, d;
	c = new int[52];
	d = new int[15];
	for(int i = 0; i < 52; i++){
	    //c[i] = i;
	    //d[i] = 2*i;
	    c[i] = rnd.nextInt(100);
	}
	//System.out.println(printArray(ms.merge(c,d)));
	System.out.println(printArray(c) + "\n\n");
	System.out.println(printArray(ms.sort(c)));

    }
}
