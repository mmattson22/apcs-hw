public class Shapes {


    public String line(String c, int n){
	String s = "";
	for (int i = 0;i<n;i++){
	    s=s+c;
	}
	return s;
    }

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

public String tri2b(int height){
        int h;
	int i;
	String s="";
	for(h=1;h<=height;h++){
	    for(i=0;i<height-h-1;i++){
		s=s+".";
	    }
	    for(i=0;i<h;i++){
		s=s+"*";
	    }


	s=s+"\n";
    }
	return s;
}
//10 min
   public String tri3(int h){
	String org = "";
	int current = 0;
	//current = 1 + current*2
	while(current < h){
	    int space;
	    for(space=0;space<h-current-1;space++){
		org = org + " ";
	    }
	    for( ;space<h+current;space++){
		org = org + "*";
	    }
	    current = current + 1;
	    org = org + "\n";
	}

	return org;
}
//15 min
	public String tri4(int h){
		String ans = new String();
        	int row=0;
		int spot = 0;
        	for (row = 0; row < h; row++) {
                for (spot = 0; spot < h; spot++) {
		String layer = "";
		    if (spot<row){
			layer += " ";
			} else {
			 layer += "*";}
                    ans += layer;
                }
                ans += "\n";
        } 
        return ans;
    }
//30 min
	public String diamond(int h){
		String ans = "";
		int size = h;
		int x = 1;
		int spaceNum=(h/2);
		String spaces = "                                                                                                               ";
		for (int i=1;i<=size;i++){
		  for (int j=spaceNum;j>=1;j--){
		    ans = ans + " ";
		  }
		  for (int j=1;j<=x;j++){
		    ans = ans + "*";
		  }
		ans = ans + "\n";
		if(i<size/2+1){
		 x = x+2;
		 spaceNum=spaceNum-1;
		} else {
		 x=x-2;
		 spaceNum=spaceNum+1;
		}
	}
	if (h%2==0){
	
	return ans + spaces.substring(0,(h/2))+"*";
	} else {
	return ans;
}
}
	//15 minutes
	public String frame(int r, int c){
		int x = 0;
		int y = 0;
		
		String edge= "";
		String side= "*";
		
		for (x=0;x<c;x++){
		  edge = edge + "*";
		}
		edge = edge + "\n";
		String ans = edge;
		for (x=0;x<c-2;x++){
		  side = side + " ";
		}
		side = side + "*\n";
		for (y=0;y<(r-2);y++){
		  ans = ans + side;
		  }
		
		return ans+edge;
}
}





