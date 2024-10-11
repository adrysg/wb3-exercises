package com.pluralsight;
import java.util.*;

public class famousQuotes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] quotes = new String[10];
        quotes[0] = "\"You may have to fight a battle more than once to win it.\"\n - Margaret Thatcher ";
        quotes[1] = "\"I can be changed by what happens to me. But I refuse to be reduced by it.\"\n - Maya Angelou ";
        quotes[2] = "\"Don’t Count the Days, Make the Days Count.\"\n - Muhammad Ali ";
        quotes[3] = "\"Success is focusing the full power of all you are on what you have a burning desire to achieve.\"\n - Wilfred Peterson ";
        quotes[4] = "\"Whether you think you can or think you can’t, you’re right.\"\n - Henry Ford ";
        quotes[5] = "\"Happiness cannot be traveled to, owned, earned, worn or consumed. Happiness is the spiritual experience of living every minute with love, grace, and gratitude.\"\n - Denis Waitley ";
        quotes[6] = "\"It is not how much we have, but how much we enjoy, that makes happiness.\"\n - Charles Spurgeon";
        quotes[7] = "\"Nothing is impossible. The word itself says 'I'm possible!\"\n — Audrey Hepburn";
        quotes[8] = "\"Believe you can and you're halfway there.\"\n — Theodore Roosevelt";
        quotes[9] = "\"To live is the rarest thing in the world. Most people just exist.\"\n — Oscar Wilde";

        try {
            System.out.print("Please select a number between 1 and 10: ");
            int index = scanner.nextInt();
            index--;
            System.out.println(quotes[index]);
        } catch (Exception e){
            System.out.println("That is an invalid input. Please try again.");
        }
    }
}