package hangman.model;

public class PowerScore implements GameScore {
    /**
     * Calculates the game score by the power rules
     *
     * @pre correctCount > 0 and incorrectCount > 0
     * @pos game score >= 0
     * @param correctCount   amount of correct attempts
     * @param incorrectCount amount of incorrect attempts
     * @return the game score
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}




