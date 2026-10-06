package Battleship;

public class Board 
{
    private int[] board;

    public Board(int size) 
    {
        board = new int[size];
    }

    public void placeShip(int shipSize) 
    {
        boolean placed = false;
        while (!placed) 
        {
            int start = (int) (Math.random() * (board.length - shipSize + 1));
            boolean canPlace = true;
            for (int i = 0; i < shipSize; i++) 
            {
                if (board[start + i] != 0) 
                {
                    canPlace = false;
                    break;
                }
            }
            if (canPlace) 
            {
                for (int i = 0; i < shipSize; i++) 
                {
                    board[start + i] = 1;
                }
                placed = true;
            }
        }
    }

    public int[] getBoard() 
    {
        return board;
    }

    public void printBoard() 
    {
        for (int cell : board) 
        {
            System.out.print(cell + " ");
        }
        System.out.println();
    }
}
