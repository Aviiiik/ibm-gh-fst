package fst;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class game {

    static final String[] CHOICES = {"ROCK", "SCISSOR", "PAPER"};

    static void checkString(String[] Vinput, String Hinput) throws Invalidinput {
        for (String i : Vinput) {
            if (i.equals(Hinput)) {
                return;
            }
        }
        throw new Invalidinput("Invalid input " + Hinput);
    }

    
    static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        } else if (userChoice.equals("ROCK") && computerChoice.equals("SCISSOR")) {
            return "User Won";
        } else if (userChoice.equals("SCISSOR") && computerChoice.equals("PAPER")) {
            return "User Won";
        } else if (userChoice.equals("PAPER") && computerChoice.equals("ROCK")) {
            return "User Won";
        } else {
            return "Computer Won";
        }
    }

    
    static String buildResultMessage(String userChoice, String computerChoice, String result) {
        if (result.equals("Tie")) {
            return "Tie";
        } else if (result.equals("User Won")) {
            if (userChoice.equals("ROCK") && computerChoice.equals("SCISSOR")) {
                return "Rock beats Scissor U won";
            } else if (userChoice.equals("SCISSOR") && computerChoice.equals("PAPER")) {
                return "Scissor Beat Paper U won";
            } else {
                return "Paper Beat Rock U won";
            }
        } else {
            return computerChoice + " Beats " + userChoice + " U Lost";
        }
    }

    
    static String pickComputerChoice(Random randomno) {
        int index = randomno.nextInt(CHOICES.length);
        return CHOICES[index];
    }

    
    static String buildFileLine(String userChoice, String computerChoice, String result) {
        return "User: " + userChoice + " | Computer: " + computerChoice + " " + result + "\n";
    }

    
    static void writeResultToFile(String line) {
        try {
            FileWriter writer = new FileWriter("result.txt", true);
            writer.write(line);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }

    public static void main(String[] args) {
        Scanner Hinput = new Scanner(System.in);

        while (true) {
            System.out.println("Choose Play or End");
            String ch = Hinput.nextLine().toLowerCase();

            if (ch.equals("play")) {
                System.out.println("Your Turn : Choose one from this {Rock,Paper,Scissor}");
                String userin = Hinput.nextLine().toUpperCase();

                try {
                    checkString(CHOICES, userin);
                } catch (Invalidinput e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                Random randomno = new Random();
                String computerChoice = pickComputerChoice(randomno);
                System.out.println("Computer turn " + computerChoice);

                String result = determineWinner(userin, computerChoice);
                String message = buildResultMessage(userin, computerChoice, result);
                System.out.println(message);

                writeResultToFile(buildFileLine(userin, computerChoice, result));

            } else if (ch.equals("end")) {
                System.out.println("Bye");
                return;
            } else {
                System.out.println("Choose valid option!!!");
            }
        }
    }
}

class Invalidinput extends Exception {
    public Invalidinput(String message) {
        super(message);
    }
}