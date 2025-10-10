import java.util.Scanner;
public class ifCetakKRS08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Cetak KRS Siakad ---");
    System.out.print("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();

    // Kode sekarang (Tugas1)
    String hasil = (uktLunas) ? "Pembayaran UKT Terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
    System.out.println(hasil);
    
    // Kode sebelumnya (Percobaan 1)
    // if (uktLunas) {
    //   System.out.println("Pembayaran UKT terverifikasi");
    //   System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
    // } else {
    //   System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
    // }
  }
}