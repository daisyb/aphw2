public class myQueue<E>{
    Node<E> first;
    Node<E> last;
    int length;
    
    public myQueue(){
	first = null;
	last = null;
    }

    public void enqueue(E data){
	Node<E> tmp = new Node<E>(data);
	if(first != null){
	    first.setNext(tmp);
	}else {
	    first = tmp;
	}

	last = tmp;
	length++;
    }

    public E dequeue(){
	E data = first.getData();
	first = first.getNext();
	length--;
	return data;
    }

    public boolean empty(){
	return first == null;
    }

    public E front(){
	return first.getData();
    }

    public String toString(){
	String s = "";
	Node tmp = first;
	for (int i = 0; i<length; i++){
	    s += first + " ";
	    first = first.getNext();
	}
	return s;
    }

    public static void main(String[] args){
	myQueue<Integer> q = new myQueue<Integer>();
	System.out.print(q.empty());
	q.enqueue(7);
	
