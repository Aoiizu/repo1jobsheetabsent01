
public class TransaksiPengisian {

    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalbayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
    }

    double countTotal() {
        totalbayar = bbm.hargaPerLiter * liter;
        return totalbayar;
    }

    void print() {
        System.out.println(kendaraan.platNomor + ": Rp. " + countTotal());
    }
}
