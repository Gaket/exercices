package ru.abdt.badoo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BracesUnitTest {

    @Test
    public void emptyString() throws Exception {
        String empty = "";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, true);
    }

    @Test
    public void badString() throws Exception {
        String empty = "(";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, false);
    }

    @Test
    public void okString() throws Exception {
        String empty = "()";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, true);
    }

    @Test
    public void harderString() throws Exception {
        String empty = "(())";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, true);
    }

    @Test
    public void harderBadString() throws Exception {
        String empty = "(()))";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, false);
    }

    @Test
    public void evenHarderString() throws Exception {
        String empty = "({[]})";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, true);
    }

    @Test
    public void evenHarderBadString() throws Exception {
        String empty = "({][})";
        boolean answer = Braces.checkIfStringIsBalanced(empty);
        assertEquals(answer, false);
    }
}