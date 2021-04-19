package sample;

import java.util.Scanner;

public class TUGASMETHOD {
    static void cetak(String jenis_tempat){
        System.out.println("===================================================================================");
        System.out.println("Selamat datang pada bagian "+jenis_tempat+" Silahkan untuk menikmati layanan kami");
        System.out.println("===================================================================================");
    }
    static Integer hitung(int c,int b){
        int jumlah=c*b;
        return jumlah;
    }
    static void cetak1(String jenis){
        System.out.println("Berapa banyak "+jenis+" yang ingin anda beli");
    }

    public void Makanan() {
            String makan="makanan";
            cetak(makan);
            System.out.println("1.telur=10.0000 2.ayam=20.000 3.sapi=30.0000");
            System.out.println("Silahkan dipilih menunya(1-3)");
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            switch (a) {
                case (1):
                    cetak1("telur");
                    int d =scan.nextInt();
                    int telur_ayam=hitung(d,10000);
                    System.out.print("Harga totalnya adalah "+telur_ayam);
                    break;
                case (2):
                    cetak1("ayam");
                    int e=scan.nextInt();
                    int ayam=hitung(e,20000);
                    System.out.print("Harga totalnya adalah "+ayam);
                    break;
                case (3):
                    cetak1("daging sapi");
                    int f=scan.nextInt();
                    int sapi=hitung(f,30000);
                    System.out.print("Harga totalnya adalah "+sapi);
                    break;
                default:System.out.println("Tidak ada pesanan bos");System.exit(0);break;
            }

    }
    public void Bola(){
        String tempat="Lapangan futsal";
        cetak(tempat);
        System.out.println("Tulis waktu ingin anda bermain dalam jam(1jam,2jam,3jam,dst(tidak ada setengah jam))");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int sewa=hitung(s,50000);
        System.out.println("Anda ingin bermain selama "+Integer.toString(s)+" Dan total harganya adalah sebesar "+Integer.toString(sewa));
    }

    public static void main(String[] args) {
        System.out.println("Kelompok 14");
        System.out.println("Anggota Kelompok");
        System.out.println("Khasandra Nur Pristiwaning rahayu(21120120140089)");
        System.out.println("Muhanif Rafi Ahmadi(21120120130044)");
        System.out.println("Nur Ayuk Febreyanti(21120120130053)");
        System.out.println("Rosyad Shidqi Dikpimmas(21120120130161)");
        Scanner scan = new Scanner(System.in);
        cetak("Halaman utama");
        System.out.println("Silahkan pilih layanan yang ingin anda pilih(1.Makanan,2.Sewa Futsal)");
        int i = scan.nextInt();
        while(i>2 || i<1) {
            System.out.println("Silahkan pilih layanan yang ingin anda pilih(1.Makanan,2.Sewa Futsal)");
            i = scan.nextInt();
        }
        if(i==1){
            TUGASMETHOD objek =new TUGASMETHOD();
            objek.Makanan();
        }
        else{
            TUGASMETHOD objek =new TUGASMETHOD();
            objek.Bola();
        }

    }
}

