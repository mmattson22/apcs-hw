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
//30 minutes Now works.
  public String tri2(int h){
        String ans = new String();
        int row = 1;
        while (row <= h) {
        int i = 0;
        int spaces = h - row;
        while (i < spaces) {
                ans += " ";
                i = i + 1;
            }
        while (i < h)  {
                ans += "*";
                i= i + 1;
            }
            ans += "\n";
            row= row + 1;
        }
        return ans;
    }

}

