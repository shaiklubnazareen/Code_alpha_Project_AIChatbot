import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I'm your AI Chatbot. How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Bot: Hello there! How can I assist you?");
            } else if (userInput.contains("how are you")) {
                System.out.println("Bot: I'm just a program, but I'm doing great! How about you?");
            } else if (userInput.contains("what is your name")) {
                System.out.println("Bot: I'm your friendly AI Chatbot.");
            } else if (userInput.contains("bye") || userInput.contains("exit")) {
                System.out.println("Bot: Goodbye! Have a great day!");
                break;
            } else if (userInput.contains("help")) {
                System.out.println("Bot: I can help you with general questions. Try saying 'hello', 'how are you', or 'what is your name'.");
            } else if (userInput.contains("weather")) {
                System.out.println("Bot: I'm not connected to live weather data, but I hope it's sunny where you are!");
            } else if (userInput.contains("joke")) {
                System.out.println("Bot: Why did the programmer quit his job? Because he didn't get arrays (a raise)!");
            } else {
                System.out.println("Bot: I'm not sure how to respond to that. Can you ask me something else?");
            }
        }

        scanner.close();
    }
}
