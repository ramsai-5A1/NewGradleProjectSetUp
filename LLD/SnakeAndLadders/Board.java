
public class Board {
    Cell[][] cells;

    Board(int boardSize, int snakesCount, int laddersCount) {
        initializeBoard(boardSize);
        injectSnakes(snakesCount);
        injectLadders(laddersCount);
    }

    private void initializeBoard(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize;j ++) {
                cells[i][j] = new Cell(null);
            }
        }

    }

    private void injectSnakes(int snakesCount) {
        while (snakesCount > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);;

            if (snakeHead <= snakeTail) {
                continue;
            }

            Cell cell = getCell(snakeHead);
            Jump jump = new Jump(snakeHead, snakeTail);
            cell.jump = jump;

            snakesCount--;
        }
    }

    public Cell getCell(int value) {
        int row = value / cells.length;
        int col = value % cells.length;
        return cells[row][col];
    }

    private void injectLadders(int laddersCount) {
        while (laddersCount > 0) {
            int ladderTop = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderBottom = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if (ladderTop <= ladderBottom) {
                continue;
            }

            Cell cell = getCell(ladderBottom);
            Jump jump = new Jump(ladderBottom, ladderTop);
            cell.jump = jump;
            laddersCount--;
        }
    }
}