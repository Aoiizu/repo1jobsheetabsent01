
public class SortMain {

    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        MergeSort ms = new MergeSort();

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        ms.printArray(data);

        ms.mergeSort(data);

        System.out.println("Sorted Data");
        ms.printArray(data);
    }
}
