package ALSD_Jobsheet2.Latihan;

public class dosen20 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String keahlian;
    int masaKerja;
    public dosen20(){
    }
    public dosen20(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String keahlian,int masaKerja){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.keahlian = keahlian;
        this.masaKerja = masaKerja;
    }
    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Non-Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Keahlian: " + keahlian);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
    boolean setStatusAktif(boolean status){
        this.statusAktif = status;
        return status;
    }
    int hitungMasaKerja(int tahunSekarang){
        tahunSekarang = tahunBergabung+masaKerja;
        return tahunSekarang;
    }
    String ubahKeahlian(String keahlianBaru){
        this.keahlian = keahlianBaru;
        return keahlianBaru;
    }
}
