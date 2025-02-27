package ALSD_Jobsheet2.Latihan; 

public class mainDosen20 {
    public static void main(String[] args) {
        dosen20 ds1 = new dosen20();
        ds1.idDosen = "TF1";
        ds1.nama = "Muhammad Pearl Ocshada";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2010;
        ds1.keahlian = "Ilmu Komputer";
        ds1.masaKerja = 10;
        
        ds1.tampilkanInformasi();
        ds1.hitungMasaKerja(2020);
        
    }
}