package org.exercises;

public class Assertions {
    public static void assertTrue(boolean expression) throws AssertionError {
        if (!expression) throw new AssertionError("AssertTrue(false) is false");
    }

    public static void assertFalse(boolean expression) throws AssertionError {
        if (expression) throw new AssertionError("AssertFalse(true) is false");
    }

    public static void assertEquals(int expected, long actual) throws AssertionError {
        if (expected != actual) throw new AssertionError("assertEquals(%d, %d) is false".formatted(expected, actual));
    }

    public static void assertNotEquals(int expected, int actual) throws AssertionError {
        if (expected == actual) throw new AssertionError("assertNotEquals(%d, %d) is false".formatted(expected, actual));
    }

    public static void assertEquals(String expected, String actual) throws AssertionError {
        if (!expected.equals(actual)) throw new AssertionError("assertEquals(\"%s\", \"%s\") is false".formatted(expected, actual));
    }
}
