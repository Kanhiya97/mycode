import java.util.*;

public class TextEditor {
    static Stack<Character> undo = new Stack<>();
    static Stack<Character> redo = new Stack<>();

    public static void writeOperation(char x) {
        undo.push(x);
    }

    public static void undoOpearion() {
        if (undo.size() == 0) {
            System.out.print("You can't perform Undo opearion");
            return;
        }
        redo.push(undo.pop());
    }

    public static void redoOperation() {
        if (redo.size() == 0) {
            System.out.print("You can't perform Redo opearion");
            return;
        }
        undo.push(redo.pop());
    }

    public static void readOperation() {
        Stack<Character> read = new Stack<>();
        while (undo.size() > 0) {
            read.push(undo.pop());
        }
        System.out.println("Read opeartion starts:");

        for (Character ch : read) {
            System.out.print(ch + " ");
        }
        System.out.println();

        System.out.println("Read operation end:");
    }

    public static void performOperation(String data) {
        if (data.equals("READ")) {
            readOperation();
        } else if (data.equals("UNDO")) {
            undoOpearion();
        } else if (data.equals("REDO")) {
            redoOperation();
        } else if (data.length() > 5 && data.substring(0, 5).equals("WRITE")) {
            writeOperation(data.charAt(5));
        } else {
            System.out.println("Invalid Operation:");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String operation = sc.next();
            if (operation.equals("FALSE")) {
                break;
            } else {
                performOperation(operation);
            }
        }
    }
}
