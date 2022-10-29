import org.exercises.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    void givenTrueExpression_whenAssertTrue_thenShouldReturnTrue() {
        boolean expression = true;

        Assertions.assertTrue(expression);
    }

    @Test
    void givenFalseExpression_whenAssertTrue_thenShouldThrowException() {
        boolean expression = false;
        Error error = null;

        try {
            Assertions.assertTrue(expression);
        } catch (AssertionError assertionError) {
            error = assertionError;
        }

        if (!error.getMessage().equals("AssertTrue(false) is false")) throw new AssertionError("Expected: AssertTrue(false) is false");
    }

    @Test
    void givenTrueExpression_whenAssertFalse_thenShouldThrowException() {
        boolean expression = true;
        Error error = null;

        try {
            Assertions.assertFalse(expression);
        } catch (AssertionError assertionError) {
            error = assertionError;
        }

        if (!error.getMessage().equals("AssertFalse(true) is false")) throw new AssertionError("Expected: AssertFalse(true) is false");
    }

    @Test
    void givenIntegerNumber_whenAssertEqualsWithDifferentNumber_thenShouldThrowException() {
        Error error = null;
        int expected = 42;
        int actual = 13;

        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionError assertionError) {
            error = assertionError;
        }

        if (error == null) throw new AssertionError("assertEquals(42, 13) should be false");
        if (!error.getMessage().equals("assertEquals(42, 13) is false")) throw new AssertionError("Expected: assertEquals(42, 13) is false");
    }

    @Test
    void givenIntegerNumber_whenAssertEqualsWithEqualNumber_thenShouldThrowException() {
        Error error = null;

        int expected = 42;
        int actual = 42;

        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionError assertionError) {
            error = assertionError;
        }

        if (error != null) throw new AssertionError("assertEquals(42, 42) should be true");
    }

    @Test
    void givenIntegerNumber_whenAssertNotEqualsSameNumber_thenShouldThrowException() {
        Error error = null;

        int expected = 42;
        int actual = 42;

        try {
            Assertions.assertNotEquals(expected, actual);
        } catch (AssertionError assertionError) {
            error = assertionError;
        }

        if (error == null) throw new AssertionError("assertNotEquals(42, 42) should be false");
        if (!error.getMessage().equals("assertNotEquals(42, 42) is false")) throw new AssertionError("assertNotEquals(42, 42) should be false");
    }

    @Test
    void givenString_whenAssertEqualsDifferentString_thenShouldThrowException() {
        String expected = "hello";
        String actual = "world";
        Error error = null;

        try {
            Assertions.assertEquals(expected, actual);
        } catch (AssertionError assertionError) {
            error = assertionError;
        }

        if (error == null) throw new AssertionError("assertEquals(\"hello\", \"world\") should be false");
        if (!error.getMessage().equals("assertEquals(\"hello\", \"world\") is false")) throw new AssertionError("assertEquals(\"hello\", \"world\") should be false");
    }
}
