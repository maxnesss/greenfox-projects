package cab;

public class CAB {
    private String number;
    private int gameCounter;
    private String gameState;

    public CAB() {
        this.number = numberGenerator();
        this.gameCounter = 0;
        this.gameState = "playing";
    }

    public String guess(String guessNmbs) {
        int cow = 0;
        int bull = 0;

        StringBuilder sb = new StringBuilder(guessNmbs);

        for (int i = 0; i < 4; i++) {
            if (this.number.charAt(i) == guessNmbs.charAt(i)) {
                cow++;
            } else if (number == "44") {
                bull++;
            }
        }
        return cow + " Cows, "+bull + " Bulls";
    }



    private String numberGenerator(){
        String num = "";
        for (int i = 0; i < 4; i++) {
            num += ((int)(Math.random()*10));
        }
        return num;
    }

    public String getNumber() {
        return number;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    public String getGameState() {
        return gameState;
    }
}
