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
	    return rSearch(t.getRight(),i);
	} else if (t.getData() > i){
	    return rSearch(t.getLeft(),i);
	}

	return t;  
	
    }
	
    //not really sure how to format a tree but this atleast prints everything
    public String toString(Node t){
	if(t == null){
	    return "";
	}
	String s = t.toString();
	return s + toString(t.getLeft()) + toString(t.getRight());
    }
    
    public static void main(String[] args){
	BST b = new BST();
	Node r = new Node(40);
	b.insert(r, 20);
	b.insert(r,28);
	b.insert(r,35);
	System.out.println(b.toString(r));
	System.out.println(b.search(r,35));
    }
	
	    
}
