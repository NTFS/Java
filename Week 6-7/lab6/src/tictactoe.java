/**
 * @Author: N/a
 * @Date: 03/23/2015
 * #Assignment:Java Programming
 */
public class tictactoe {

    private char[][] board;
    private boolean currentPlayer;

    public enum boardValue {
        X('X'),
        O('O'),
        EMPTY('_');
        private final char valu;

        private boardValue(char val) {
            valu = val;
        }

        public char getValue() {
            return valu;
        }
    }

    private void tictactoe() {
        board = new char[3][3];
        boardinit();
    }

    public void boardinit() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; i++) {
                board[i][j] = boardValue.EMPTY.getValue();
            }
        }
    }



    private void printWinner(String user) {
        System.out.println("User " + user + " has won!\n");
    }


    private void changePlayer()
    {
        if(currentPlayer == true)
        {
            System.out.println("Player 1 it's your turn.");
            setCurrentPlayer(false);
        }
        else
        {
            System.out.println("Player 2 it's your turn.");
            setCurrentPlayer(true);
        }
    }

    private boolean checkwin(int userOne, int userTwo)
    {
        if (userOne == 3) {
            printWinner("One");
            return true;
        }
        else if (userTwo == 3) {
            printWinner("Two");
            return true;
        }
        else {
            return false;
        }
    }

    public void setBoard(int locationX, int locationY) {
        {

            if(checkIfValidMove(locationX, locationY) == true) {
                if (isCurrentPlayer() == true) {
                    board[locationX][locationY] = boardValue.X.getValue();
                    changePlayer();
                } else {
                    board[locationX][locationY] = boardValue.O.getValue();
                    changePlayer();
                }
            }
            else
            {
                System.out.println("NOT A VALID MOVE!\n");
            }
        }
    }

    private boolean checkIfValidMove(int x, int y)
    {
        if(board[x][y] != boardValue.EMPTY.getValue())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean checkFullBoard() {
        int countifFull = 0;
        for(int i = 0; i <3; i++) {
            for (int j = 0; i < 3; i++) {
                if (!(board[i][j] == boardValue.EMPTY.getValue())) {
                    countifFull = countifFull + 1;
                }
            }
        }
        if(countifFull == 9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private void checkifWon() {

        //vertical
        int userOne = 0;
        int userTwo = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == boardValue.O.getValue()) {
                userOne = userOne + 1;
            } else if (board[i][0] == boardValue.X.getValue()) {
                userTwo = userTwo + 1;
            }
        }
        checkwin(userOne, userTwo);

        //horizontal
        userOne = 0;
        userTwo = 0;
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == boardValue.O.getValue()) {
                userOne = userOne + 1;
            } else if (board[0][i] == boardValue.X.getValue()) {
                userTwo = userTwo + 1;
            }
        }
        checkwin(userOne, userTwo);

        //diagonal
        userOne = 0;
        userTwo = 0;
        if(board[0][0] == boardValue.O.getValue() && board[1][1] == boardValue.O.getValue() && board[2][2] == boardValue.O.getValue()
        || board[0][2] == boardValue.O.getValue() && board[1][1] == boardValue.O.getValue() && board[2][0] == boardValue.O.getValue()){
            userOne = userOne + 1;
            }
        else if (board[0][0] == boardValue.X.getValue() && board[1][1] == boardValue.X.getValue() && board[2][2] == boardValue.X.getValue()
                || board[0][2] == boardValue.X.getValue() && board[1][1] == boardValue.X.getValue() && board[2][0] == boardValue.X.getValue()) {
                userTwo = userTwo + 1;
            }
        checkwin(userOne, userTwo);
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public boolean isCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(boolean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

}