package Tugas;

public class mahasiswa20 {
    String nama;
    String nim;
    String kelas;
    double ipk;
    public mahasiswa20(String nama, String nim,String kelas,double ipk){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampildata(){
        System.out.println(nama+"\t"+nim+"\t"+kelas+"\t"+ipk+"\t");
    }
}
