package com.pluralsight;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner scanner = new Scanner(System.in);

//Establish variables
        String fileName = null;

//Prompt user to select a story
            try {
                System.out.println("Please select a story from the list below: ");
                System.out.println("1. Goldilocks \n2. Hansel & Gretel \n3. Mary Had a Little Lamb");
                System.out.print("Enter selection (1, 2, or 3) here: ");
                int selection = scanner.nextInt();
                System.out.println("-------------------------------------------------");

//Switch statement to choose between selected story
                switch (selection) {
                    case 1:
                        fileName = "goldilocks.txt";
                        break;
                    case 2:
                        fileName = "hansel_and_gretel.txt";
                        break;
                    case 3:
                        fileName = "mary_had_a_little_lamb.txt";
                        break;
                }

                FileInputStream fis = new FileInputStream(fileName);
                scanner = new Scanner(fis);
                int lineNumber = 1;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.printf("%d: %s\n", lineNumber++, line);
                }
                scanner.close();

            } catch (Exception e) {
                System.out.println("Sorry, invalid input.");
            }
        }

    }
