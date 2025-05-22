package ALSD_Jobsheet11;
public class nodeMahasiswa20 {
    mahasiswa20 data;
    nodeMahasiswa20 next;
    nodeMahasiswa20 head;
    nodeMahasiswa20 tail;

    public nodeMahasiswa20(mahasiswa20 data, nodeMahasiswa20 next) {
        this.data = data;
        this.next = next;
    }
    public boolean isEmpty(){
        return (head == null);
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else{
            nodeMahasiswa20 tmp = head;
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
        nodeMahasiswa20 ndInput = new nodeMahasiswa20(input,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(mahasiswa20 input){
        nodeMahasiswa20 ndInput = new nodeMahasiswa20(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, mahasiswa20 input){
        nodeMahasiswa20 ndInput = new nodeMahasiswa20(input, null);
        nodeMahasiswa20 temp = head;
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
            nodeMahasiswa20 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
            }
            temp.next = new nodeMahasiswa20(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
