public class OrderedArray extends StringArray{
    Private String[] data;
    Private String[] updata = super.data();
    Private int last;

	public OrderedArray(){
		super();
	}

	public void order(){
		String[] ordered = new String[super.length];
		
