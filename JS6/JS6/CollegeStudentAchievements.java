
public class CollegeStudentAchievements {

    CollegeStudent1[] listStudents = new CollegeStudent1[5];
    int idx;

    void add(CollegeStudent1 s) {
        if (idx < listStudents.length) {
            listStudents[idx] = s;
            idx++;
        } else {
            System.out.println("Data is full");
        }
    }

    void display() {
        for (CollegeStudent1 s : listStudents) {
            s.displayInfo();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listStudents.length - 1; i++) {
            for (int j = 0; j < listStudents.length - 1 - i; j++) {
                if (listStudents[j].gpa > listStudents[j + 1].gpa) {
                    CollegeStudent1 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listStudents.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listStudents.length; j++) {
                if (listStudents[j].gpa < listStudents[minIndex].gpa) {
                    minIndex = j;
                }
            }
            CollegeStudent1 temp = listStudents[minIndex];
            listStudents[minIndex] = listStudents[i];
            listStudents[i] = temp;
        }
    }

    // INSERT THE NEW DESCENDING INSERTION SORT METHOD HERE
    void insertionSortDescending() {
        for (int i = 1; i < idx; i++) {
            CollegeStudent1 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j - 1].gpa < temp.gpa) {
                listStudents[j] = listStudents[j - 1];
                j--;
            }
            listStudents[j] = temp;
        }
    }
}
