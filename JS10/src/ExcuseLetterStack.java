
import java.util.Stack;

public class ExcuseLetterStack {

    private Stack<ExcuseLetter> stack;

    public ExcuseLetterStack() {
        stack = new Stack<>();
    }

    public void submitLetter(ExcuseLetter letter) {
        stack.push(letter);
    }

    public void processLetter() {
        if (!stack.isEmpty()) {
            ExcuseLetter letter = stack.pop();
            System.out.println("Processing letter:\n" + letter);
        } else {
            System.out.println("No excuse letters to process.");
        }
    }

    public void viewLatestLetter() {
        if (!stack.isEmpty()) {
            System.out.println("Latest letter:\n" + stack.peek());
        } else {
            System.out.println("No excuse letters available.");
        }
    }

    public void searchLetterByName(String name) {
        boolean found = false;
        for (ExcuseLetter letter : stack) {
            if (letter.name.equalsIgnoreCase(name)) {
                System.out.println(letter);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No excuse letter found for student: " + name);
        }
    }
}
