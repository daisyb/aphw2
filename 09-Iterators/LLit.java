import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> first;

    public LLit(Node<E> n){
	t=n;
	first = n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	t=t.getNext();
	return retval;
    }

    public void remove() {
	Node tmp= first;
	while(tmp.getNext().getNext()!=null){
	    if(tmp.getNext().getNext() == t){
		tmp.setNext(t);
	    }
	    tmp = tmp.getNext();
	}
    }
}
