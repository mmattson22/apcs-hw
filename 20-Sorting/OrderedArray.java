public class OrderedArray extends StringArray {

    public boolean add(String h) {
	if (size() >= super.size()) {
	    super.growdata();
	}
	if (size() == 0) {
	    super.add(h);
	} else if (h.compareTo(get(size() - 1)) > 0) {
	    set(h,size());
	} else {
	    for (int i = 0; i < size(); i++) {
		if (h.compareTo(get(i)) < 0) {
		    set (h, i);
		    break;
		}
	    }
	}
	return true;
    }

   public static void main(String[] args){
	OrderedArray as = new OrderedArray();
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
