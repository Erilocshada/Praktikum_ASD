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
        int faktor = 1;
        int i =1;
        while (i <=n){
            faktor *= i;
            i++;
        }
        return faktor;
    }
}
