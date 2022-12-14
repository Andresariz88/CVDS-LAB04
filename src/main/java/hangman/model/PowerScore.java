package hangman.model;

import com.google.inject.Singleton;

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
        int points = 0;
        for (int i = 1; i <= correctCount; i++) {
            points += Math.pow(5, i);
        }
        if (points > 500) {
            points = 500;
        }
        points -= 8*incorrectCount;
        if (points < 0) {
            points = 0;
        }
        return points;
    }
}




