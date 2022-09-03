package hangman.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameScoreTest {

    OriginalScore originalScore = new OriginalScore();
    BonusScore bonusScore = new BonusScore();
    PowerScore powerScore = new PowerScore();

    /**
     * Validates score for original scheme when total is positive
     */
    @Test
    public void validateOriginalScorePositive() {
        int correctCount = 5;
        int incorrectCount = 5;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 50);

        correctCount = 15;
        incorrectCount = 3;
        score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 70);
    }

    /**
     * Validates score for original scheme when total is negative
     */
    @Test
    public void validateOriginalScoreNegative() {
        int correctCount = 5;
        int incorrectCount = 15;
        int score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 0);

        correctCount = 6;
        incorrectCount = 25;
        score = originalScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 0);
    }

    /**
     * Validates score for bonus scheme when total is positive
     */
    @Test
    public void validateBonusScorePositive() {
        int correctCount = 5;
        int incorrectCount = 5;
        int score = bonusScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 25);

        correctCount = 7;
        incorrectCount = 4;
        score = bonusScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 50);
    }

    /**
     * Validates score for bonus scheme when total is negative
     */
    @Test
    public void validateBonusScoreNegative() {
        int correctCount = 5;
        int incorrectCount = 15;
        int score = bonusScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 0);

        correctCount = 2;
        incorrectCount = 20;
        score = bonusScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 0);
    }

    /**
     * Validates score for power scheme when total is positive
     */
    @Test
    public void validatePowerScorePositive() {
        int correctCount = 3;
        int incorrectCount = 2;
        int score = powerScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 139);

        correctCount = 3;
        incorrectCount = 4;
        score = powerScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 123);
    }

    /**
     * Validates score for power scheme when total is positive
     */
    @Test
    public void validatePowerScoreNegative() {
        int correctCount = 1;
        int incorrectCount = 5;
        int score = powerScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 0);

        correctCount = 2;
        incorrectCount = 15;
        score = powerScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 0);
    }

    /**
     * Validates score for power scheme when total is over 500
     */
    @Test
    public void validatePowerScoreOver500() {
        int correctCount = 8;
        int incorrectCount = 5;
        int score = powerScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 460);

        correctCount = 11;
        incorrectCount = 6;
        score = powerScore.calculateScore(correctCount, incorrectCount);
        assertEquals(score, 452);
    }

}
