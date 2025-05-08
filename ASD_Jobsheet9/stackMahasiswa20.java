package ALSD_Jobsheet9;
public class stackMahasiswa20 {
    mahasiswa20[] stack;
    int top;
    int size;
    public stackMahasiswa20(int size){
        this.size = size;
        stack = new mahasiswa20[size];
        top = -1;
    }
    public boolean isFull(){
        if (top == size-1) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else{
            return false;
        }
    }
    public void push(mahasiswa20 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! tidak bisa menambahkan tugas lagi.");
        }
    }
    public mahasiswa20 pop(){
        if (!isEmpty()) {
            mahasiswa20 m = stack[top];
            top--;
            return m;
        }else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }
    public mahasiswa20 peek(){
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
    public void print(){
        mahasiswa20[] temp = new mahasiswa20[top+1];
        for (int i = 0; i <= top; i++) {
            temp[i] = stack[i];
        }
        for (int i = 0; i < temp.length-1; i++) {
            for (int j = i+1; j < temp.length; j++) {
                if (Integer.parseInt(temp[i].nim) < Integer.parseInt(temp[j].nim)) {
                    mahasiswa20 tmp = temp[i];
                    temp[i] = temp[j];
                    temp[j] = tmp;
                }
            }           
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i].nama + "\t" + temp[i].nim +"\t"+temp[i].kelas);
        }
        System.out.println("");
    }
}