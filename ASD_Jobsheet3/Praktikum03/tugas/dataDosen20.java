package Praktikum_ASD.ALSD_Jobsheet3.Praktikum03.tugas;

public class dataDosen20 {
    public void dataSemuaDosen(dosen20[] arrDosen20) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (int i = 0; i < arrDosen20.length; i++) {
            System.out.println("------------Data Dosen-------------");
            System.out.println("Data Dosen Ke-" + (i + 1));
            arrDosen20[i].tampilkanData(); 
        }
    }
    public void jumlahDosenPerJenisKelamin(dosen20[] arrDosen20) {
        int lakiLaki = 0, perempuan = 0;

        for (dosen20 dosen : arrDosen20) {
            if (dosen.jenisKelamin) {
                lakiLaki++;
            } else {
                perempuan++;
            }
        }

        System.out.println("\n===== Jumlah Dosen Berdasarkan Jenis Kelamin =====");
        System.out.println("Laki-laki : " + lakiLaki);
        System.out.println("Perempuan : " + perempuan);
    }
    public void rataRataUsiaDosenPerJenisKelamin(dosen20[] arrDosen20) {
        int totalUsiaLaki = 0, totalUsiaPerempuan = 0;
        int rataRataLaki = 0, rataRataPerempuan = 0;

        for (dosen20 dosen : arrDosen20) {
            if (dosen.jenisKelamin) { 
                totalUsiaLaki += dosen.usia;
                rataRataLaki++;
            } else { 
                totalUsiaPerempuan += dosen.usia;
                rataRataPerempuan++;
            }
        }

        System.out.println("\n===== Rata-rata Usia Dosen Berdasarkan Jenis Kelamin =====");
        if (rataRataLaki > 0) {
            System.out.println("Laki-laki  : " + (double) totalUsiaLaki / rataRataLaki);
        } else {
            System.out.println("Laki-laki  : Tidak ada data");
        }

        if (rataRataPerempuan > 0) {
            System.out.println("Perempuan  : " + (double) totalUsiaPerempuan / rataRataPerempuan);
        } else {
            System.out.println("Perempuan  : Tidak ada data");
        }
    }
    public void dosenPalingTua(dosen20[] arrDosen20) {
        if (arrDosen20.length == 0) {
            System.out.println("Tidak ada data");
            return;
        }
        dosen20 tertua = arrDosen20[0];

        for (dosen20 dosen : arrDosen20) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("\n===== Dosen Paling Tua =====");
        tertua.tampilkanData();
    }
    public void dosenPalingMuda(dosen20[] arrDosen20) {
        if (arrDosen20.length == 0) {
            System.out.println("Tidak ada data");
            return;
        }
        dosen20 muda = arrDosen20[0];

        for (dosen20 dosen : arrDosen20) {
            if (dosen.usia < muda.usia) {
                muda = dosen;
            }
        }
        System.out.println("\n===== Dosen Paling Muda =====");
        muda.tampilkanData();
    }
}
