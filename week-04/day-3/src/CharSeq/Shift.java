package CharSeq;

public class Shift implements CharSequence {
    String setString;

    Shift(String setString){
        this.setString = setString;
    }

    @Override // I am overriding length method of Grirts class
    public int length() {
        return this.setString.length(); // I am using length method of String class
    }

    @Override
    public char charAt(int index) {
        return this.setString.charAt(index + 2);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.setString.subSequence(start + 2, end + 2);
    }
}
