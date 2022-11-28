public class TextReader {
    protected String userText;
    public TextReader(String userText) throws LengthException {
        if (userText.length() > 10){
            this.userText = userText;
            throw new LengthException();
        }
    }
    public String getUserText() {
        return userText;
    }
}
