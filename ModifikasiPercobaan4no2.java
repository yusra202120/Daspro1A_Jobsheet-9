import java.util.Scanner;

public class ModifikasiPercobaan4no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int n = sc.nextInt();

        int[] arrayInt = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arrayInt[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Key " + key + " ada di posisi indeks ke-" + index);
        } else {
            System.out.println("Key " + key + " tidak ditemukan");
        }
    }
}
