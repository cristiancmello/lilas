import org.exercises.Assertions;
import org.junit.jupiter.api.Test;

public class TextProcessorTest {
    @Test
    void givenForExpressionAndBody_whenFormatAll_thenBodyWithNewBlankSpacesLeft() {
        String expected = """
        for x in y:
          instruction1
          instruction2
          instruction3
        """;

        String text = """
        for x in y:
        instruction1
        instruction2
        instruction3
        """;

        var textProcessor = new TextProcessor(text);

        textProcessor.formatAll();

        Assertions.assertEquals(expected, textProcessor.getText());
    }
}
