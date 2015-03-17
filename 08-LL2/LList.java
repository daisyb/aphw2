public class LList {
    private Node empty,l;
    private int len;

    public LList(){
	empty = new Node(" ");
	l = null;
	empty.setNext(l);
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	empty.setNext(tmp);
	tmp.setNext(l);
	l = tmp;
	len++;
    }


    public Node get(int n){
	int i = -1;
	Node tmp = empty;
	while(i<n && tmp != null){
	    tmp = tmp.getNext();
	    i++;
	}
      
	return tmp;
    }

    
    //public booleabn remove(Node n)
    
	    
    public void add(int index, String s){
	Node newNode = new Node(s);	
	Node nodeb4 = get(index-1);
	newNode.setNext(nodeb4.getNext());
	nodeb4.setNext(newNode);
       
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
