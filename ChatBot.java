import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🤖 Hello! I’m your ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.contains("hi") || userInput.contains("hello")) {
                System.out.println("Bot: Hello! How are you?");
            } 
            else if (userInput.contains("how are you")) {
                System.out.println("Bot: I'm doing great, thanks for asking! What about you?");
            }
            else if (userInput.contains("your name")) {
                System.out.println("Bot: I’m ChatBot, your virtual assistant.");
            }
            else if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day 👋");
                break; // exit loop
            }
            else {
                 System.out.println("Bot: Sorry, I didn’t understand that.");
            }
        }

        sc.close();
    }
}

