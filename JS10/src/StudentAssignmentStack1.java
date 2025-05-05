
public class StudentAssignmentStack1 {

    Student1[] stack;
    int top, size;

    public StudentAssignmentStack1(int size) {
        this.size = size;
        stack = new Student1[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Student1 std) {
        if (!isFull()) {
            stack[++top] = std;
        } else {
            System.out.println("Stack is full");
        }
    }

    Student1 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("There is no data in the stack");
            return null;
        }
    }

    Student1 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("There is no data in the stack");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].className + "\t");
        }
        System.out.println("");
    }

    public Student1 getFirst() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("There is no data in the stack");
            return null;
        }
    }

    public int getAssignmentCount() {
        return top + 1;
    }
}
