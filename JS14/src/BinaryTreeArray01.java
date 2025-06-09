
public class BinaryTreeArray01 {

    Students1[] data;
    int idxLast;

    public BinaryTreeArray01() {
        data = new Students1[10];
        idxLast = -1;
    }

    void populateData(Students1[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    //Assignment
    public void add(Students1 student) {
        if (idxLast >= data.length - 1) {
            System.out.println("Tree is full!");
            return;
        }
        idxLast++;
        data[idxLast] = student;
    }

    public void traversePreOrder(int index) {
        if (index <= idxLast && data[index] != null) {
            data[index].print();
            traversePreOrder(2 * index + 1);
            traversePreOrder(2 * index + 2);
        }
    }

}
