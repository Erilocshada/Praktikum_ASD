package ALSD_Jobsheet12;
public class doubleLinkedList {
    node20 head;
    node20 tail;

    public doubleLinkedList() {
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void addFirst(Mahasiswa20 data){
        node20 newNode = new node20(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addLast(Mahasiswa20 data){
        node20 newNode = new node20(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void add(int item, int index){

    }
    public void print(){
        
        if (isEmpty()) {
            System.out.println("Linkedlist masih kosong!");
        }
        node20 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        }
        Mahasiswa20 dataDel = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data Sudah dihapus! data yang terhapus : ");
        dataDel.tampil();
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus");
            return;
        }
        Mahasiswa20 dataDel = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data Sudah dihapus! data yang terhapus : ");
        dataDel.tampil();
    }
    public void insertAfter(String keyNim, Mahasiswa20 data){
        node20 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan nim "+ keyNim + " tidak ditemukan!");
            return;
        }
        node20 newNode = new node20(data);
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        }else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Node Berhasil DiSisipkan setelah NIM " + keyNim);
    }
        public node20 search(String nim) {
        node20 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                System.out.println("Ditemukan:");
                current.data.tampil();
                return current;
            }
            current = current.next;
        }
        System.out.println("Data tidak ditemukan.");
        return null;
    }
}
