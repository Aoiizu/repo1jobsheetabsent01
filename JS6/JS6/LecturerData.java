
public class LecturerData {

    Lecturer1[] lecturerData = new Lecturer1[10];
    int index = 0;

    public void add(Lecturer1 lecturer) {
        if (index < lecturerData.length) {
            lecturerData[index] = lecturer;
            index++;
        } else {
            System.out.println("Data is full!");
        }
    }

    public void display() {
        for (int i = 0; i < index; i++) {
            lecturerData[i].display();
        }
    }

    public void sortAscending() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - 1 - i; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer1 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortDescending() {
        for (int i = 0; i < index - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < index; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer1 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }

    public void insertionSortDescending() {
        for (int i = 1; i < index; i++) {
            Lecturer1 temp = lecturerData[i];
            int j = i - 1;
            while (j >= 0 && lecturerData[j].age < temp.age) {
                lecturerData[j + 1] = lecturerData[j];
                j--;
            }
            lecturerData[j + 1] = temp;
        }
    }
}
