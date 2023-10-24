import java.util.Scanner;

public class ModifikasiPercobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiAkhir[] = new int[10];
        
        // Menambahkan variabel status
        String status;

        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.println("Masukkan nilai akhir ke-" +i+ ":");
            nilaiAkhir[i]= sc.nextInt();
        }

        // Mengubah statement pada langkah ke-5 untuk mencetak status kelulusan
        for(int i=0; i < nilaiAkhir.length; i++){
            if(nilaiAkhir[i] > 70){
                status = "Lulus!";
            }else{
                status = "Tidak Lulus!";
            }
            System.out.println("Mahasiswa ke-"+ i +" : "+ status);
        }
    }
}
