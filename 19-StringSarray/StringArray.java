import java.util.*;
import java.io.*;

public class StringArray{
    private String[] data;
    public StringArray(){
	data = new String[16];
    }
    public String toString(){
	String n = "";
	for (int i = 0; i < data.length; i++){
	    n = n + data[i] + ", ";
	}
	return n;
    }
    public int size(){ //number of actual things, not necessarily length
	int csize = 0;
	for(int i =0; i < data.length;i++){
	    if(data[i] != null){
		csize++;
	    }
	}
	return csize;
    }
    public boolean add(String i){ 
	int len = data.length;
	if(size() == len){
	    String []copy = new String[len + 1];
	    for(int x=0;x<len; x++){
		copy[x] = data[x];
	    }
	    data[size()] = i;
	}
	else{
	    data[size()] = i;
	}
	return true;
    }
    public String get(int i){
	return data[i];
    }
    public String remove(int i){
	String getout = data[i];
	for(int x = i; x < data.length - 1;x++){
	    data[x] = data[x + 1];
	}
	return getout;
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
	System.out.println(as.remove(2));
	System.out.println(as);
    }
}
