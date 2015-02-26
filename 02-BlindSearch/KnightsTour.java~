

public class KnightsTour {
    private int[][] board;
    private int max;


    public KnightsTour(){
	max = 5;
	board = new int[max+2][max+2];
	for(int x = 0; x < 2;x++){
	    for(int y = 0; y <2;y++){
		board[x][y] = -1;
	    }
	}
    }

    public String toString(){
	String s = "";
	for(int x=2; x<max+2;x++){
	    for(int y=2; y<max+2;y++){
		System.out.printf("|%2d|",board[x][y]);
	    }
	    System.out.printf("\n");
	}
	return s;
    }

    public static void main(String[] args){
	KnightsTour kt = new KnightsTour();
	System.out.println(kt);
    }
}
		
