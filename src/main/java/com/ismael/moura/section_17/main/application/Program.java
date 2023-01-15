package com.ismael.moura.section_17.main.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = scanner.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        if (folders != null) {
            for (File folder : folders) {
                System.out.println(folder);
            }
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }

        boolean success = new File(strPath + "\\subdirTESTE").mkdir();
        System.out.println("Directory created successfully: " + success);

        scanner.close();
    }
}
