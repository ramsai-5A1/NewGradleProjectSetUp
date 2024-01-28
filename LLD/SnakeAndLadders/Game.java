
public class Game {
    Board board;
    Dice dice;
    Dequeue<Player> playersList = new LinkedList<>();
    Player winner;

    Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 6);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 0);
        Player player2 = new Player("p2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame() {
        while (winner == null) {
            Player currentPlayer = getPlayerTurn();
            System.out.println("Player turn is: " currentPlayer.id + " current position is: " + currentPlayer.currentPosition);
            int diceValue = dice.rollDice();
            int playerNewPosition = findNewPosition(currentPlayer.currentPosition, diceValue);
            currentPlayer.currentPosition = playerNewPosition;
            System.out.println("Player new position is: " + playerNewPosition);
            if (playerNewPosition >= board.length * board.length - 1) {
                winner = currentPlayer;
            }
        }
        System.out.println("Winner is: " + winner.id);
    }

    private int findNewPosition(int currentPosition, int diceValue) {
        currentPosition += diceValue;
        if (currentPosition >= board.length * board.length - 1) {
            return currentPosition;
        }
        Cell cell = board.getCell(currentPosition);
        if (cell.jump != null && cell.jump.start == currentPosition) {
            String jumpBy = (cell.jump.end > currentPosition) ? "ladder" : "snake";
            System.out.println("Jump via " + jumpBy);
            return cell.jump.end;
        }
        return currentPosition;
    }

    private Player getPlayerTurn() {
        Player curr = playersList.removeFirst();
        playersList.addLast(curr);
        return curr;
    }
    
}