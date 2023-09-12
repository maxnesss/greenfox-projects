package charsequence;

public class ShiftedCharSequence implements CharSequence{
    String text;
    int shift;
    ShiftedCharSequence(String text, int shift){
        this.text = text.concat(text.substring(0,shift)).substring(shift,text.length()+shift);
        this.shift = shift;
    }

    public String getText() {
        return text;
    }

    @Override
    public int length() {
        return this.length();
    }

    @Override
    public char charAt(int index) {

        return text.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return text.substring(start,end-start);
    }


}
