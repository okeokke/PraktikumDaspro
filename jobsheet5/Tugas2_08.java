import java.util.Scanner;
public class Tugas2_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angka;
    System.out.print("Masukkan angka untuk menentukan Ganjil/Genap: ");
    angka=sc.nextInt();
    if (angka % 2 == 0) {
        System.out.printf("Angka '%s' adalah Genap",angka);
    }
    else {
        System.out.printf("Angka '%s' adalah Ganjil",angka);
    }
  }
}