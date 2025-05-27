
public class DoubleLinkedListsMain {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.addFirst(new Student1("111", "Anton", "TI-1I", 3.57));
        dll.addFirst(new Student1("113", "Herco", "TI-1I", 3.89));
        dll.insertAfter("111", new Student1("114", "Rizki", "TI-1I", 3.8));
        dll.addLast(new Student1("112", "Prabowo", "TI-1I", 3.7));
        dll.insertAfter("112", new Student1("115", "Hanzel", "TI-1I", 3.6));
        dll.insertAfter("120", new Student1("116", "Eiyu", "TI-1I", 3.4));

        dll.print();

        dll.removeFirst();
        dll.print();

        dll.removeLast();
        dll.print();

        dll.remove(1);
        dll.print();

        dll.add(new Student1("117", "Jokowi", "TI-1I", 3.75), 1);
        dll.print();

        dll.removeAfter("111");
        dll.print();

        Student1 first = dll.getFirst();
        if (first != null) {
            first.print();
        }

        Student1 last = dll.getLast();
        if (last != null) {
            last.print();
        }

        Student1 mid = dll.getIndex(1);
        if (mid != null) {
            mid.print();
        }

        System.out.println("Total size of list: " + dll.getSize());

        String searchKey = "111";
        int foundIndex = dll.indexOf(searchKey);
        if (foundIndex != -1) {
            System.out.println("Index of nim " + searchKey + ": " + foundIndex);
        } else {
            System.out.println("Data with nim " + searchKey + " not found.");
        }
    }
}
