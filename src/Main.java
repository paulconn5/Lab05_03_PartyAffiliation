public class Main {
    public static void main(String[] args) {
        String party = "R";

        if (party == "D") {
            System.out.println("You are a Donkey!");
        }
        else if (party == "R") {
            System.out.println("You are an Elephant");
        }
        else if (party == "I") {
            System.out.println("You are a man!");
        }
        else {
            System.out.println("Invalid entry");
        }
    }
}