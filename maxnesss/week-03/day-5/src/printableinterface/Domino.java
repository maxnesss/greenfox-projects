package printableinterface;

public class Domino implements Printable{
    private int sideA;
    private int sideB;
    Domino(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public String printAllFields() {
        return "Domino Side A: "+sideA+ ". Side B: "+sideB;
    }
}
