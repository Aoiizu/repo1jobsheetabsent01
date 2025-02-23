public class StudentMain1 {

    public static void main(String[] args) {
        Students1 mhs1 = new Students1();
        mhs1.name = "ABC";
        mhs1.nim = "123";
        mhs1.ipk = 3.5;
        mhs1.kelas = "A";

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Students1 mhs2 = new Students1("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

    }

}
