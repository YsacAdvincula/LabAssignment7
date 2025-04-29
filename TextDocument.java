public class TextDocument implements Document {
    private String path;
    private String encoding;
    private int wordCount;

    public TextDocument(String path, String encoding, int wordCount) {
        this.path = path;
        this.encoding = encoding;
        this.wordCount = wordCount;
        System.out.println("Creating a Text Document prototype.");
    }

    public void open() {
        System.out.println("Opening Text Document: " + path + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: " + getType() + ", Path: " + path + ", Encoding: " + encoding + ", Words: " + wordCount);
        System.out.println();
    }

    public String getType() {
        return "Text";
    }

    public Document clone() {
        try {
            return (TextDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }
}