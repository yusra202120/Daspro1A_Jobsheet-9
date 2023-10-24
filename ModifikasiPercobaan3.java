import java.util.Scanner;

public class ModifikasiPercobaan3no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input banyaknya mahasiswa
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int banyakMhs = sc.nextInt();

        // Deklarasi array nilai mahasiswa
        int[] nilaiMHS = new int[banyakMhs];
        int totalLulus = 0;
        int totalTidakLulus = 0;
        int banyakLulus = 0;
        int banyakTidakLulus = 0;
        double rata2Lulus;
        double rata2TidakLulus;

        for(int i=0; i<nilaiMHS.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMHS[i]=sc.nextInt();

            if (nilaiMHS[i] >= 70) {
                totalLulus += nilaiMHS[i];
                banyakLulus++;
            } else {
                totalTidakLulus += nilaiMHS[i];
                banyakTidakLulus++;
            }
        }

        rata2Lulus = totalLulus / banyakLulus;
        rata2TidakLulus = totalTidakLulus / banyakTidakLulus;

        System.out.println("Nilai rata-rata kelas = " + rata2Lulus);
        System.out.println("Nilai rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
