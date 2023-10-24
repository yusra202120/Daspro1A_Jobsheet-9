import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int n = sc.nextInt();

        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        // Inisialisasi nilai tertinggi dan terendah
        int nilaiTertinggi = arrayInt[0];
        int nilaiTerendah = arrayInt[0];

        // Iterasi array untuk mencari nilai tertinggi dan terendah
        for (int i = 1; i < n; i++) {
            if (arrayInt[i] > nilaiTertinggi) {
                nilaiTertinggi = arrayInt[i];
            } else if (arrayInt[i] < nilaiTerendah) {
                nilaiTerendah = arrayInt[i];
            }
        }

        // Hitung rata-rata
        double rataRata = 0;
        for (int i = 0; i < n; i++) {
            rataRata += arrayInt[i];
        }
        rataRata /= n;

        // Tampilkan hasil
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rataRata);
    }
}
