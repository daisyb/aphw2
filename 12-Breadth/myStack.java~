public class myStack<E>{

    public Node<E> l;

    public myStack(){
	l = null;
    }

    public void push(E data){
	Node<E> tmp = new Node<E>(data);
	tmp.setNext(l);
	l = tmp;
    }

    public E pop(){
	if(empty()){
	    throw new NullPointerException();
	}
	E tmp = l.getData();
	l = l.getNext();
	return tmp;
    }

    public boolean empty(){
	return l == null;
    }

    public E top(){
	if(empty()){
	    throw new NullPointerException();
	}
	return l.getData();
    }

    public String toString(){
	String s = "";
	Node tmp;
	for(tmp =l;tmp!=null;tmp = tmp.getNext()){
	    s += tmp + "\n";
	}
	return s;
    }

    public static void main(String args[]){
	myStack<Integer> s = new myStack<Integer>();
	System.out.println(s.empty());
	s.push(10);
	s.push(5);
	s.push(7);
	System.out.println(s);
	System.out.println(s.top());
	int i = s.pop();
	System.out.println("popped:" + i + " list:\n" + s);
	System.out.println(s.empty());
	s.pop();
	s.pop();
	System.out.println(s.empty());

    }
}
