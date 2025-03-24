package Praktikum_ASD.ALSD_Jobsheet6;

public class mahasiswaBerprestasi {
    mahasiswa20 [] listMhs = new mahasiswa20[5];
    int idx;
    void tambah(mahasiswa20 m){
        if (idx < listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for(mahasiswa20 m :listMhs){
            m.tampilInformasi();
            System.out.println("-------------------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    mahasiswa20 temp = listMhs[j];
                    listMhs[j] = listMhs [j-1];
                    listMhs[j-1]=temp;
                }
            }
        }
    }
}