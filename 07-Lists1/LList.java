public class LList {
    private Node l;
    private int len;

    public LList(){
	l = new Node();
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }

    //public void add(String) to front
    //public void add(index, String)

    public Node get(int n){
	int i = 0;
	Node tmp = l;
	while(i<n && tmp != null){
	    tmp = tmp.getNext();
	    i++;
	}
      
	return tmp;
    }

    
    //public booleabn remove(Node n)
    
	    
    public void insert(int n, String s){
	Node newNode = new Node(s);
	if(n == 0){
	    newNode.setNext(l);
	    l = newNode;
	} else {
	    Node nodeb4 = find(n-1);
	    newNode.setNext(nodeb4.getNext());
	    nodeb4.setNext(newNode);
	}

    }
	

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
		
}
