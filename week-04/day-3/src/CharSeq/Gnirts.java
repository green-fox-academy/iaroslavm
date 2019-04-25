package CharSeq;

public class Gnirts implements CharSequence {
    private String setString;

    Gnirts(String setString){
        this.setString = setString;
    }


    @Override // I am overriding length method of Grirts class
    public int length() {
        return this.setString.length(); // I am using length method of String class
    }

    @Override
    public char charAt(int index) {
        int length = this.setString.length();
        int reverseIndex = length - 1 - index;
        return this.setString.charAt(reverseIndex);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = this.setString.length();
        int reverseIndexOne = length - 1 - start;
        int reverseIndexTwo= length - 1- end;
        return this.setString.subSequence(reverseIndexTwo, reverseIndexOne);
    }
}
