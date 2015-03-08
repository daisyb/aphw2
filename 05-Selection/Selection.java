import java.util.*;
import java.io.*;

public class Selection{
    
    public int Select(int[] A, int K, int L, int H){ 
	int pivot = A[L];
	A[L] = A[H];
	A[H] = pivot;
	int pivotIndex = H;
	H--;
	while(L < H){
	    if(A[L] < pivot){
		L++;
	    }else {
		int temp = A[L];
		A[L] = A[H];
		A[H] = temp;
		H--;
	    }
	}
	A[pivotIndex] = A[H];
	A[H] = pivot;
	if(K-1 > H){ //-1 to match from 0-indexing
	    return Select(A,K,H+1,A.length-1);
	} else if (K-1<H){
	    return Select(A,K,0,H-1);
	}
	return pivot;
	
	
    }

	

    public void printArray(int[] a){
	String s = "[";
	for(int i = 0;i<a.length;i++){
	    s += a[i] + ", ";
	}
	System.out.println(s + "]\n");
    }

    public static void main(String[] args){
	Selection s = new Selection();
	int[] a = new int[15];
	Random r = new Random();
	for(int i=0;i<a.length;i++){
	    a[i] = r.nextInt(20);
	}
	s.printArray(a);
	//s.printArray(s.partition(a,0,a.length-1));
	int K = 4;
	System.out.println("Element #" + K+ ": " + s.Select(a,K,0,a.length-1));
    }
}
		    
		
