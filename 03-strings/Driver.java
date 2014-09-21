public class Driver {
    public static void main(String[] args){
        String s="michael mattson";
	System.out.println("The space is at position: " + s.indexOf(" "));
	String a=s.substring(0,7);
	System.out.println("The first name is: " + a);
	String b=s.substring(7);
	System.out.println("The last name is: " + b);
    }
}

