
public class ConversionStack {

    int[] binaryStack;
    int size;
    int top;

    public ConversionStack() {
        this.size = 32;
        binaryStack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is already full-filled!");
        } else {
            binaryStack[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is still empty!");
            return -1;
        } else {
            return binaryStack[top--];
        }
    }

    public String convertToBinary(int grade) {
        if (grade == 0) {
            return "0";
        }

        while (grade > 0) {
            int mod = grade % 2;
            push(mod);
            grade = grade / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!isEmpty()) {
            binary.append(pop());
        }
        return binary.toString();
    }
}
