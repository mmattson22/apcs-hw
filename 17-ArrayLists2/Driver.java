


import java.util.*;

public class Driver {

    public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer> ();
	for (int i = 0; i<10; i++) {
	    al.add(i);
	}
	System.out.println(al);
	Random r = new Random();
	ArrayList<Integer> nai = new ArrayList<Integer> ();
	while (!(al.isEmpty())) {
	    int oldn = r.nextInt(al.size());
	    nai.add(al.get(oldn));
	    al.remove(al.get(oldn));
	}

	System.out.println(nai);
	     

    }
}
