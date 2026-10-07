import java.util.Scanner;

public class studiKasus112 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double hargaPerCup = 18000;
        double jumlahCup, uangBayar, kembalian, kurang, totalHarga, totalBayar, diskon;
    System.out.print("Masukkan jumlah cup: ");
        jumlahCup = input.nextDouble();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;        