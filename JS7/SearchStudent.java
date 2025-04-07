
public class SearchStudent {

    Students[] listStd;
    int idx;

    public SearchStudent(int size) {
        listStd = new Students[size];
        idx = 0;
    }

    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students s : listStd) {
            s.display();
            System.out.println("----------------------------");
        }
    }

    public void sortByNIMAscending() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = i + 1; j < idx; j++) {
                if (listStd[i].nim > listStd[j].nim) {
                    Students temp = listStd[i];
                    listStd[i] = listStd[j];
                    listStd[j] = temp;
                }
            }
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    // Divide and Conquer
    public int FindBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari == listStd[mid].nim) {
                return mid;
            } else if (listStd[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM " + x + " found at index " + pos);
        } else {
            System.out.println("NIM " + x + " not found.");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            listStd[pos].display();
        } else {
            System.out.println("Data with NIM " + x + " not found.");
        }
    }
}
