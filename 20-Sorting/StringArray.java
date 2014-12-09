public class StringArray {
    public String[] data;
    public int lastItem;

    public StringArray() {
	data = new String[5];
	lastItem = 0;
    }

    public String toString() {
	String ans = "";
	for (int i = 0; i < data.length; i++) {
	    if (i < data.length - 1) {
		ans = ans + data[i] + ", ";
	    } else {
		ans = ans + data[i];
	    }
	}
	return ans;
    }

    public void growdata() {
	if (lastItem >= data.length) {
	    String[] ans = new String[data.length + 1];
	    for (int i = 0; i < data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }
    
    public boolean add(String i) {
	growdata();
	data[lastItem] = i;
	lastItem = lastItem + 1;
	return true;
    }

    public void add(String h, int index) {
	for (int i = lastItem; i > 0; i--){
	    if (i > index) {
		data[i] = data[i - 1];
	    } else if (i == index) {
		data[i] = h;
		lastItem = lastItem + 1;
	    }
	}
    }

    public String get(int index) {
	return(data[index]);
    }

    public String set(String h, int index) {
	String current = data[index];
	data[index] = h;
	return current;
    }

    public int size() {
	return lastItem;
    }

    public String remove(int index) {
	String current = data[index];
	String[] ans = new String[data.length - 1];
	for (int i = 0; i < lastItem; i++) {
	    if (i != index){
		ans[i] = data[i];
	    }
	}
	data = ans;
	lastItem = lastItem - 1;
	return current;
    }

    public static void main(String[] args){
	StringArray as = new StringArray();
	System.out.println(as);
	System.out.println(as.size());
	System.out.println(as.add("You"));
	System.out.println(as.add("can't"));
	System.out.println(as.add("handle"));
	System.out.println(as.add("the"));
	System.out.println(as.add("truth"));
	System.out.println(as);
	
    }
}
