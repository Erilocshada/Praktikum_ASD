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
            if (m != null) {
                m.tampilInformasi();    
            }
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
    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin = i;
            for (int j = 0; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                idxMin = j;
                }
            }
            mahasiswa20 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    void insertionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            mahasiswa20 temp = listMhs[i];
            int j =1;
            while (j>0 && listMhs[j-1].ipk > temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j< listMhs.length;j++){
            if(listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    void tampilPosisi(double x, int pos){
        if(pos!=-1){
            System.out.println("data mahasiswa dengan IPK :"+x+" ditemukan pada indeks "+pos);
        } else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("Kelas\t : "+listMhs[pos].kelas);
            System.out.println("IPK\t : "+x);
        }else{
            System.out.println("Data mahasiwa dengan IPK "+x+" tidak ditemukan");
        }
    }
}