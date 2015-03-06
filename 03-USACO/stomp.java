public class stomp{
    private int[][] pasture = {{28,25,20,32,24,36},{27,25,20,20,30,34},{24,20,20,20,20,30},{20,20,14,14,20,20}};
    private int[][] stompO = {{1,4,4},{1,1,10}};
    int herd[] = new int[9];
    int s;
    
    public void setHerd(int[] stompC){
	int x = stompC[0]-1;
	int y = stompC[1]-1;
	int[] herdC = {pasture[x][y], pasture[x+1][y], pasture[x+2][y], 
		pasture[x][y+1],pasture[x+1][y+1],pasture[x+2][y+1],
		pasture[x][y+2],pasture[x+1][y+2], pasture[x+2][y+2]};
	s = stompC[2];
	for(int i = 0;i < herdC.length;i++){
	    herd[i] = herdC[i];
	}

	
    }
    
    public  stomp(){
	for(int j=0;j<stompO.length;j++){
	    setHerd(stompO[j]);
	    System.out.println(this);
	    int max = 0;
	    for(int i = 0; i<herd.length;i++){
		if(herd[i] > 0){
		    max = herd[i];
		}
	    }
	    max = max - s;
	
	    for(int i = 0;i <herd.length;i++){
		if(herd[i] > max){
		    herd[i] = max;
		}
	    
		pasture[i%3][i/3] = herd[i];

	    }
	}
	

    }

    public String toString(){
	String s = "";
	for(int i = 0;i<pasture.length;i++){
	    for(int j = 0; j <pasture[0].length;j++){
		s += pasture[i][j] + " ";
	    }
	    s += "\n";
	}
	return s;
    }

    public static void main(String[] args){
	stomp s = new stomp();
	System.out.println(s);
    }

}
