public class Codingbat {
	public String stringX(String str) {
  	String ans = "";
	int y = 0;
  	for (y=0; y<str.length(); y++) {

   	 if (!(y > 0 && y < (str.length()-1) && str.substring(y, y+1).equals("x"))) {
      		ans = ans + str.substring(y, y+1);
    	}
  }
  	return ans;
}
	public String stringSplosion(String str) {
  	int c = 0;
  	int len = str.length();
  	String ans = "";
  	for(c=0;c<=len;c++){
  	 ans = ans + str.substring(0,c);
  	 }
  	 return ans;
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
