package ALSD_Jobsheet11;
public class mahasiswa20 {
String nim, nama, kelas;
double ipk;
public mahasiswa20(){}

public mahasiswa20(String nim, String nama, String kelas, double ipk) {
this.nim = nim;
this.nama = nama;
this.kelas = kelas;
this.ipk= ipk;
}
public void tampildata(){
    System.out.println(nim+" | "+nama+" | "+kelas+" | "+ipk +" | ");
}
}