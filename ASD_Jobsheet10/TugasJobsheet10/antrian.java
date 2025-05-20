package tugasJobshet10;

import p2Jobsheet10.mahasiswa20;

public class antrian {
    krs20[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalProsesKRS = 0;
    public antrian(int max){
        this.max = max;
        this.data = new krs20[max];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size= 0;
            System.out.println("Antrian Berhasil dikosongkan");
        } else {
            System.out.println("Antrian kosong");
        }
    }
    public void tambahAntrian(krs20 krs){
        if (isFull()) {
            System.out.println("Data sudah penuh!");
            return;
        }
        rear = (rear +1)% max;
        data[rear] = krs;
        size++;
        System.out.println(krs.nama + " Berhasil masuk ke antrian");
    }
    public void layaniKrs20(){
            if (size < 2) {
            System.out.println("Antrian Kurang dari 2, tidak bisa memproses");
            return;
        }
        System.out.println("Memproses KRS untuk 2 Mahasiswa");
        for (int i = 0; i < 2; i++) {
        krs20 krs = data[front];
        krs.tampilData();
        front = (front+1) % max;
        size--;
        totalProsesKRS++;
        }
    }
    public void print(){
    if (isEmpty()) {
        System.out.println("Antrian Kosong");
        return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("NIM | NAMA | KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front+i)%max;
            System.out.print((i+1)+". ");
            data[index].tampilData();
        }
    }
    public void peekDepan(){
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak dapat diproses");
            return;
        }
        System.out.println("Daftar KRS dalam antrian: ");
        System.out.println("NIM | NAMA | KELAS");
        for (int i = 0; i < 2; i++) {
            int idx = (front+i) % max;
            data[idx].tampilData();
        }
    }
    public void peekBelakang(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiswa Belakang Sendiri: "+data[rear]);
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }
    public int getJmlProsesKRS(){
        return totalProsesKRS;
    }
    public int getJmlAntri(){
        return size;
    }
    public int getSisaMhs(){
        return 30 - totalProsesKRS;
    }
}
