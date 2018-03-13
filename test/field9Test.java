import java.util.Arrays;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tictactoeforqa.TicTacToeForQA;

/**
 *
 * @author B
 */
public class field9Test {
    
    public field9Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CreateBoard method, of class TicTacToeForQA.
     */
    @Test
    public void testCreateBoard() {
          System.out.println("Create");
        TicTacToeForQA instance = new TicTacToeForQA();
        instance.CreateBoard();
        assertNotNull(instance.board);
        
    }
    //test current player. This is start so x should be first
    @Test
    public void TesTcurrentPlayer(){
        System.out.println("current");
        TicTacToeForQA instance = new TicTacToeForQA();
        String expResult = "X";
        String result = instance.currentPlayer();
        assertEquals(expResult, result);
    }
    
    //test that the current player is O. This happens at the second move so
    //change player needs to be invoked.
   @Test
    public void TesTNextcurrentPlayer(){
        System.out.println("NextCurrent");
        TicTacToeForQA instance = new TicTacToeForQA();
        String expResult = "O";
        instance.changeplayer();
        String result = instance.currentPlayer();
        assertEquals(expResult, result);
    }
    // Assigns X to space 1,1 and make sure the spot has
    //and "X" in it
     @Test
    public void TesTXPlace(){
        System.out.println("X marks");
        TicTacToeForQA instance = new TicTacToeForQA();
        instance.currentPlayer();
        instance.CreateBoard();
        instance.makeMove(1, 1);
        assertEquals(instance.board[1][1], "X");
    }
    
    
   // Assigns O to space 1,1 and make sure the spot has
    //and "O" in it
     @Test
    public void TesTOPlace(){
        System.out.println("O marks");
        TicTacToeForQA instance = new TicTacToeForQA();
        instance.currentPlayer();
        instance.changeplayer();
        instance.CreateBoard();
        instance.makeMove(1, 1);
        assertEquals(instance.board[1][1], "O");
    }
    
    //Test to see if there is a value in the space 0,0
    @Test
    public void testSpaceInUse() {
        System.out.println("spaceInUse");
        int row = 0;
        int col = 0;
        TicTacToeForQA instance = new TicTacToeForQA();
        boolean expResult = false;
        instance.CreateBoard();
        boolean result = instance.spaceInUse(row, col);
        assertEquals(expResult, result);
}
}
