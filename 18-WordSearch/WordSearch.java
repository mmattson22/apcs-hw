import java.util.Random;

public class WordSearch {
    Random rand;
  
    private char[][] board;

    private int[][] directions = { 
	{0,1},   
	{1,1},   
	{1,0},   
	{1,-1},  
	{0,-1},  
	{-1,-1}, 
	{-1,0},
	{-1,1}  
    };
    
   
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }
    
    public WordSearch() {
	this(40,40);
    }
    
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    
	
   

    public boolean addWordTester(String w, int row, int col, int d){
	int r = row;
	int c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    if (r>=0 && r<board[0].length && c>=0 && c<board.length && (board[r][c] == w.charAt(i) || board[r][c] =='.')) {
		r += directions[d][0];
		c += directions[d][1];
	    } else {
		return false;
	    }
	}
	
	return true;
    }

    public void addWordHelper(String w, int row, int col, int d){
	int r = row;
	int c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    board[r][c] = w.charAt(i);
	    r += directions[d][0];
	    c += directions[d][1];
	}
    }

    public boolean addWord(String w){
	int failures = 0;
	
	while (failures < 1000) {
	    int tryRow = rand.nextInt(board[0].length);
	    int tryCol = rand.nextInt(board[1].length);
	    int tryDir = rand.nextInt(8);

	    if (addWordTester(w,tryRow,tryCol,tryDir)) {
		addWordHelper(w,tryRow,tryCol,tryDir);
		break;
	    }
	}
	
	return failures < 1000;
    }







    public void addWordSelf(String w, int row, int col, int d){
	String tester = w;
	int r = row;
	int c = col;
	for (int i = 0; i<w.length(); i++) {
	    if (r>=0 && r<board[0].length && c>=0 && c<board.length && (board[r][c] == tester.charAt(i) || board[r][c] =='.')) {
		r += directions[d][0];
		c += directions[d][1];
	    } else {
		System.out.println("Can't put word here");
		System.exit(0);
	    }
	}
	
	r = row;
	c = col;
	
	for (int i = 0; i<w.length(); i++) {
	    board[r][c] = w.charAt(i);
	    r += directions[d][0];
	    c += directions[d][1];
	}
    }

   


  
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	w.addWord("hello"); 
	System.out.println(w);
	w.addWordSelf("this",23,10,2);
	
	w.addWordSelf("cool",27,10,2);
	System.out.println(w);
    }
}
