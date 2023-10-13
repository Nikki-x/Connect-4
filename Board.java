package connectfour;

public class Board{

    private static int rows = 6;
    private static int columns = 7;

    private TextUI[][] ourBoard = new TextUI[rows][columns];


    public boolean addPiece (int colToAdd, String color){
        //within normal range
        int row = 0;
        if (colToAdd >=0 && colToAdd < columns){

            //when the row is not full
            if (ourBoard[colToAdd][0] == null){
                boolean addedCol = false;
                for(row = rows - 1; row >= 0 ;row--){               ///ERRORRRR
                ourBoard[row][colToAdd] = new TextUI();
                ourBoard[row][colToAdd].setColor(color);
                addedCol = true;
                break;
            }
                return addedCol;
            }
            

            //when the row is full
            else{
                System.out.println("This column is full. Choose another row.");
                return false;
            }
        }
        //not within the normal range
        else{
            //print out the error message
            System.out.println("Error: outside of the range");
            return false;
        }

        
    }

    //method to output the board 
    public void printboard(){
        for (int row = 0; row < rows; row++){
            System.out.print("|");
            for (int col = 0; col < columns; col++){
                if (ourBoard[row][col] == null){
                    System.out.print("_");
                } else{
                    System.out.print(ourBoard[row][col].getColor());
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }


//method to set all the enteries to null as default
    public Board(){
        for (int row =0; row < rows; row++){
            for (int col = 0; col < columns; col++){
                ourBoard[row][col] = null;
            }
        }
    }



}