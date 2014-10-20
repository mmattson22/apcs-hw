import java.util.*;
import java.io.*;

public class BaseMonster {
	int health = 100;
	int attack = 20;
	int mana = 20;
	String name = "FIXINPOST";
	int dexterity = 20;
	int intellect = 20;
	public String toAttack(String x){
	System.out.println(this.name+" is attacking "+x);
	}
}


