package section_19.exercises.ex03.application;

import section_19.exercises.ex03.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        scanner.close();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map<Candidate, Integer> candidates = new LinkedHashMap<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int votes = Integer.parseInt(fields[1]);
                Candidate candidate = new Candidate(name);

                if (candidates.containsKey(candidate)) {
                    votes += candidates.get(candidate);
                }

                candidates.put(candidate, votes);

                line = br.readLine();
            }

            for (Candidate candidate : candidates.keySet()) {
                System.out.println(candidate.getName() + ": " + candidates.get(candidate));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
