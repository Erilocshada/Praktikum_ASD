package Praktikum_ASD.ALSD_Jobsheet6;

public class sortingMain20 {
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        sorting20 dataurut1 = new sorting20(a, a.length);
        
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT");
        dataurut1.tampil();

        int b[] = {30,20,2,8,14};
        sorting20 dataurut2 = new sorting20(b,b.length);

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.bubbleSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT");
        dataurut2.tampil();

        int c[] = {40,10,4,9,3};
        sorting20 dataurut3 = new sorting20(c,c.length);

        System.out.println("Data Awal 3");
        dataurut3.tampil();
        dataurut3.bubbleSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT");
        dataurut3.tampil();
        

    }
    
}
