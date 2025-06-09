
public class BinaryTreeArrayMain01 {

    public static void main(String[] args) {
        BinaryTreeArray01 bta = new BinaryTreeArray01();
        Students1 m1 = new Students1("244107020138", "Devin", "TI-1I", 3.57);
        Students1 m2 = new Students1("244107020023", "Dewi", "TI-1I", 3.85);
        Students1 m3 = new Students1("244107020225", "Wahyu", "TI-1I", 3.21);
        Students1 m4 = new Students1("244107020076", "Angelina", "TI-1I", 3.54);
        Students1 m5 = new Students1("244107020223", "Andhika", "TI-1I", 3.72);
        Students1 m6 = new Students1("244107020226", "Bima", "TI-1I", 3.37);
        Students1 m7 = new Students1("244107020181", "Eiyu", "TI-1I", 3.46);
        Students1[] data = {m1, m2, m3, m4, m5, m6, m7};
        bta.populateData(data, data.length - 1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);
    }
}
