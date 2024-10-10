import java.util.Scanner;

public class SiakadFor12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mahasiswalulus = 0, mahasiswatidaklulus = 0;
        
        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60){
                mahasiswalulus++;
            } else {
                mahasiswatidaklulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai tertinggi : " + terendah);
        System.out.println("Jumlah Mahasiswa Lulus: " + mahasiswalulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + mahasiswatidaklulus);
    }
}