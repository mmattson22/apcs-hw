import java.util.*;
import java.io.*;

public class Interval {

    private int low;
    private int high;
    private Random r = new Random();
    private static int numIntervals = 0;

    private void setup(int l, int h){
	high = h;
	low = l;
    }

    //If you want to create your own Interval
    public Interval(int l, int h) {
	this.low = l;
	this.high = h;
	numIntervals = numIntervals + 1;
    }

    //If you want your own Interval created for you;
    public Interval() {
	int h = r.nextInt(100);
	//add 1 to make sure that h will be greater than 0 (in case l is greater than 0)
	int l = 1+r.nextInt(h);

	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public String toString() {
	//String result = "Interval " + numIntervals + ": " + "[" + low + ", " + high + "]";
	String result = "[" + low + "," + high + "]";
	return result;
    }

    //compareTo routine
    //compares two intervals
    //one with lower low is less; if lows are equal, one with lower high is less
    //equal = 0
    //first interval less than = -1
    //first interval greater than =  1

    public int compareTo(Interval other) {
        int n = this.low - other.low;
        if (n == 0) {
            return this.high - other.high;
        } else {
            return n;
        }
    }
	
    public static void printStuff() {
	System.out.println("Stuff");
    }
    
    public static void main (String[] args) {
	
	Interval ival = new Interval();
	ival.printStuff(); //normal calling of an instance
	printStuff(); // printStuff is static, so it can be called it without an instance
	Interval.printStuff(); //or off a class

	Interval[] a = new Interval[10];
	for (int i = 0; i < 10; i++) {
	    System.out.println(new Interval());
	
	}
	System.out.println("____________________________________________________________________________");
	Interval test = new Interval();
	System.out.println(test);
	Interval test2 = new Interval();
	System.out.println(test2);
	System.out.println(test.compareTo(test2));
    }

}
