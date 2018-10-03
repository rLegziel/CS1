import static java.lang.Math.*;

public class MineSweeper {

	public static void main(String[] args) {
		
		final int HEIGHT = 10;
		final int WIDTH = 10;
		MineSweeperWindow window = new MineSweeperWindow(HEIGHT,WIDTH);
		
		int[][] board = makeBoard(HEIGHT,WIDTH);
		boolean[][] open = new boolean[HEIGHT][WIDTH];

		/*//To test only the makeBoard method, uncomment the following code:
		for (int i=0; i<board.length; i++)
			for (int j=0; j<board[0].length; j++)
				open[i][j] = true;
				*/
		 
		
		/* // To test makeBoard and computeHints, recomment the code above and uncomment the following code:
		computeHints(board);
		for (int i=0; i<board.length; i++)
			for (int j=0; j<board[0].length; j++)
				open[i][j] = true;
			*/
		 

		// To run the full game after finishing clicked, recomment the code above and uncomment this code: 
		computeHints(board);
		
		boolean alive = true;
		while (alive) {
			window.printBoard(board,open);
			int[] move = window.getMove();
			alive = clicked(move[0],move[1],board,open);
		}
		 //

		window.printBoard(board,open);
	}
	
	public static int[][] makeBoard(int height, int width) {
	     int bombs = 0;
	     int[][] board = new int[height][width];
	     for (int i = 0; i<height; i++){
	     	 for(int j = 0; j<width; j++){
	     	 	 board[i][j] = 0;
	     	 }
	     }
	     while ( bombs< 10 ){
	     	 int randomHeight = (int) (random() * height);
	     	 int randomWidth = (int) (random() * width);
	     	 while(board[randomHeight][randomWidth] == 0){
	     	 	 board[randomHeight][randomWidth] = 9;
	     	 	 bombs++;
	     	 }
	     }
	    return board;
	}
			 
	
	public static void computeHints(int[][] array) {
		//int nearBombs = 0;
		int height = array.length;
		int width = array[0].length;
	    for (int i = 0; i<height; i++){
	    	for (int j =0; j<width;j++){
	    		if (array[i][j] != 9){
	    		
	    		if (j< width-1 && array[i][j+1] == 9){ // checks square to the right,also checks that youre not in the last column
	    			array[i][j]++;
	    		} if( i<height-1 && array[i+1][j] ==9){ // checks square below, also checks youre not in the last row
	    			array[i][j]++;
	    		}if( i> 0 && array[i-1][j] == 9){ // checks square above, also checks its not in the top row
	    			array[i][j]++;
	    		}if (j>0 && array[i][j-1] == 9){ // checks square to the left, also checks youre not in the first column
	    			array[i][j]++;
	    		}if(i>0 && j > width-1  && array[i+1][j+1] == 9){ //checks top diagonal right square, also checks youre not in the first column or last row
	    			array[i][j]++;
	    		}if (i<height-1 && j<width -1  && array[i+1][j+1] == 9){ //checks bottom diagonal right square, also checks youre not in the last row or the last column
	    			array[i][j]++;
	    		}if(i<height-1 && j>0 && array[i+1][j-1] == 9){ // checks bottom diagonal left square, also checks youre not in the first column or last row 
	    		array[i][j]++;
	    		}if(i>0 && j>0 && array[i-1][j-1] == 9){ // checks top diagonal left square, also checks youre not in the first row or first column
	    			array[i][j]++;
	    		}
	    		}
	    	}
	    }
}
	
	public static boolean clicked(int x, int y, int[][] board, boolean[][] open) {
		int height = board.length;
		int width = board[0].length;
	    if (board[x][y] == 9){
	    	System.out.println("bomb");
	    	return false;
	    }
	    if (open[x][y] == true){
	    	System.out.println("this is open");
	    	return true;
	    }
	    if (board[x][y] !=0 && board[x][y] !=9){
	    	open[x][y] = true;
	    	return true;
	    }
	    if(board[x][y] == 0){
	    	open[x][y] = true;
	    	if (x < height-1 && board[x+1][y] != 9){
	    		clicked(x+1,y,board,open);   // runs the method on the square below the one pressed
	    	}if (x > 0 && board[x-1][y] !=9){
	    		clicked(x-1,y,board,open);  // runs the method on the square above the one pressed
	    	}if (y > 0 && board[x][y-1] != 9){
	    		clicked(x,y-1,board,open);  // runs the method on the square to the left of the one pressed 
	    	} if (y < width-1 && board[x][y+1] != 9){
	    		clicked (x,y+1,board,open);  // runs the method on the square to the right of the one pressed
	    	}if (y < width-1 && x > 0 && board[x-1][y+1] != 9){
	    		clicked (x-1,y+1,board,open);  // runs the method on the square on the top right
	    	}if (y < width-1 && x<height-1 && board[x+1][y+1] != 9){
	    		clicked (x+1,y+1,board,open);  // runs the method on the square on the bottom right
	    	}if (y > 0 && x<width-1 && board[x+1][y-1] != 9){
	    		clicked (x+1,y-1,board,open);  // runs the method on the square on the bottom left
	    	} if (y > 0 && x > 0 && board[x-1][y-1] != 9){
	    		clicked (x-1,y-1,board,open);  // runs the method on the square on the top left
	    	}else{
	    	return true;
	    	}
	}
	return true;

}
}