import java.util.Scanner;

/*
    ==================================

        Muhammad Idham Ma'arif
             Anak Tekkom <3
             
    ==================================

*/

public class NonputDesainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double kainTersedia = scanner.nextDouble();
        double pitaTersedia = scanner.nextDouble();
        
        double kainS = 1.2, pitaS = 0.8;
        double kainM = 1.5, pitaM = 1.0;
        double kainL = 2.0, pitaL = 1.3;

        if (kainTersedia < kainS || pitaTersedia < pitaS) {
            System.out.println("Bahan tidak cukup untuk membuat baju.");
            return;
        }

        int jumlahL = (int) Math.min(kainTersedia / kainL, pitaTersedia / pitaL);
        kainTersedia -= jumlahL * kainL;
        pitaTersedia -= jumlahL * pitaL;

        int jumlahM = (int) Math.min(kainTersedia / kainM, pitaTersedia / pitaM);
        kainTersedia -= jumlahM * kainM;
        pitaTersedia -= jumlahM * pitaM;

        int jumlahS = (int) Math.min(kainTersedia / kainS, pitaTersedia / pitaS);

        System.out.println("Jumlah Kain: " + kainTersedia);
        System.out.println("Jumlah Pita: " + pitaTersedia);
        System.out.printf("Nonput dapat membuat %d ukuran S, %d ukuran M, %d ukuran L.%n", jumlahS, jumlahM, jumlahL);

        scanner.close();
    }
}
