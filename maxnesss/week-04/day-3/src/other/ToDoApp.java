package other;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {

    public static void main(String[] args) {
        mainMenu();
        Scanner scanner = new Scanner(System.in);
        int taskNumber=0;// needs to be changed


        switch (args[0]){
            case "-l":
                listTasks();


        }

    }

    private static void removeTask(int taskNo) {
        Path filePath = Paths.get("assets/tasks.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException exeption){
            System.out.println("Couldn't read our tasks file");
        }


    }
    private static void listTasks() {
        Path filePath = Paths.get("assets/tasks.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException exeption){
            System.out.println("Couldn't read our tasks file");
        }
            for (int line = 0; line < lines.size(); line++) {
                System.out.println((line+1) + " - " + lines.get(line));
            }
        }

    private static void mainMenu() {
        System.out.println("""
                $ todo

                Command Line Todo application
                =============================

                Command line arguments:
                    -l   Lists all the tasks
                    -a   Adds a new task
                    -r   Removes an task
                    -c   Completes an task""");
    }
}
