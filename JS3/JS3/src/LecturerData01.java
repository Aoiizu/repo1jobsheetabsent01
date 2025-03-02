public class LecturerData01 {
    public static void showAllLecturerData(Lecturer[] lecturerArray) {
        for (Lecturer lecturer : lecturerArray) {
            lecturer.displayInfo();
        }
    }

    public static void countLecturerByGender(Lecturer[] lecturerArray) {
        int maleCount = 0, femaleCount = 0;
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.isMale()) {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        System.out.println("Male Lecturers: " + maleCount);
        System.out.println("Female Lecturers: " + femaleCount);
    }

    public static void averageLecturerAgeByGender(Lecturer[] lecturerArray) {
        int maleAgeSum = 0, femaleAgeSum = 0, maleCount = 0, femaleCount = 0;

        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.isMale()) {
                maleAgeSum += lecturer.getAge();
                maleCount++;
            } else {
                femaleAgeSum += lecturer.getAge();
                femaleCount++;
            }
        }

        System.out.println("Average Age of Male Lecturers: " + (maleCount > 0 ? (maleAgeSum / maleCount) : "N/A"));
        System.out.println("Average Age of Female Lecturers: " + (femaleCount > 0 ? (femaleAgeSum / femaleCount) : "N/A"));
    }

    public static void showOldestLecturerInfo(Lecturer[] lecturerArray) {
        Lecturer oldest = lecturerArray[0];
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.getAge() > oldest.getAge()) {
                oldest = lecturer;
            }
        }
        System.out.println("Oldest Lecturer Info:");
        oldest.displayInfo();
    }

    public static void showYoungestLecturerInfo(Lecturer[] lecturerArray) {
        Lecturer youngest = lecturerArray[0];
        for (Lecturer lecturer : lecturerArray) {
            if (lecturer.getAge() < youngest.getAge()) {
                youngest = lecturer;
            }
        }
        System.out.println("Youngest Lecturer Info:");
        youngest.displayInfo();
    }
}
