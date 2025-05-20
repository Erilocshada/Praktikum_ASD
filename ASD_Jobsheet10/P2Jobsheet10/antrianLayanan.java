package p2Jobsheet10;
public class antrianLayanan {
    mahasiswa20[] data;
    int front;
    int rear;
    int size;
    int max;
    public antrianLayanan(int max){
        this.max = max;
        this.data = new mahasiswa20[max];
        this.size = 0;
        this.front = 0;
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
    public void liatTerdepan(){
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan: "+data[front]);
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilData();
        } else { 
            System.out.println("Antrian Kosong");
        }
    }
    public void liatBelakang(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Mahasiswa Belakang Sendiri: "+data[rear]);
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilData();
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
            }
            System.out.println("Daftar Mahasiswa dalam antrian Antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front+i)%max;
                System.out.print((i+1)+". ");
                data[index].tampilData();
            }
    }
    public int getJmlAntri(){
        return size;
    }
    public void tambahAntrian(mahasiswa20 mhs){
        if (isFull()) {
            System.out.println("Data sudah penuh!");
            return;
        }
        rear = (rear +1)% max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian");
    }
    public mahasiswa20 layaniMhs(){
        if (isEmpty()) {
            System.out.println("Queue sudah kosong!");
            return null;
        }
        mahasiswa20 mhs = data[front];
        front = (front+1) % max;
        size--;
        return mhs;
    }
}