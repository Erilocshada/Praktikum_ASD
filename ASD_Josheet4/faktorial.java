package Praktikum_ASD.ALSD_Jobsheet4;

public class faktorial {
    int faktorialDC(int n){
        int faktor = 1;
        for (int i = 0; i <= n; i++) {
            faktor *= i;
        }
        return faktor;
    }
    int faktorialBF(int n){
        if (n == 1) {
            return 1;
        }else{
            int faktor = n *faktorialDC(n-1);
            return faktor;
        }
    }
}
