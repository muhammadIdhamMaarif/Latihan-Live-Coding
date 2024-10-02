
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
        
        int input = scanner.nextInt();
        String operasi = scanner.next();    
        int[] elemen = new int[7];          
        for (int i = 0; i < 7; i++) {
            elemen[i] = scanner.nextInt();    
        }

        boolean hasil = lakukanInferensi(input, operasi, elemen, 0);
        System.out.println(hasil);
    }

    public static boolean lakukanInferensi(int input, String operasi, int[] elemen, int index) {
        // Tahap n=1 (elemen pertama)
        if (periksaKondisi(input, operasi, elemen[index])) {
            if (periksaKondisi(input, operasi, elemen[1])) {
                if (periksaKondisi(input, operasi, elemen[3])) {
                    return periksaKondisi(input, operasi, elemen[5]); 
                } else {
                    return periksaKondisi(input, operasi, elemen[6]); 
                }
            } else {
                if (periksaKondisi(input, operasi, elemen[4])) {
                    return periksaKondisi(input, operasi, elemen[5]); 
                } else {
                    return periksaKondisi(input, operasi, elemen[6]); 
                }
            }
        } else {
            if (periksaKondisi(input, operasi, elemen[2])) {
                if (periksaKondisi(input, operasi, elemen[3])) {
                    return periksaKondisi(input, operasi, elemen[5]);
                } else {
                    return periksaKondisi(input, operasi, elemen[6]); 
                }
            } else {
                if (periksaKondisi(input, operasi, elemen[4])) {
                    return periksaKondisi(input, operasi, elemen[5]); 
                } else {
                    return periksaKondisi(input, operasi, elemen[6]); 
                }
            }
        }
    }
    
    public static boolean periksaKondisi(int input, String operasi, int elemen) {
        switch (operasi) {
            case "lt":
                return input < elemen;
            case "gt":
                return input > elemen;
            case "leq":
                return input <= elemen;
            case "geq":
                return input >= elemen;
            default:
                return false; 
        }
    }
}
