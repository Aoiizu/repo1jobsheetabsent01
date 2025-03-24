
public class Sorting {

    int[] data;
    int jmlDat;

    Sorting(int[] data) {
        this.data = data.clone();
        this.jmlDat = data.length;
    }

    void bubbleSort() {
        for (int i = 0; i < jmlDat - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < jmlDat - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < jmlDat - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < jmlDat; j++) {
                if (data[j] < data[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = data[minIdx];
            data[minIdx] = data[i];
            data[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < jmlDat; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    void tampil() {
        for (int i = 0; i < jmlDat; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
