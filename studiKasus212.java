import java.util.Scanner;

public class studiKasus212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String activityType = sc.nextLine().trim();

        if (activityType.equalsIgnoreCase("BELMAWA") || 
            activityType.equalsIgnoreCase("BAKORMA") || 
            activityType.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            int docs = sc.nextInt();

            System.out.print("Peringkat juara : ");
            int rank = sc.nextInt();

            if (docs < 4) {
                int missing = 4 - docs;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + missing + " dokumen). Dana penghargaan tidak diberikan.");
            } else if (rank >= 1 && rank <= 3) {
                System.out.println("Status : Dokumen lengkap dan memenuhi syarat (Juara " + rank + "). Dana penghargaan diberikan.");
            } else {
                System.out.println("Status : Dokumen lengkap, tetapi tidak mendapatkan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        }
             else if (activityType.equalsIgnoreCase("PKM")) {

           
            System.out.print("Jumlah dokumen : ");
            int docs = sc.nextInt();

            System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak didanai) : ");
            int fundingStatus = sc.nextInt();

        
            if (docs < 4) {
                int missing = 4 - docs;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + missing + " dokumen). Dana penghargaan tidak diberikan.");
            } else if (fundingStatus == 1) {
                System.out.println("Status : Dokumen lengkap dan PKM didanai. Dana penghargaan diberikan.");
            } else {
                System.out.println("Status : Dokumen lengkap, tetapi PKM tidak didanai. Dana penghargaan tidak diberikan.");
            }

        } else {
            // Level 1: Category "Lainnya" or unrecognized input
            System.out.println("Status : Jenis kegiatan tidak berhak menerima dana penghargaan.");
        }

        sc.close();
    }
}