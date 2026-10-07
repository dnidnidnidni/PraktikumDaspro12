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
    if (totalHarga >= 100000) {
            diskon = totalHarga * 0.1;
        } else if (totalHarga >= 50000) {
            diskon = totalHarga * 0.05;
        }

        totalBayar = totalHarga - diskon;

        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextDouble();

        if (totalHarga >= 100000) {
            diskon = totalHarga * 0.10;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);

        System.out.print("Masukkan uang bayar: ");
        uangBayar = input.nextDouble();

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Not enough money, short by Rp " + kurang);
        }

        input.close();
    }
}