import java.util.*;

public class  Arraystuff {

    /*--------------------- Instance Variables --------------------*/ 

    private int[] a;
    Random rnd;
    // By making x final, we can set it once but then never change it
    // private final int x = 123;

    /*--------------------- Constructors --------------------*/ 

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 1+rnd.nextInt(20);
	}
    }

    public Arraystuff(){
	this(100);
    }
    

    /*--------------------- Methods --------------------*/ 

    public String toString(){
	String s = "";
	for (int i = 0; i < a.length; i++) {
	    s = s + a[i]+", ";
	}
	return s;
}
    public int find(int n){

	for (int i = 0; i < a.length; i++) {
	 if (a[i] == n){
	  return i;
	 }
         }
	return -1;
	}

    public int maxVal(){
	int big = a[0];
	for (int i = 0; i < a.length; i++) {
	 if (a[i]>big){
	  big = a[i];
	 }
         }
	return big;
	}

    public boolean more14(int[] nums) {
  int count1 = 0;
	int count4 = 0;
	for (int i=0; i<nums.length; i++) {
	    if (nums[i] == 1) {
		count1 += 1;
	    } else if (nums[i] == 4) {
		count4 += 1;
	    }
	}
	if (count1 > count4) {
	    return true;
	} else { 
         return false;
         }
}

	public int sum67(int[] nums) {
 int sum = 0;
	boolean last6 = false;
	for (int i=0; i<nums.length; i++) {
	    if (last6 == true) {
		if (nums[i] == 7) {
		    last6 = false;
		}
	    } else {
		if (nums[i] == 6) {
		    last6 = true;
		} else {
		    sum += nums[i];
		}
	    }
	}
	return sum;

}

	public int[] tenRun(int[] nums) {
  for (int i = 0;i<nums.length;i++){
   if (nums[i]%10==0){
    for (int x=i+1; x<nums.length && !(nums[x]%10==0);x++){
     nums[x] = nums[i];
     }
     }
     }
     return nums;
    
}

	public boolean tripleUp(int[] nums) {
   int a = 0;
  for(int i=0;i<nums.length-2;i++){
   if(((nums[i+1]==nums[i]+1)&&(nums[i+2]==nums[i]+2))){
    return true;
    } else {
     a+=1;
     }
     }
     return false;
}

	public boolean canBalance(int[] nums) {
  int first = 0;
  for(int i=0;i<nums.length;i++){
   first+=nums[i];
   int second = 0;
   for (int x=nums.length-1;x>i;x--){
    second+=nums[x];
   }
   if (first==second){
    return true;
    }
   
    }
     return false;
}

	public int[] seriesUp(int n) {
 int x=(n*(n+1)/2);
 int c=0;
 int[] s = new int[x];
 for(int i=1; i<=n; i++){
  for(int j=1; j<=i; j++){
   s[c]=j;
   c++;
   }
  }
  return s;
  }

 public int freq(int[] a, int i){
  int c = 0;
  for(int x=0;x<a.length;x++){
   if(a[x]==a[i]){
    c++;
    }
    }
   return c;
  }

  public int maxMirror(int[] nums) {
  int ans = 0;
    for (int i = 0; i < nums.length; i++) {
     for (int x = nums.length-1; x >= i; x--) {
      int place = 0;
        while ( i+place < nums.length && x-place >= 0 && nums[i+place] == nums[x-place] ) {
          place++; 
        }
        if (place > ans)
          ans = place;
      }
    }
    return ans;
  }

 public int mode(int[] A){
  int ans=0;
  for (int x=0;x<A.length;x++){
   if ((freq(A,x))>(freq(A,ans))){
    ans=A[x];
   }else{
    x++;
   }
   
}
return ans;
}
    /*--------------------- Main --------------------*/ 

    public static void main(String[] args) {
	int[] a = {1,2,3,4,1,2,3,4,1,2,3,4};
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.mode(as.a));
	
	
	
    }
    
}
