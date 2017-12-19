/*
Name: Jeff Zhang
 
 Class: S3C8
 
 Section Number: APCS
 
 Instructor: Daniel
 
 Date: November 23th, 2017
  
  This program is aimed to simulate a tic-tac-toe game.
*/
package homework_Jeff;

import java.util.*;

public class TicTacToe_Jeff {
	
	private static String [] [] board;
	private static final int rows = 3;
	private static final int cols = 3;
	
	/**Construct an empty board*/
	
	public TicTacToe_Jeff() {
		board = new String[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c< cols; c++) {
				
				board [r] [c] = " ";
			}
		}
	}
	
	
	/* @param r the row number
	 * @param c the column number
	 * @param symbol the symbol to be placed on board[r][c]
	 * Precondition: The square board[r][c]is empty.
	 * Postcondition: symbol placed i that square. 
	 */
	
	public void makeMove(int r, int c, String symbol) {
		board[r][c] = symbol;
	}
	
	/* @Creates a string representation of the board e.g.
	 * |o |
	 * |xx|
	 * | o|
	 * @return the string representation of board
	 * 
	 */
	
	public String toString() {
		String s = ""; //empty string
		
		for (int r = 0; r <rows; r++) {
			s = s +"|";
			
			for (int c = 0; c < cols; c++) {
				s = s + board[r][c];
				s = s + "|";
			}
			
			s = s + "\n";
		}
		return s;
		
	}
	
	public static void checkWin(String board [][]) {
		
		for (int i = 0; i < 2; i++) {
			
				if (board[i][0]==board[i][1]&&board[i][1]==board[i][2]) {
					
					System.out.println(board[i][0]+ " wins !");
					break;
				}
				
				else if (board[0][i]==board[1][i]&&board[1][i]==board[2][i]) {
					
					System.out.println(board[0][i]+ " wins !");
					break;
				}
				
				else 
					System.out.println("draw!");
			
		}
		
	}
	
	public static void main(String[] args) {
		int count = 0;
		TicTacToe_Jeff game = new TicTacToe_Jeff();
		Scanner input = new Scanner(System.in);
		
		String symbol1=  "";
		String symbol2 = "";
		
		System.out.println("Player 1 select your symbol:");
		System.out.println("Cross---------0");
		System.out.println("Circle--------1");
		System.out.println("Your choice:");
		
		int ans = input.nextInt();
		if (ans == 0) {
		 symbol1=  "x";
		 symbol2 = "o";
		}
		else if (ans == 1){
		 symbol1=  "o";
		 symbol2 = "x";
		}
		while ( count !=4) {
			
		System.out.println("Player1:");
		System.out.println("Please enter the place of your move:");
		System.out.println("Row:");
		int r = input.nextInt();
		System.out.println("Colomn:");
		int c = input.nextInt();
		game.makeMove(r-1,c-1, symbol1);
		 System.out.println(game.toString());
		
		 System.out.println("Player2:");
			System.out.println("Please enter the place of your move:");
			System.out.println("Row:");
			 r = input.nextInt();
			System.out.println("Colomn:");
			 c = input.nextInt();
			game.makeMove(r-1,c-1, symbol2);
			 System.out.println(game.toString());
		 
		
		count++;
		
		}
		
		System.out.println("Player1:");
		System.out.println("Please enter the place of your move:");
		System.out.println("Row:");
		int r = input.nextInt();
		System.out.println("Colomn:");
		int c = input.nextInt();
		game.makeMove(r-1,c-1, symbol1);
		 System.out.println(game.toString());
		 
		 
		checkWin(board);
		/*
		  Please write the game logic below
		  while ??{
		  
		  need to read row and col from user
		  int r =0 ;
		  int c = 0;
		  String player = "x";
		   
		  
		  //then call makemove
		   *game.makeMove(r,c,player);
		  
		  */
		  
		   
		  
		 
		
		
		
		
	}
}
