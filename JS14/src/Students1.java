
public class Students1 {

    String nim, name, className;
    double ipk;

    public Students1() {
    }

    public Students1(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}
