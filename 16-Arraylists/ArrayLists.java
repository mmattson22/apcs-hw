import java.util.*;

public class ArrayLists{
    public static void main(String[] args) {
			
		ArrayList<Integer> al = new ArrayList<Integer>();

		Random r = new Random();
		for (int i = 0; i < 20; i++) {
		 al.add(r.nextInt(5));
		}
		System.out.println(al);
		for (int i = 0; i < al.size()-1; i++) {
		    int on = al.get(i);
		    int adj = al.get(i + 1);
		    if (on == adj) {
			al.remove(i);
			i--;
		    }
		}
		System.out.println(al);
		

    }
		
}
