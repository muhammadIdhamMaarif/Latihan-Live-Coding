
/*
    ==================================

        Muhammad Idham Ma'arif
             Anak Tekkom <3
             
    ==================================

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double jumlahKain = scanner.nextDouble();
        double jumlahPita = scanner.nextDouble();

        double kainS = 1.2, pitaS = 0.8;
        double kainM = 1.5, pitaM = 1.0;
        double kainL = 2.0, pitaL = 1.3;

        if (jumlahKain < kainS + kainM + kainL || jumlahPita < pitaS + pitaM + pitaL) {
            System.out.println("Jumlah Kain: " + jumlahKain);
            System.out.println("Jumlah Pita: " + jumlahPita);
            System.out.println("Bahan tidak cukup untuk membuat baju");
        } else {
            jumlahKain -= (kainS + kainM + kainL);
            jumlahPita -= (pitaS + pitaM + pitaL);

            int jumlahL = 1 + (int) Math.min(jumlahKain / kainL, jumlahPita / pitaL);
            jumlahKain -= (jumlahL - 1) * kainL;
            jumlahPita -= (jumlahL - 1) * pitaL;

            int jumlahM = 1 + (int) Math.min(jumlahKain / kainM, jumlahPita / pitaM);
            jumlahKain -= (jumlahM - 1) * kainM;
            jumlahPita -= (jumlahM - 1) * pitaM;

            int jumlahS = 1 + (int) Math.min(jumlahKain / kainS, jumlahPita / pitaS);
            
            System.out.println("Jumlah Kain: " + (jumlahKain + kainS + kainM + kainL));
            System.out.println("Jumlah Pita: " + (jumlahPita + pitaS + pitaM + pitaL));
            System.out.println("Nonput dapat membuat " + jumlahS + " ukuran S, " + jumlahM + " ukuran M, " + jumlahL + " ukuran L.");
        }

        scanner.close();
    }
}
