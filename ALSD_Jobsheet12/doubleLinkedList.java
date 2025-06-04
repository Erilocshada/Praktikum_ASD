package ALSD_Jobsheet12;

public class doubleLinkedList {
    node20 head;
    node20 tail;
    int size;
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
        size++;
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
        size++;
    }
    public void add(Mahasiswa20 data, int index){
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        }
        if (isEmpty()) {
            addFirst(data);
            return;
        }
        node20 current = head;
        int i = 0;
        while (current != null && i < index-1) {
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi ukuran list. Menambahkan di akhir.");
            addLast(data);
            return;
        }
        node20 newNode = new node20(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
        size++;
        System.out.println("Data Berhasil ditambahkan indexs ke- "+index);
    }
    public void remove(int index){
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        if (index < 0) {
            System.out.println("Index tidak Valid");
        }
        if (index == 0) {
            System.out.print("Data yang dihapus: ");
            head.data.tampil();
            removeFirst();
        }
        node20 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi panjang list");
        }
        System.out.print("data yang dihapus : ");
        current.data.tampil();

        if (current == tail) {
            removeLast();
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
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
        size--;
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
        size--;
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
        size++;
        System.out.println("Node Berhasil DiSisipkan setelah NIM " + keyNim);
    }
    public void removeAfter(String keyNim){
        if (isEmpty()) {
            System.out.println("List Kosong");
            return;
        }
        node20 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan nim "+ keyNim + " tidak ditemukan!");
            return;
        }
        node20 nodeRm = current.next;
        current.next = nodeRm.next;

        if (nodeRm.next != null) {
            nodeRm.next.prev = current;
        } else {
            tail = current;
        }
        size--;
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. Data yang dihapus:");
        nodeRm.data.tampil();
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
    public void getFirst (){
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data!");
        } else {
            System.out.print("Data pertama: ");
            head.data.tampil();
        }
    }
    public void getLast(){
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data!");
        } else {
            System.out.println("Data Terakhir: ");
            tail.data.tampil();
        }
    }
    public void getIndex(int index){
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data!");
        }
        if (index < 0) {
            System.out.println("Index tidak valid!");
            return;
        }
        node20 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi panjang list.");
        } else {
            System.out.print("Data pada indeks ke-" + index + ": ");
            current.data.tampil();
        }
    }
    public int getSize(){
        return size;
    }
}
