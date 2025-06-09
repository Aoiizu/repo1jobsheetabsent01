14.2.1 Experiments


public class Node01 {

    Students1 data;
    Node01 left;
    Node01 right;

    Node01() {
    }

    Node01(Students1 data) {
        this.data = data;
        right = null;
        left = null;
    }
}



public class Students1 {

    String nim, name, className;
    double ipk;

    public Students1() {
    }

    public Students1(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}



public class BinaryTree {

    Node01 root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;

    }

    public void add(Students1 data) {
        if (isEmpty()) {
            root = new Node01(data);
        } else {
            Node01 current = root;
            while (true) {
                if (data.ipk < current.data.ipk) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node01(data);
                        break;
                    }
                } else if (data.ipk > current.data.ipk) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node01(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node01 current = root;
        while (current != null) {
            if (current.data.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.data.ipk) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node01 node) {
        if (node != null) {
            node.data.print();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node01 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.print();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node01 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.data.print();
        }
    }

    Node01 getSuccessor(Node01 del) {
        Node01 successor = del.right;
        Node01 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        Node01 parent = root;
        Node01 current = root;
        boolean isLeftChild = false;
        while (current.data.ipk != ipk) {
            parent = current;
            if (ipk < current.data.ipk) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                System.out.println("Couldn't find data!");
                return;
            }
        }

//delete node with no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if (current.right == null) {//delete node with a left child
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {//delete node with a right child
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {//delete node with 2 children
            Node01 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }

}




public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.add(new Students1("244107020138", "Devin", "TI-1I", 3.57));
        bst.add(new Students1("244107020023", "Dewi", "TI-1I", 3.85));
        bst.add(new Students1("244107020225", "Wahyu", "TI-1I", 3.21));
        bst.add(new Students1("244107020076", "Angelina", "TI-1I", 3.54));
        System.out.println("Student list (in-order traversal)");
        bst.traverseInOrder(bst.root);
        System.out.println("Search data");
        System.out.print("Search a student with IPK: 3.54: ");
        String result = bst.find(3.54) ? "Found" : "Not Found";
        System.out.println(result);
        System.out.print("Search a student with IPK: 3.22: ");
        result = bst.find(3.22) ? "Found" : "Not Found";
        System.out.println(result);
        bst.add(new Students1("244107020223", "Andhika", "TI-1I", 3.72));
        bst.add(new Students1("244107020226", "Bima", "TI-1I", 3.37));
        bst.add(new Students1("244107020181", "Eiyu", "TI-1I", 3.46));
        System.out.println("Student list:");
        System.out.println("In-order traversal:");
        bst.traverseInOrder(bst.root);
        System.out.println("Pre-order traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("Post-order traversal:");
        bst.traversePostOrder(bst.root);
        System.out.println("Data deletion");
        bst.delete(3.57);
        System.out.println("Student list after deletion:");
        bst.traverseInOrder(bst.root);
    }
}



14.2.2 Questions
1. Why is data search in a binary search tree more efficient compared to a regular binary tree?


2. What are the purposes of the left and right attributes in the Node class?


3. a. What is the function of the root attribute in the BinaryTree class?


b. When a BinaryTree object is first created, what is the initial value of root?


4. When the tree is empty and a new node is to be added, what process takes place?


5. Consider the following line of code inside the add() method. Explain in detail the purpose of this
line of code.


if(data.ipk < current.data.ipk){
    if(current.left != null){
        current = current.left;
    } else {
        current.left = new Node00(data);
    break;
    }
        } else if(data.ipk > current.data.ipk){
    if(current.right != null){
    current = current.right;
        } else {
    current.right = new Node00(data);
    break;
    }
}


Answer : 


1. A binary search tree (BST) enables more efficient data search than a regular binary tree due to its property that the left subtree of a node contains only nodes with keys less than the node’s key, and the right subtree only nodes with keys greater than the node’s key. This allows for binary search, reducing the average time complexity to O(log n).

2. The left and right attributes in the Node class are used to reference the left and right children of the node, respectively, in the tree structure.

3. a. The root attribute in the BinaryTree class represents the top-most node of the tree, from which all nodes are accessible.

   b. When a BinaryTree object is first created, the initial value of root is typically null, indicating that the tree is empty.

4. When the tree is empty and a new node is to be added, the new node becomes the root of the tree.

5. The purpose of the code inside the add() method is to find the correct position for the new node based on its data. If the data is less than the current node's data, it moves to the left child; if greater, it moves to the right. If a null child is found, the new node is added there.



14.3 Experiments

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
}


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


14.3.2 Questions


1. What is the purpose of the data and idxLast attributes in the BinaryTreeArray class?


2. What is the function of the populateData() method?


3. What is the purpose of the traverseInOrder() method?


4. If a binary tree node is stored at index 2 in the array, at which indices are its left and right
children located, respectively?


5. What is the purpose of the statement int idxLast = 6 in Experiment 2, step 4?


6. Why are the indices 2 * idxStart + 1 and 2 * idxStart + 2 used in the recursive calls, and how do
they relate to the structure of a binary tree represented as an array?


Answer : 

1. The data attribute stores the array of node data, and the idxLast attribute stores the index of the last node in the array.

2. The populateData() method populates the array with data from a given file.

3. The traverseInOrder() method performs an in-order traversal of the tree, printing the node data in ascending order.

4. The left child is located at index 2 * 2 + 1 = 5, and the right child at index 2 * 2 + 2 = 6.

5. The statement sets the last index of the array to 6, which is the last node of the tree.

6. The indices 2 * idxStart + 1 and 2 * idxStart + 2 are used in the recursive calls to traverse the left and right subtrees, respectively. These indices are used because the left child of a node at index idxStart is located at index 2 * idxStart + 1 and the right child at index 2 * idxStart + 2.


Assignment : 

1. Implement a recursive method addRekursif() in the BinaryTree00 class to add nodes
recursively.


2. Create methods getMinIPK() and getMaxIPK() in the BinaryTree00 class to retrieve and
display the student data with the lowest and highest GPA(IPK) values stored in the binary
search tree.


3. Develop a method displayStudentsWithIPKAbove (double threshold) in the BinaryTree00
class to display student data whose GPA(IPK) exceeds a specified threshold (e.g., above 3.50)
within the binary search tree.

Answer : 


    public void addRekursif(Students1 data) {
        root = addRekursif(root, data);
    }

    private Node01 addRekursif(Node01 current, Students1 data) {
        if (current == null) {
            return new Node01(data);
        }

        if (data.ipk < current.data.ipk) {
            current.left = addRekursif(current.left, data);
        } else if (data.ipk > current.data.ipk) {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public Students1 getMinIPK() {
        if (root == null) {
            return null;
        }
        Node01 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public Students1 getMaxIPK() {
        if (root == null) {
            return null;
        }
        Node01 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    public void displayStudentsWithIPKAbove(double threshold) {
        displayStudentsWithIPKAbove(root, threshold);
    }

    private void displayStudentsWithIPKAbove(Node01 node, double threshold) {
        if (node != null) {
            displayStudentsWithIPKAbove(node.left, threshold);
            if (node.data.ipk > threshold) {
                node.data.print();
            }
            displayStudentsWithIPKAbove(node.right, threshold);
        }
    }



4. Modify the BinaryTreeArray00 class by adding the following methods:
o add(Student data) to insert data into the binary tree represented as an array.
o traversePreOrder() to perform a pre-order traversal of the binary tree.

Answer : 


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
