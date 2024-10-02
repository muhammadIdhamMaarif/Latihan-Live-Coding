
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

        int tanggalAwal = scanner.nextInt();
        int poin = 30 - tanggalAwal + 1;

        System.out.println("Tanggal awal makan di resto: " + tanggalAwal);

        if (poin < 2) {
            System.out.println("Poin tidak cukup untuk ditukarkan");
            return;
        }

        int ramen = 0, gyoza = 0, ocha = 0;

        while (poin >= 10) {
            ramen++;
            poin -= 10;
        }

        while (poin >= 5) {
            gyoza++;
            poin -= 5;
        }

        while (poin >= 2) {
            ocha++;
            poin -= 2;
        }

        System.out.print("Hyde O'Brien mendapat ");
        boolean isFirst = true;

        if (ramen > 0) {
            System.out.print(ramen + " Ramen");
            isFirst = false;
        }

        if (gyoza > 0) {
            if (!isFirst) System.out.print(", ");
            System.out.print(gyoza + " Gyoza");
            isFirst = false;
        }

        if (ocha > 0) {
            if (!isFirst) System.out.print(", ");
            System.out.print(ocha + " Ocha");
        }

        System.out.println();
    }
}
