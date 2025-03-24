
public class MainLecturer {

    Lecturer1[] data = new Lecturer1[10];
    int idx = 0;

    public void add(Lecturer1 lecturer) {
        if (idx < data.length) {
            data[idx] = lecturer;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    public void display() {
        if (idx == 0) {
            System.out.println("No data available.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            data[i].display();
        }
    }

    public void bubbleSortAscending() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (data[j].age > data[j + 1].age) {
                    Lecturer1 temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void bubbleSortDescending() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (data[j].age < data[j + 1].age) {
                    Lecturer1 temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSortDescending() {
        for (int i = 1; i < idx; i++) {
            Lecturer1 temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].age < temp.age) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        MainLecturer main = new MainLecturer();
        main.add(new Lecturer1("123", "Zidan", true, 28));
        main.add(new Lecturer1("125", "Ayu", false, 22));
        main.add(new Lecturer1("127", "Sofi", true, 30));
        main.add(new Lecturer1("129", "Sita", false, 25));
        main.add(new Lecturer1("131", "Miki", true, 35));

        System.out.println("Before sorting:");
        main.display();

        System.out.println("\nData sorted using BUBBLE SORT (ASC):");
        main.bubbleSortAscending();
        main.display();

        System.out.println("\nData sorted using BUBBLE SORT (DESC):");
        main.bubbleSortDescending();
        main.display();

        System.out.println("\nData sorted using INSERTION SORT (DESC):");
        main.insertionSortDescending();
        main.display();
    }
}
