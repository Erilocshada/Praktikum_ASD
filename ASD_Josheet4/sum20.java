package Praktikum_ASD.ALSD_Jobsheet4;

public class sum20 {
    double keuntungan [];
    sum20(int el){
        keuntungan = new double[el];
    }
    double totalBF(double arr[], int l, int r){
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total += keuntungan[i]; 
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if (l == r) {
            return arr[l];
        }
        int mid = (l*r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalBF(arr, mid+l,r);
        return lsum+rsum;   
    }
}
