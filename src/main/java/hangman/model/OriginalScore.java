package hangman.model;

public class OriginalScore implements GameScore {
    /**
     * Calculates the game score by the original rules
     *
     * @pre correctCount > 0 and incorrectCount > 0
     * @pos game score >= 0
     * @param correctCount   amount of correct attempts
     * @param incorrectCount amount of incorrect attempts
     * @return the game score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int points = 100-(10*incorrectCount);
        if (points < 0) {
            points = 0;
        }
        return points;

    }
}
