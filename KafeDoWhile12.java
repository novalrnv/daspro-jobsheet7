import java.util.Scanner;

public class KafeDoWhile12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namapelanggan;
        int kopi, teh, roti, totalharga;
        int hargakopi = 12000, hargateh = 7000, hargaroti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namapelanggan = input.nextLine();
            if (namapelanggan.equalsIgnoreCase("batal")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
                System.out.print("Jumlah Kopi: ");
                kopi = input.nextInt();
                System.out.print("Jumlah Teh: ");
                teh = input.nextInt();
                System.out.print("Jumlah Roti: ");
                roti = input.nextInt();
                
                totalharga = (kopi*hargakopi) + (teh*hargateh) + (roti*hargaroti);
                System.out.println("Total yang harus dibayar: Rp " + totalharga);
                input.nextLine();
            } while (true);

            System.out.println("Semua transaksi selesai.");
        }
}
