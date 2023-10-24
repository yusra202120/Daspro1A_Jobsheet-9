import java.util.Scanner;

public class tugaskelarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan nama-nama mobil
        String[] namaMobil = {
                "Honda Brio (Lepas Kunci)",
                "Honda Brio (Dengan Driver)",
                "Isuzu Elf Long (Lepas Kunci)",
                "Isuzu Elf Long (Dengan Driver)",
                "Mitsubishi X-Pander (Lepas Kunci)",
                "Mitsubishi X-Pander (Dengan Driver)"
        };

        // Array untuk menyimpan harga-harga mobil
        double[] hargaMobil = {300000, 600000, 1000000, 1400000, 450000, 750000};

        System.out.println("-------------------------------------------");
        System.out.println("| SELAMAT DATANG DI PERSEWAAN MOBIL YAPUZA |");
        System.out.println("-------------------------------------------");

        boolean lanjutSewa = true;
        double totalBiayaSewa = 0;
        String invoice = "";
        String namaPenyewa = "";
        String pesanLagi = "";

        System.out.println("Masukkan informasi penyewa:");
        System.out.print("Nama penyewa: ");
        namaPenyewa = scanner.nextLine();

        while (lanjutSewa) {
            // Menampilkan daftar mobil
            System.out.println("Daftar sewa Mobil per hari:");
            System.out.println("-------------------------------------------------");
            System.out.println("| No. |    Mobil               | Harga            |");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < namaMobil.length; i++) {
                System.out.printf("| %-3d| %-22s | Rp. %-12.0f|\n",
                        i+1, namaMobil[i], hargaMobil[i]);
            }
            System.out.println("--------------------------------------------------");

            // Memasukkan jumlah hari penyewaan
            System.out.print("Masukkan jumlah hari penyewaan: ");
            int jumlahHari = scanner.nextInt();

            // Memasukkan nomor mobil yang dipilih
            System.out.print("Masukkan nomor mobil yang dipilih (1 - "+namaMobil.length+"): ");
            int pilihanMobil = scanner.nextInt();

            // Menentukan apakah menggunakan driver atau tidak
            System.out.print("Apakah ingin menggunakan driver? (y/n): ");
            String menggunakanDriver = scanner.next();

            // Menentukan harga sewa berdasarkan pilihan mobil dan penggunaan driver
            double hargaSewa = 0;
            String mobilSewa = "";
            if (pilihanMobil >= 1 && pilihanMobil <= namaMobil.length) {
                mobilSewa = namaMobil[pilihanMobil-1];
                if (menggunakanDriver.equalsIgnoreCase("y")) {
                    hargaSewa = jumlahHari * hargaMobil[pilihanMobil-1] * 2;
                    mobilSewa += " (Dengan Driver)";
                } else if (menggunakanDriver.equalsIgnoreCase("n")) {
                    hargaSewa = jumlahHari * hargaMobil[pilihanMobil-1];
                    mobilSewa += " (Lepas Kunci)";
                } else {
                    System.out.println("Input tidak valid");
                    continue;
                }
            } else {
                System.out.println("Input tidak valid");
                continue;
            }

            // Menambahkan harga sewa ke totalBiayaSewa
            totalBiayaSewa += hargaSewa;

            // Menyusun informasi invoice
            invoice += "-----------------------------------\n";
            invoice += "Nama Penyewa: " + namaPenyewa + "\n";
            invoice += "Mobil Sewa: " + mobilSewa + "\n";
            invoice += "Jumlah Hari: " + jumlahHari + "\n";
            invoice += "Harga Sewa: Rp. " + hargaSewa + "\n";
            invoice += "-----------------------------------\n";

            // Menanyakan apakah pengguna ingin memesan mobil lagi
            System.out.print("Apakah ingin memesan mobil lagi? (y/n): ");
            pesanLagi = scanner.next();
            if (pesanLagi.equalsIgnoreCase("n")) {
                lanjutSewa = false;
            }
            scanner.nextLine(); // Mengonsumsi karakter baru (newline) setelah input
        }

        System.out.println("Terima kasih telah menggunakan layanan kami!");

        // Menampilkan invoice
        System.out.println("Invoice:\n" + invoice);

        // Mengurutkan daftar mobil berdasarkan harga dari yang termurah menggunakan insertion sort
        for (int i = 1; i < hargaMobil.length; i++) {
            double key = hargaMobil[i];
            String keyNama = namaMobil[i];
            int j = i - 1;
            while (j >= 0 && hargaMobil[j] > key) {
                hargaMobil[j+1] = hargaMobil[j];
                namaMobil[j+1] = namaMobil[j];
                j--;
            }
            hargaMobil[j+1] = key;
            namaMobil[j+1] = keyNama;
        }

        // Menampilkan daftar mobil setelah diurutkan
        System.out.println("Daftar Harga Sewa Mobil dari Termurah:");
        System.out.println("--------------------------------------------");
        System.out.println("|       Mobil              | Harga            |");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < namaMobil.length; i++) {
            System.out.printf("| %-23s| Rp. %-12.0f|\n",
                    namaMobil[i], hargaMobil[i]);
        }
        
        System.out.println("--------------------------------------------");

        System.out.println("Total Seluruh Pesanan Mobil: Rp. " + totalBiayaSewa);

        scanner.close();
    }
}