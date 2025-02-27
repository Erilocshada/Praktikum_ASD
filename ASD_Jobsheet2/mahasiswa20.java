package ALSD_Jobsheet2;


public class mahasiswa20 { // class atribut 
    String nama;
    String nim;
    String kelas;
    double ipk;
    public mahasiswa20(){
    }
    public mahasiswa20(String nma, String nim, String kls, double ipk){
        nama = nma;
        this.nim = nim;
        kelas = kls;
        this.ipk = ipk;
    }
    void tampilkanInformasi(){ // class method 
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    String ubahKelas(String kelasBaru){
        kelas = kelasBaru;
        return kelas;
    }
    double updateIpk(double ipkBaru){
        ipk = ipkBaru;
        return ipk;
    }
    String nilaiKinerja(){
        if (ipk < 0.0 && ipk > 4.0) {
            return "IPK tidak valid, Harus antara 0.0 dan 4.0";
        }
        else if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else {
            return "Kinerja kurang";
        }
    }
}