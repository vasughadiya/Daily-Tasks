public class t16 {

    public static int diceCombinations(int numDice, int targetSum) {
        if (numDice < 1 || numDice > 6) {
            throw new IllegalArgumentException("Number of dice must be between 1 and 6.");
        }
        if (targetSum < numDice || targetSum > 6 * numDice) {
            return 0;
        }
        return countCombinations(numDice, targetSum);
    }
    private static int countCombinations(int diceLeft, int targetSum) {
        if (diceLeft == 1) {
            return (targetSum >= 1 && targetSum <= 6) ? 1 : 0;
        }
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            if (targetSum - i >= 0) {
                count += countCombinations(diceLeft - 1, targetSum - i);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(diceCombinations(3, 4));
        System.out.println(diceCombinations(6, 20));
    }
}