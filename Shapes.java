public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    public String tri1(int h){
	String ans = "";
	int x = 1;

	while(x<h){
	int c = 1;
	    while (c<=x){
		ans = ans + "*";
		c=c+1;
	    }
	    x=x+1;
	}
}
