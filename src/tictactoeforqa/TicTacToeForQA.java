package tictactoeforqa;


/**
 * @author Blake
 */
public class TicTacToeForQA {
public String[][] board;
//in this game X always starts
public String player = "X";
   
   public String[][] CreateBoard(){
       board = new String[3][3];
      for (int i=0;i<3;i++){
          for (int j=0;j<3;j++){
              board[i][j] = "";
          }
      }
      
      return board;
   }
   
   
   public String currentPlayer(){
       return player;
   } 
   
   
   public void changeplayer(){
       if(player.equals("O")){
           player = "X";
       }
       else{
           player = "O";
       }
   }
   
   
   public void makeMove(int row, int col){
      if((row >= 0) && (row<3) && (col >=0) && (col < 3)){
          board[row][col] = player;
          System.out.println("Move Made");
      } 
      else{
          System.out.println("outta bounds");
      }
   }
   
   public boolean spaceInUse(int row, int col){
       String hold = board[row][col];
      return !hold.equals("");
}
}
