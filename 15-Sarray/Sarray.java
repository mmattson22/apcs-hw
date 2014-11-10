import java.util.*
import java.io.*

public class Sarray{
	private int[] data;
	private int last;
	public Sarray() {
		data = new int[1000];
		last = 0;
	}

	public Sarray(int[] newdata) {
		data = newdata;
		last = newdata.length;
	}

	private static find(int n, int[] array) {
		for(int i = 0 ; i < last ; i++) {
			if (array[i] == n) {
				return i;
			}
		}

		return -1;

	}

	private static expand(int size) {

		int[] temp = new int[data.length + size];
			
		for (int a = 0; i < data.length ; a++) {
			temp[i] = data[i];
		}

		data = temp;
	}


	public boolean add(int i) {
		
		if (last < data.length - 2) {
			data[last + 1] = i;
		}

		else {
			expand(1);
			data[data.length - 1] = i;
		}

		last++;

		return true;
	}

	public void add(int index, int i) {
		if (last < data.length - 2) {
			for (int a = last ; a >= index ; a--) {
				data[a + 1] = data[a];
			}
			data[index] = i;
		}
		else {
			expand(1);
			for (int a = last ; a >= index ; a--) {
				data[a + 1] = data[a];
			}
			data[index] = i;

		}
		last++;
		return;
	}

	public int size() {

		return last + 1; 
	}

	public int get(int index) {

		if (index > last) {
			return -1; 
		}

		else {
			return data[index];
		}
	}

	public int set(int index, int i) {
		if (index > data.length) {
			expand(index - data.length);
			last = index;
			data[last] = i;
			return -1; 
		}
		else {
			int temp = data[index];
			data[index] = i;
			return temp;
		}
	}

	public int remove(int index) {
		int temp = data[index];
		for (int i = index + 1; i <= last ; i++) {
			data[i] = data[i - 1];
		}

		data[last] = 0;
		last--;

		return temp;
	}
}
