package com.example.excercises;

import com.example.excercises.color.RedColor;
import com.example.excercises.hello.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcercisesApplication implements CommandLineRunner {
    Printer printer;
    RedColor redColor;

    @Autowired
    public ExcercisesApplication(Printer printer, RedColor redColor) {
        this.printer = printer;
        this.redColor = redColor;
    }

    public static void main(String[] args){
        SpringApplication.run(ExcercisesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hello World");
        redColor.printColor();
    }
}
