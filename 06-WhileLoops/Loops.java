//15 minutes
public class Loops{
public String frontTimes(String str, int n) {
  int f = 3;
  int x = 0;
  if (f > str.length()) {
    f = str.length();
  }
  String front = str.substring(0, f);
  
  String ans = "";
  while(x<n) {
    ans = ans + front;
    x=x+1;
  }
  return ans;
}


//5 minutes
public String stringBits(String str) {

String ans = "";
int c = 0;
while(c<str.length()){
 ans = ans + str.substring(c, c+1);
 c=c+2;
 }
 return ans;
  
}

//7 minutes
public String stringYak(String str) {
  String a = "";
  int i = 0;
  while(i<str.length()) {
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 3;
    } else {
      a = a + str.charAt(i);
      i=i+1;
    }
  }
  
  return a;
}
//10 minutes
public int stringMatch(String a, String b) {
  int count = 0;
  int l = 0;
  
  while (l+1<(a.length())&&l+1<(b.length())){
    String x = a.substring(l, l+2);
    String y = b.substring(l, l+2);
    if (x.equals(y)) {
      count = count + 1;
      
    }
    l=l+1;
  }

  return count;
}
}
