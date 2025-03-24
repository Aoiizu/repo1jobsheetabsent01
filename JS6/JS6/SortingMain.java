
public class SortingMain {

    public static void main(String[] args) {
        int[] originalArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Data sebelum sorting:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        Sorting bubbleSortData = new Sorting(originalArray);
        bubbleSortData.bubbleSort();
        System.out.println("Data setelah Bubble Sort:");
        bubbleSortData.tampil();

        Sorting selectionSortData = new Sorting(originalArray);
        selectionSortData.selectionSort();
        System.out.println("Data setelah Selection Sort:");
        selectionSortData.tampil();

        Sorting insertionSortData = new Sorting(originalArray);
        insertionSortData.insertionSort();
        System.out.println("Data setelah Insertion Sort:");
        insertionSortData.tampil();
    }
}
