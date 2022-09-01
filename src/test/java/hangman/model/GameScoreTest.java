package hangman.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameScoreTest {

    OriginalScore originalScore = new OriginalScore();

    /**
     *
     */
    @Test
    public void validateOriginalScorePositive() {
        int correctCount = 5;
        int incorrectCount = 5;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 50);
    }

    /**
     *
     */
    @Test
    public void validateBonusScorePositive() {
        int correctCount = 5;
        int incorrectCount = 5;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 25);
    }

    /**
     *
     */
    @Test
    public void validatePowerScorePositive() {
        int correctCount = 5;
        int incorrectCount = 5;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 460);
    }

}
