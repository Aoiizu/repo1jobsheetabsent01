
import java.util.Scanner;

public class SPBUPolinema {

    public static void main(String[] args) {
        Scanner harko = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList(5);
        RiwayatTransaksi hist = new RiwayatTransaksi(5);

        int pilihan;
        do {
            System.out.println("-- SPBU Polinema --");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("6. Exit");
            System.out.print("Pilih Menu : ");
            pilihan = harko.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nomer Plat : ");
                    String plat = harko.next();
                    System.out.print("Masukkan Jenis Kendaraan : ");
                    String tipe = harko.next();
                    System.out.print("Masukkan Merk : ");
                    String merk = harko.next();

                    Kendaraan kdr = new Kendaraan(plat, tipe, merk);
                    sll.add(kdr);
                    break;
                case 2:
                    sll.print();
                    break;
                case 3:
                    sll.printSize();
                    break;
                case 4:
                    System.out.println("Petugas melayani: " + sll.head.data.platNomor);

                    harko.nextLine();
                    System.out.print("Masukkan jenis BBM: ");
                    String BBM = harko.nextLine();
                    System.out.print("Masukkan Harga per Liter: ");
                    double hpl = harko.nextDouble();
                    System.out.print("Masukkan Jumlah Liter: ");
                    double liter = harko.nextDouble();

                    BBM newBBM = new BBM(BBM, hpl);
                    TransaksiPengisian newRiwayat = new TransaksiPengisian(sll.head.data, newBBM, liter);
                    hist.enqueue(newRiwayat);
                    sll.removeFirst();

                    System.out.println("Transaksi berhasil dicatat.");
                    break;
                case 5:
                    hist.print();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        } while (pilihan != 6);
    }
}
