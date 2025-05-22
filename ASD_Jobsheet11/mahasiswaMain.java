package ALSD_Jobsheet11;
public class mahasiswaMain {
    public static void main(String[] args) {
        mahasiswa20 mhs1 = new mahasiswa20("123","Dirga","1E",3.2);
        mahasiswa20 mhs2 = new mahasiswa20("345","Alvaro","1E",3.2);
        mahasiswa20 mhs3 = new mahasiswa20("678","Cintia","1E",3.2);
        mahasiswa20 mhs4 = new mahasiswa20("910","Bimon","1E",3.2);
        nodeMahasiswa20 sll = new nodeMahasiswa20(null, null);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
