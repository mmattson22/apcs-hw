
import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){

    
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = sc.nextLine();	       

	Scanner sc2 = new Scanner(System.in);
	String c = "";
	while (!(c.toLowerCase().equals("warrior") || c.toLowerCase().equals("mage"))){
	    System.out.println("Are you a Warrior or a Mage?");
	    c = sc2.nextLine();
	    }
	

	System.out.println("Greetings, "+ n + " the " + c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase());
    }
}
