package com.ismael.moura.section_17.main.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[]{
                "Good moorning",
                "Good afternoon",
                "Good night"
        };

        String path = "C:\\Windows\\Temp\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
