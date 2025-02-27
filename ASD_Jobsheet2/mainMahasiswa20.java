package ALSD_Jobsheet2;

public class mainMahasiswa20 {
    public static void main(String[] args) {
    mahasiswa20 mhs1 = new mahasiswa20();
    mhs1.tampilkanInformasi();
    System.out.println("Setelah diganti");
    mhs1.ubahKelas("SI 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkanInformasi();

    mahasiswa20 mhs2 = new mahasiswa20("Annisa Nabila", "2141720160", "TI 2L", 3.25);
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();

    mahasiswa20 mhsMuhammadPearlOcshada = new mahasiswa20("Muhammad Pearl Ocshada", "244107020064", "1E", 3.8);
        mhsMuhammadPearlOcshada.tampilkanInformasi();

    }
}
