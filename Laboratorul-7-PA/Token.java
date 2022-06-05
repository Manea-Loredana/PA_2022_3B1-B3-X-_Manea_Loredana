public class Token {
    private int letter;
    private int value;

    //int letter reprezinta numarul de ordine a literei din alfabetul englez
    public Token(int letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    public int getLetter() {
        return letter;
    }

    public void setLetter(int letter) {
        this.letter = letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "( " + this.letter + "," + this.value + " )";
    }
}
