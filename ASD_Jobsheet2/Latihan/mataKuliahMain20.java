package ALSD_Jobsheet2.Latihan;

public class mataKuliahMain20 {
    public static void main(String[] args) {
        mataKuliah20 mk1 = new mataKuliah20("1","AlSD",3,6);
        mk1.tampilkanInformasi();
        mk1.ubahSks(2);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();
        mataKuliah20 mk2 = new mataKuliah20();
        mk2.kodeMK = "2";
        mk2.nama = "Struktur Data";
        mk2.sks = 4;
        mk2.jmlJam = 6;
        mk2.tampilkanInformasi();
        mk2.kurangJam(2);
        mk2.tampilkanInformasi();
    }
}
