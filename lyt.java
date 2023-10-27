public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Scanner sc = new Scanner(System.in);
        String s = "Happy Birthday"; // Corrected the spelling of "Birthday"
        String message = "May all your wishes come true";

        for (int i = 5; i > 0; i--) {
            System.out.print("Time Remaining: " + i + "\r");
            Thread.sleep(1000);
        }
        System.out.println(); // Added a new line to separate the countdown from the messages

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            Thread.sleep(200);
        }
        System.out.println(); // Added a new line to separate the messages

        for (int i = 0; i < message.length(); i++) {
            System.out.print(message.charAt(i));
            Thread.sleep(200);
        }
    }
}
