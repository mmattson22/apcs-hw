public class Shapes {
//10 minutes
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
//15 minutes
    public String tri1(int h){
	String ans = "";
	int x = 0;

	while(x<h){
	int c = 0;
	    while (c<=x){
		ans = ans + "*";
		c=c+1;
	    }
            ans=ans+"\n";
	    x=x+1;
	}
	return ans;

}
//30 minutes. Does not work.
  public String tri2(int h){
	String ans = "";
	int r = h;
	int spaces = h - 1;
	String ast = "*";
	String space = "";
	while(spaces > 0){
	 space = space + " ";
	 spaces = spaces - 1;
	}
	ans = ast + space;
	while(r > 0){
	 ans = ast+ans.substring(1,r)+"\n";
	 r = r - 1;
	 ast = ast + "*";
	}
	return ans;

}
}

