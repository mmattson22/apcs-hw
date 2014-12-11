import java.util.*;
import java.io.*;

public class BaseChar implements Comparable {
    private int Health = 100;
    private int Mana = 10;
    private int Attack = 20;
    private int Dexterity = 20;
    
public int getHealth(){
	return Health;
    }

 public int getMana(){
	return Mana;
    }
 public int getAttack(){
	return Attack;
    }
 public int getDexterity(){
	return Dexterity;
    }

public static void main(String[] args) {
	BaseChar[] a = new BaseChar[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new BaseChar();
		}
		System.out.println(Arrays.toString(a));

}
}
