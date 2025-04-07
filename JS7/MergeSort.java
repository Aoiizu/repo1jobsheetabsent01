
public class MergeSort {

    public void mergeSort(int[] data1) {
        sort(data1, 0, data1.length - 1);
    }

    private void merge(int[] data1, int left, int middle, int right) {
        int[] temp = new int[data1.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data1[i];
        }

        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data1[c] = temp[a];
                a++;
            } else {
                data1[c] = temp[b];
                b++;
            }
            c++;
        }

        while (a <= middle) {
            data1[c] = temp[a];
            a++;
            c++;
        }
    }

    private void sort(int[] data1, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data1, left, middle);
            sort(data1, middle + 1, right);
            merge(data1, left, middle, right);
        }
    }

    public void printArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}
