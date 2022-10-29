
public class TextProcessor {
    private String text;
    public TextProcessor(String text) {
        this.text = text;
    }

    void formatAll() {
        if (text.startsWith("for")) {
            var newLineIndex = text.indexOf('\n');
            var bodyOfForExpr = text.substring(newLineIndex + 1);
            var bodyAfterIndent = bodyOfForExpr.indent(2);
            text = text.replace(bodyOfForExpr, bodyAfterIndent);
        }
    }

    public String getText() {
        return text;
    }
}
