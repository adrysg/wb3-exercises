package com.pluralsight;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       Scanner scanner = new Scanner(System.in);

//Establish variables
        String filename = null;

//Prompt user to select book
            try {
                System.out.println("Please select a book from the following list: ");
                System.out.println("1. Goldilocks \n2. Hansel & Gretel \n3. Mary Had a Little Lamb");
                System.out.print("Enter selection (1, 2, or 3) here: ");
                int selection = scanner.nextInt();

                switch (selection) {
                    case 1:
                        filename = "goldilocks.txt";
                        break;
                    case 2:
                        filename = "hansel_and_gretel.txt";
                        break;
                    case 3:
                        filename = "mary_had_a_little_lamb.txt";
                        break;
                }

                FileInputStream fis = new FileInputStream(filename);
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
