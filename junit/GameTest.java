package fst;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Random;
import org.junit.jupiter.api.Test;

public class GameTest {

    private final String[] validChoices = {"ROCK", "SCISSOR", "PAPER"};

    @Test
    public void testCheckStringValidInputDoesNotThrow() {
        try {
            game.checkString(validChoices, "ROCK");
        } catch (Invalidinput e) {
            fail("Valid input ROCK should not throw Invalidinput");
        }
    }

    @Test
    public void testCheckStringInvalidInputMessage() {
        try {
            game.checkString(validChoices, "LIZARD");
            fail("Expected Invalidinput to be thrown");
        } catch (Invalidinput e) {
            assertTrue(e.getMessage().contains("Invalid input LIZARD"));
        }
    }

    @Test
    public void testDetermineWinnerTie() {
        assertEquals("Tie", game.determineWinner("ROCK", "ROCK"));
    }

    @Test
    public void testDetermineWinnerRockBeatsScissor() {
        assertEquals("User Won", game.determineWinner("ROCK", "SCISSOR"));
    }

    @Test
    public void testDetermineWinnerScissorBeatsPaper() {
        assertEquals("User Won", game.determineWinner("SCISSOR", "PAPER"));
    }

    @Test
    public void testDetermineWinnerPaperBeatsRock() {
        assertEquals("User Won", game.determineWinner("PAPER", "ROCK"));
    }

    @Test
    public void testDetermineWinnerComputerWinsRockBeatsScissor() {
        assertEquals("Computer Won", game.determineWinner("SCISSOR", "ROCK"));
    }

    @Test
    public void testDetermineWinnerComputerWinsPaperBeatsRock() {
        assertEquals("Computer Won", game.determineWinner("ROCK", "PAPER"));
    }

    @Test
    public void testDetermineWinnerComputerWinsScissorBeatsPaper() {
        assertEquals("Computer Won", game.determineWinner("PAPER", "SCISSOR"));
    }

    @Test
    public void testBuildResultMessageTie() {
        assertEquals("Tie", game.buildResultMessage("ROCK", "ROCK", "Tie"));
    }

    @Test
    public void testBuildResultMessageRockBeatsScissor() {
        assertEquals("Rock beats Scissor U won",
                game.buildResultMessage("ROCK", "SCISSOR", "User Won"));
    }

    @Test
    public void testBuildResultMessageComputerWins() {
        assertEquals("PAPER Beats ROCK U Lost",
                game.buildResultMessage("ROCK", "PAPER", "Computer Won"));
    }

    @Test
    public void testPickComputerChoiceAlwaysValid() {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            String choice = game.pickComputerChoice(random);
            assertTrue(choice.equals("ROCK") || choice.equals("SCISSOR") || choice.equals("PAPER"));
        }
    }

    @Test
    public void testBuildFileLineFormat() {
        String expected = "User: ROCK | Computer: SCISSOR User Won\n";
        assertEquals(expected, game.buildFileLine("ROCK", "SCISSOR", "User Won"));
    }
}