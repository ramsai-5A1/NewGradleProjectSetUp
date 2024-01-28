
public class Dice {
    private int diceCount;
    private static int min = 1;
    private static int max = 6;

    Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int result = 0;
        int currentDice = 0;
        while(currentDice < diceCount) {
            //generateRandome number between max and min
            result += 2;
            currentDice++;
        }
        return result;
    }
}