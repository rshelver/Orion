public class unique {
    private String letter = "";
    private double code;
    private unique uniqueLetter;
    private boolean check = false;

    public unique(String letter, boolean check) {
        this.letter = letter;
        this.check = check;
    }

    public void setLetter(String l) {
        this.letter = l;
    }

    public String getLetter() {
        return this.letter;
    }

    public String getUnique() {
        return this.letter;
    }

    public void setCheck(boolean c) {
        this.check = c;
    }

    public boolean getCheck() {
        return this.check;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public double getCode() {
        return this.code;
    }

}
