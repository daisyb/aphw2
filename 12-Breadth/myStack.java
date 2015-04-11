public class myStack{

    public Node l;

    public myStack(){
	l = null;
    }

    public void push(Node n){
	n.setNext(l);
	l = n;
    }

    public Node pop(){
	if(empty()){
	    throw new NullPointerException();
	}
	Node tmp = l;
	l = l.getNext();
	return tmp;
    }

    public boolean empty(){
	return l == null;
    }

    public Node top(){
	if(empty()){
	    throw new NullPointerException();
	}
	return l;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for(tmp =l;tmp!=null;tmp = tmp.getNext()){
	    s += tmp + "\n";
	}
	return s;
    }
    /*
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
    */
}
