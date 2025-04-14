package Praktikum_ASD.ALSD_Jobsheet6;

public class dataDosen {
    dosen[] dataDosen = new dosen[10];
    int idx = 0;
    void tambah(dosen dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx]=dsn;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        if (idx == 0) {
            System.out.println("Belum ada data");
        } else {
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
            }
        }
    }
    void sortingASC(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }        
    }
    void sortingDSC(){
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            dosen tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }        
}
    void insertionSort(){
        for (int i = 1; i < idx; i++) {
            dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }        
    }
    void sequentialSearching(String cari){
        int posisi = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                dataDosen[i].tampil();
                posisi++;
            }
        }
        if (posisi > 1) {
            System.out.println("Hasil pencarian ditemukan lebih dari satu, Silahkan masukkan data dengan benar");
        }else if (posisi == 0) {
            System.out.println("Data tidak ditemukan");
        }
    }
    void cariBinarySearch(int usia) { 
        sortingASC(); 
        int left = 0, right = idx - 1; 
        int count = 0; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
            if (dataDosen[mid].usia == usia) { 
                int tempMid = mid; 
                while (tempMid >= 0 && dataDosen[tempMid].usia == usia) { 
                    dataDosen[tempMid].tampil(); 
                    count++; 
                    tempMid--; 
                } 
                tempMid = mid + 1; 
                while (tempMid < idx && dataDosen[tempMid].usia == usia) { 
                    dataDosen[tempMid].tampil(); 
                    count++; 
                    tempMid++; 
                } 
                break; 
            } else if (dataDosen[mid].usia < usia) { 
                left = mid + 1; 
            } else { 
                right = mid - 1; 
            } 
        } 
        if (count > 1) { 
            System.out.println("Hasil pencarian ditemukan lebih dari satu kecocokan. Silakan masukkan data dengan tepat!"); 
        } else if (count == 0) { 
            System.out.println("Data tidak ditemukan."); 
        } 
    } 
}
