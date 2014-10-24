import java.util.*;
import java.io.*;

public class Arrays {
	public int sum13(int[] nums) {
	int ans =0;
  	for (int x = 0;x <nums.length ;x++){
  	if (nums[x] != 13){
  	ans+=nums[x];}
  	else if (nums[x] == 13 && x < nums.length -1 ) {
  	nums[x]=0;
  	nums[x+1] =0; }
  	}
  	return ans;
}

	public int[] frontPiece(int[] nums) {
  	if (nums.length == 1){
  	return new int[] {nums[0]};}
  	else if (nums.length == 0){
  	return new int[] {};}
  	else{
  	return new int[] {nums[0],nums[1]};}
  
  }
}
