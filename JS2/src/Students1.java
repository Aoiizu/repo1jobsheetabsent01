public class Students1 {
    String name;
    String nim;
    double ipk;
    String kelas;


    void tampilkanInformasi() {
        System.out.println("Name: " + name);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Class: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIPK(double ipkBaru) {
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("Invalid IPK. Must be between 0.0 and 4.0.");
        } else {
            ipk = ipkBaru;
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Good performance";
        } else if (ipk >= 3.0) {
            return "Fair performance";
        } else if (ipk >= 2.0) {
            return "Poor performance";
        } else {
            return "Very poor performance";
        }

    }
    
    public Students1 () {
    }
    
    public Students1 (String nm, String nim, double ipk, String kls)    {
        name = nm;  
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

}

