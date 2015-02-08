


public class Recursion {
    
    public int fact(int n){
	if(n == 0){
	    return 1;
	} else {
	    return n * fact(n-1);
	}
    }

    public int fib(int n){
	if(n == 0){
	    return 0;
	} else if (n == 1){
	    return 1;
	} else {
	    return fib(n-1) + fib(n-2);
	}
    }

    public int len(String s){
	if (s.equals("")){
	    return 0;
	} else {
	    return 1 + len(s.substring(1));
	}
    }

    public int count(char c, String s){
	if(s.equals("")){
	    return 0;
	} else if(c == s.charAt(0)){
	    return 1 + count(c,s.substring(1));
	} else {
	    return count(c,s.substring(1));
	}
    }
    
    public int bunnyEars2(int bunnies) {
	if(bunnies == 0){
	    return 0;
	} else if (bunnies%2 == 0){
	    return 3 + bunnyEars2(bunnies-1);
	} else {
	    return 2 + bunnyEars2(bunnies-1);
	}
    }

    public int strCount(String str, String sub) {
	int len = sub.length();
	if(str.length() < len){
	    return 0;
	} else if(sub.equals(str.substring(0,len))){
	    return 1 + strCount(str.substring(len),sub);
	} else {
	    return strCount(str.substring(1),sub);
	}
    }

    public int sumDigits(int n) {
	if(n < 10){
	    return n;
	} else {
	    return n%10 + sumDigits(n/10);
	}
    }

    public String allStar(String str) {
	if(str.length() <= 1){
	    return str.substring(0);
	} else {
	    return str.substring(0,1) + '*' + allStar(str.substring(1));
	}
    }


    public static void main(String args[]){
	Recursion r = new Recursion();
	System.out.println(r.fact(5));
	System.out.println(r.fib(8));
	System.out.println(r.len("birdies"));
	System.out.println(r.count('b',"bubble"));
    }
}
