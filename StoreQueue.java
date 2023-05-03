import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StoreQueue {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create a queue to represent the line
        Queue<String> line = new LinkedList<>();

        // Crearte a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize a boolean flag to control the loop
        boolean done = false;

        // Start a loop that continies until the user exits
        while (!done) {
            // Prompt the user to enter a command
            System.out.println("Enter a command: (join, serve, exit)");
            String command = scanner.nextLine();

            // Use q switch statement to handle different commands
            switch (command) {
                case "join":
                    // Propmt the user to enter their name
                    System.out.println("Enter your name:");
                    String name = scanner.nextLine();

                    // Add the user's name to the end of the line
                    line.add(name);

                    // Print a message indicating the user has joined the line
                    System.out.println(name + " has joined the line.");
                    break;
                case "serve":
                    // Check if the line is empty
                    if (line.isEmpty()) {
                        System.out.println("No one is in the line.");
                    } else {
                        // Serve the next customer in the line
                        String next = line.remove();

                        // Print a message indicating the next customer has been served
                        System.out.println(next + " has been served.");
                    }
                    break;
                case "exit":
                    // Print a message indicating the program is exiting
                    System.out.println("Exiting program.");

                    // Set the dine flag to true to exit loop
                    done = true;
                    break;
                default:
                    // Print a message indicating an invalid command was entered
                    System.out.println("Invalid command.");
            }
        }
    }
}