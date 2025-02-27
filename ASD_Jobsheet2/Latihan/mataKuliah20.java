package ALSD_Jobsheet2.Latihan;

public class mataKuliah20 {
    String kodeMK;
    String nama;
    int sks;
    int jmlJam;
    public mataKuliah20(){
    }
    public mataKuliah20(String kd, String nm , int sks, int jmlJam) {
        this.kodeMK = kd;
        this.nama = nm;
        this.sks = sks;

        this.jmlJam = jmlJam;
    }
    void tampilkanInformasi (){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jml Jam: " + jmlJam);
        System.out.println();
    }
    int ubahSks(int sksBaru) {
        sks = sksBaru;
        return sks;
    }
    int tambahJam(int jamTambah) {
        jmlJam += jamTambah;
        return jmlJam;
    }
    int kurangJam(int jamKurang) {
        if (jamKurang <= jmlJam) {
            jmlJam -= jamKurang;
            return jmlJam;
        } else {
            System.out.println("Jam yang diinginkan melebihi jam yang ada.");
            return jmlJam;
        }
    }
}

