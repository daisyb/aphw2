public class BST{

    private Node root;

    public BST(){
	root = null;
    }

    public BST(Node n){
	root = n;
    }

    public void insert(Node t, int i){
	if(t == null){
	    t = new Node(i);
	}
	Node piggy = new Node();

	while(t!=null){
	    if(t.getData()<i){
		piggy =t;
		t=t.getRight();
	    } else if(t.getData()>i) {
		piggy =t;
		t=t.getLeft();
	    } else {
		return;
	    }
	}

	if(piggy.getData() < i){
	    piggy.setRight(new Node(i));
	}else {
	    piggy.setLeft(new Node(i));
	}
    }

    public Node search(Node t, int i){
	while(t!=null){
	    if(t.getData() < i){
		t = t.getRight();
	    }else if(t.getData()>i){
		t=t.getLeft();
	    }else {
		return t;
	    }
	}
	return null;
    }

    public Node rSearch(Node t, int i){
	if(t==null){
	    return null;
	}

	if(t.getData() < i){
	    rSearch(t.getRight(),i);
	} else if (t.getData() > i){
	    rSearch(t.getLeft(),i);
	}

	return t;  
	
    }
	
	
    public String toString(Node t, String s){
	if(t != null){
	    s += t.toString();
	    toString(t.getLeft(), s);
	    toString(t.getRight(),s);
	}
	return s;
    }
    
    public static void main(String[] args){
	BST b = new BST();
	Node r = new Node(40);
	b.insert(r, 20);
	b.insert(r,28);
	b.insert(r,35);
	System.out.println(b.toString(r,""));
    }
	
	    
}
