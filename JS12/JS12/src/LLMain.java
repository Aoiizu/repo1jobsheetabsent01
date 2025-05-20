
public class LLMain {

    public static void main(String[] args) {
        SingleLinkedList ThisisLinkedList = new SingleLinkedList();

        Student1 std1 = new Student1("001", "Student 1", "TI-1I", 3.89);
        Student1 std2 = new Student1("002", "Student 2", "TI-1I", 3.45);
        Student1 std3 = new Student1("003", "Student 3", "TI-1I", 3.20);
        Student1 std4 = new Student1("004", "Student 4", "TI-1I", 3.00);

        ThisisLinkedList.print();
        ThisisLinkedList.addFirst(std4);
        ThisisLinkedList.print();
        ThisisLinkedList.addLast(std1);
        ThisisLinkedList.print();
        ThisisLinkedList.insertAfter(std3, "Student 4");
        ThisisLinkedList.insertAt(2, std2);
        ThisisLinkedList.print();

        System.out.println("Data at index 1 is:");
        Student1 data = ThisisLinkedList.getData(1);
        data.print();

        int idx = ThisisLinkedList.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        ThisisLinkedList.removeFirst();
        ThisisLinkedList.removeLast();
        ThisisLinkedList.print();
        ThisisLinkedList.removeAt(0);
        ThisisLinkedList.print();

    }

}
