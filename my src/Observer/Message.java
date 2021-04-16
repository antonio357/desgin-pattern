package Observer;

public class Message {
    private String author;
    private String textContent;

    Message (String author, String textContent) {
        this.author = author;
        this.textContent = textContent;
    }
    public String getTextContent() {
        return textContent;
    }
    public String getAuthor() {
        return author;
    }
}
