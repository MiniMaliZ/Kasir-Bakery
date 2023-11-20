// import java.util.Scanner;

import java.util.Scanner;

public class finalproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jumlahBarang, hargaRoti, totalHarga, totalBayar, kembalian, hargaSetelahDiskon;
        String namaRoti, nama, sandi;
        char member;
        boolean login;
        int counter = 0;

        String [] username = {"Sufyan", "Bagas"};
        String [] password = {"12345", "54321"};

        hargaRoti = 0;

        while (true) {
            System.out.print("Masukkan Username: ");
            nama = sc.nextLine();
            System.out.print("Masukkan Password: ");
            sandi = sc.nextLine();

            if (counter > username.length) {
                counter = 0;
            }

            if (nama.equals(username[counter]) && sandi.equals(password[counter])) {
                System.out.println("Anda Berhasil Masuk Sebagai " + nama);
                break;
            } else {
                System.out.println("Username atau Password Salah. Silahkan Coba Lagi");
                counter++;
            }   
        }
        
        while (true) {
            System.out.println("Daftar Roti : Roti Abon, Roti Pizza, Roti Moy, Roti Sosis, Roti Milky Cheese");
            System.out.print("Masukkan Roti yang ingin di beli : ");
            namaRoti = sc.nextLine();

            if (namaRoti.toLowerCase().equals("roti abon")) {
                hargaRoti = 7500;
                break;
            } else if (namaRoti.toLowerCase().equals("roti pizza")) {
                hargaRoti = 6500;
                break;
            } else if (namaRoti.toLowerCase().equals("roti moy")) {
                hargaRoti = 7000;
                break;
            } else if (namaRoti.toLowerCase().equals("roti sosis")) {
                hargaRoti = 7000;
                break;
            } else if (namaRoti.toLowerCase().equals("roti milky cheese")) {
                hargaRoti = 6000;
                break;
            } else {
                System.out.println("Roti Tidak tersedia di daftar roti");
            }
        }

        System.out.println("Harga Roti tersebut : " + hargaRoti);
        System.out.print("Masukkan Jumlah Roti : ");
        jumlahBarang = sc.nextInt();

        totalHarga = hargaRoti * jumlahBarang;
        System.out.println("Total Harga : " + totalHarga);

        while (true) {
            System.out.print("Apakah Punya Member (y/t) : ");
            member = sc.next().charAt(0);

            if (member == 'y') {
                if (totalHarga >= 50000 && totalHarga <= 100000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.10);
                    break;
                } else if (totalHarga > 100000 && totalHarga <= 150000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.20);
                    break;
                } else if (totalHarga > 150000){
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.30);
                    break;
                } else {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.00);
                    break;
                }
            } else if (member == 't') {
                if (totalHarga >= 50000 && totalHarga <= 100000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.05);
                    break;
                } else if (totalHarga > 100000 && totalHarga <= 150000) {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.15);
                    break;
                } else if (totalHarga > 150000){
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.25);
                    break;
                } else {
                    hargaSetelahDiskon = totalHarga - (totalHarga * 0.00);
                    break;
                }
            } else {
                System.out.println("Member Tidak Diketahui");
            }
        }

        System.out.println("Total Harga Setelah Diskon : " + hargaSetelahDiskon);
        System.out.print("Masukkan Pembayaran : ");
        totalBayar = sc.nextInt();

        kembalian = totalBayar - hargaSetelahDiskon;
        System.out.println("Kembalian : " + kembalian);

        sc.close();
    }
}