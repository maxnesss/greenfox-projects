import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        // Write a method `ticTacResult` which takes a filename as a parameter,
        // and returns "X", "O" or "Draw" based on the input file's content
        // The file contains a finished Tic-Tac-Toe match
        // See the examples in draw.txt, win-x.txt, win-o.txt

        System.out.println(ticTacResult("assets/win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("assets/win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("assets/draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String file) {
        Path path = Paths.get(file);
        List<String> data = new ArrayList<>();

        String[][] field = new String[3][3];

        try{
            data = Files.readAllLines(path);
        } catch (IOException e){
            System.out.println("Can't read file");
        }

        //making 2d arr
        field[0] = data.get(0).split("");
        field[1] = data.get(1).split("");
        field[2] = data.get(2).split("");


            //x wins
        for (int i = 0; i < 3; i++) {
            if ((field[i][0].equals("X") && field[i][1].equals("X") && field[i][2].equals("X"))
                    || (field[0][i].equals("X") && field[1][i].equals("X") && field[2][i].equals("X"))
                    ||(field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X"))
                    || (field[0][2]).equals("X") && field[1][1].equals("X") && field[2][0].equals("X") ){
            return "X";
            } else if ((field[i][0].equals("O") && field[i][1].equals("O") && field[i][2].equals("O"))
                    || (field[0][i].equals("O") && field[1][i].equals("O") && field[2][i].equals("O"))
                    ||(field[0][0].equals("O") && field[1][1].equals("O") && field[2][2].equals("O"))
                    || (field[0][2]).equals("O") && field[1][1].equals("O") && field[2][0].equals("O") ) {
                return "O";
            }

        }
        return "Draw";

    }

}