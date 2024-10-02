import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int skorDengklek = 0;
        int skorSengklek = 0;
        
        for (int i = 0; i < 4; i++) {
            String dengklek = scanner.next();
            String sengklek = scanner.next();
            
            if (dengklek.equals(sengklek)) {
                System.out.println("Seri");
            } else if ((dengklek.equals("gunting") && sengklek.equals("kertas")) ||
                    (dengklek.equals("kertas") && sengklek.equals("batu")) ||
                    (dengklek.equals("batu") && sengklek.equals("gunting"))) {
                System.out.println("Sengklek menang");
                skorSengklek++;
            } else {
                System.out.println("Dengklek menang");
                skorDengklek++;
            }
        }
        
        if (skorDengklek == skorSengklek) {
            System.out.println("Perlombaan seri, maka tidak ada yang menang dan hadiah buat panitia");
        } else if (skorDengklek > skorSengklek) {
            System.out.println("Perlombaan dimenangkan oleh Dengklek dengan skor " + skorDengklek + " vs " + skorSengklek);
        } else {
            System.out.println("Perlombaan dimenangkan oleh Sengklek dengan skor " + skorSengklek + " vs " + skorDengklek);
        }

        scanner.close();
    }
}
