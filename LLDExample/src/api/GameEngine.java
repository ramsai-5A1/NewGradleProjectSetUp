package api;

import boards.TicTacToeBoard;
import game.Board;
import game.GameResult;
import game.Move;
import game.Player;

public class GameEngine {

    public Board start(String type) throws IllegalAccessException {
        if (type.equals("TicTacToe")) {
            return new TicTacToeBoard();
        } else {
            throw new IllegalAccessException();
        }
    }

    public void move(Board board, Player player, Move move) throws IllegalAccessException {
        if (board instanceof TicTacToeBoard) {

        } else {
            throw new IllegalAccessException();
        }
    }

    public GameResult isComplete(Board board) throws IllegalAccessException {
        if (board instanceof TicTacToeBoard) {
            return new GameResult(true, "X");
        } else {
            throw new IllegalAccessException();
        }
    }

    public static void main(String[] args) {
        System.out.println("Application is up");
    }
}