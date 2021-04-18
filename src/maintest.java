import java.util.*;

public class maintest {

    public static void main(String[] args) {
        String input = getStringInput("What do?");
        String num1 = getStringInput("What is num1?");
        String num2 = getStringInput("What is num2?");
        int numA = Integer.parseInt(num1);
        int numB = Integer.parseInt(num2);

        if (input.equals("+")) {
            System.out.println(Calculator.add(numA, numB));
        }

        else if (input.equals("-")) {
            System.out.println(Calculator.subtract(numA, numB));
        }

        else if (input.equals("*")) {
            System.out.println(Calculator.multiply(numA, numB));
        }

        else if (input.equals("/")) {
            System.out.println(Calculator.divide(numA, numB));
        }

        else {
            System.out.println("Fuck off");
        }

    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }



}
