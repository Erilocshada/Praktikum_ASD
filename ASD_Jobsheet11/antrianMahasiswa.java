package Tugas;

public class antrianMahasiswa {
    mahasiswa20 data;
    antrianMahasiswa head;
    antrianMahasiswa tail;
    antrianMahasiswa next;
    public antrianMahasiswa(mahasiswa20 data, antrianMahasiswa next) {
    this.data = data;
    this.next = next;
    }
    public boolean isEmpty(){
        return(head == null);
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else{
            antrianMahasiswa tmp = head;
            System.out.println("Isi linked list : \t");
            System.out.println("NIM | NAMA | Kelas | IP |");
            while (tmp != null) {
                tmp.data.tampildata();
                tmp = tmp.next;
            }
            System.out.println("");
        }
    }
    public void addFirst(mahasiswa20 input){
        antrianMahasiswa ndInput = new antrianMahasiswa(input,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(mahasiswa20 input){
        antrianMahasiswa ndInput = new antrianMahasiswa(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, mahasiswa20 input){
        antrianMahasiswa ndInput = new antrianMahasiswa(input, null);
        antrianMahasiswa temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, mahasiswa20 input){
        if (index < 0) {
            System.out.println("Index salah ");
        } else if (index == 0) {
            addFirst(input);
        } else {
            antrianMahasiswa temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new antrianMahasiswa(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    public void getData(int index){
        antrianMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampildata();
    }
    public int index0f(String key) {
        antrianMahasiswa tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat menghapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat menghapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            antrianMahasiswa temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove (String key){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus!");
        } else {
            antrianMahasiswa temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key))&& (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            antrianMahasiswa temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
