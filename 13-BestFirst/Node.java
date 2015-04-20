
public class Node {
    private int x,y;
    private Node prev;
    private int priority;
    private int steps;

    public Node(int x, int y){
	this.x = x;
	this.y = y;
	priority = 0;
	steps = 0;
    }

    public Node(int x, int y, int steps){
        this(x,y);
	this.steps = steps;
    }
    public Node getPrev() {
	return prev;
    }

    public void setPrev(Node n){
	prev = n;
    }
    
    public int getSteps(){
	return steps;
    }

    public void setSteps(int n){
	steps = n;
    }

    public int getPriority() {
	return priority;
    }

    //euclidean
    public void setPriority(int a, int b){
        priority = (a-x)*(a-x) + (b-y)*(b-y) ;
    }
    
    public void setManhattan(int a, int b){
	priority = (a-x) + (b-y);
    }
    
    public void AStar(int a, int b){
	setPriority(a,b);
	priority += steps;
	
    }

    public int getX() {
	return x;
    }

    public int getY() {
	return y;
    }

    public String toString(){
	return ""+priority;
    }
		
}









