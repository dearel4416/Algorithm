import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String bomb = scan.nextLine();

        String result = explodeString(input, bomb);

        if (result.isEmpty())
            System.out.println("FRULA");
        else
            System.out.println(result);
    }

    private static String explodeString(String input, String bomb) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char currentChar : input.toCharArray()) {
            stack.push(currentChar);

            if (isExplosionDetected(stack, bomb)) {
                for (int i = 0; i < bomb.length(); i++) {
                    stack.pop();
                }
            }
        }

        for (char remainingChar : stack) {
            result.append(remainingChar);
        }

        return result.toString();
    }

    private static boolean isExplosionDetected(Stack<Character> stack, String bomb) {
        if (stack.size() >= bomb.length()) {
            for (int i = 0; i < bomb.length(); i++) {
                if (stack.get(stack.size() - bomb.length() + i) != bomb.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}