import java.util.*;
import java.io.*;

public class Selection{
    
    /*
    //Not working
    public int[] partition(int[] L, int SI, int EI){
	int[] D = new int[L.length];
	//int pivotIndex = SI;
	int pivot = L[SI];
	SI += 1;
	System.out.println(pivot);
	for(int i = 0; i < L.length;i++){
	    //printArray(D);
	    //if(i != pivotIndex){
		if(i < SI || i > EI){
		    D[i] = L[i];
		    System.out.println("a");
		} else {
		    if(L[i] < pivot){
			D[SI] = L[i];
			SI++;
			System.out.println("b");
		    } else if (L[i] > pivot){
			D[EI] = L[i];
			EI--;
			System.out.println('c');
		    
		    }
		}
		// }
	}
	D[SI] = pivot;
	return D;
    }
    */
    public int[] partition(int[] A, int L, int H){
	int pivot = A[L];
	int pivotIndex = L;
	System.out.println("pivot=" + pivot);
	A[L] = A[H];
	A[H] = pivot;
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
	return A;
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
	s.printArray(s.partition(a,0,a.length-1));
    }
}
		    
		
