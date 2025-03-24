package Praktikum_ASD.ALSD_Jobsheet6;

public class mahasiswaDemo20 {
    public static void main(String[] args) {
        mahasiswaBerprestasi list = new mahasiswaBerprestasi();
        mahasiswa20 m1 = new mahasiswa20("123","Zidan","2A",3.2);
        mahasiswa20 m2 = new mahasiswa20("124","Ayu","2A",3.5);
        mahasiswa20 m3 = new mahasiswa20("125","Sofi","2A",3.1);
        mahasiswa20 m4 = new mahasiswa20("126","Sita","2A",3.9);
        mahasiswa20 m5 = new mahasiswa20("127","Miki","2A",3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa Sebelum Sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK");
        list.bubbleSort();
        list.tampil();
    }
}
