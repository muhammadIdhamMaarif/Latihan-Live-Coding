import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String metode = scanner.next();
        int banyakBarang = scanner.nextInt();
        int totalBerat = scanner.nextInt();

        int biayaTotal = 0;

        switch (metode) {
            case "EKONOMI":
                biayaTotal = hitungBiayaEkonomi(banyakBarang, totalBerat);
                break;
            case "REGULER":
                biayaTotal = hitungBiayaReguler(banyakBarang, totalBerat);
                break;
            case "KILAT":
                biayaTotal = hitungBiayaKilat(banyakBarang, totalBerat);
                break;
            case "SAMEDAY":
                biayaTotal = hitungBiayaSameday(banyakBarang, totalBerat);
                break;
            default:
                System.out.println("Pengiriman tidak dapat dilakukan");
                return;
        }

        if (biayaTotal == -1) {
            System.out.println("Pengiriman tidak dapat dilakukan");
        } else {
            biayaTotal = (int) (Math.round(biayaTotal / 100.0) * 100);
            System.out.println("Diperlukan biaya pengiriman sebesar " + biayaTotal);
        }
    }

    public static int hitungBiayaEkonomi(int banyakBarang, int totalBerat) {
        int biayaAwal = 10000;
        int biayaPerKg = 3000;
        int batasBerat = 15;
        int biayaEkstraPerKg = 1500;

        int biayaTotal = biayaAwal + (biayaPerKg * totalBerat);

        if (totalBerat > batasBerat) {
            biayaTotal += (totalBerat - batasBerat) * biayaEkstraPerKg;
        }

        if (banyakBarang > 6) {
            biayaTotal *= 0.95;
        }

        return biayaTotal;
    }

    public static int hitungBiayaReguler(int banyakBarang, int totalBerat) {
        int biayaAwal = 15000;
        int biayaPerKg = 5000;
        int batasBerat = 10;
        int biayaEkstraPerKg = 2000;

        int biayaTotal = biayaAwal + (biayaPerKg * totalBerat);

        if (totalBerat > batasBerat) {
            biayaTotal += (totalBerat - batasBerat) * biayaEkstraPerKg;
        }

        if (banyakBarang > 4) {
            biayaTotal *= 0.90;
        }

        return biayaTotal;
    }

    public static int hitungBiayaKilat(int banyakBarang, int totalBerat) {
        int biayaAwal = 15000;
        int biayaPerKg = 9000;
        int batasBerat = 10;
        int biayaEkstraPerKg = 2000;

        if (banyakBarang < 2) {
            return -1;
        }

        int biayaTotal = biayaAwal + (biayaPerKg * totalBerat);

        if (totalBerat > batasBerat) {
            biayaTotal += (totalBerat - batasBerat) * biayaEkstraPerKg;
        }

        if (banyakBarang > 4) {
            biayaTotal *= 0.85;
        }

        return biayaTotal;
    }

    public static int hitungBiayaSameday(int banyakBarang, int totalBerat) {
        int biayaAwal = 25000;
        int biayaPerKg = 12000;
        int batasBerat = 5;
        int biayaEkstraPerKg = 3000;

        if (banyakBarang < 1) {
            return -1;
        }

        int biayaTotal = biayaAwal + (biayaPerKg * totalBerat);

        if (totalBerat > batasBerat) {
            biayaTotal += (totalBerat - batasBerat) * biayaEkstraPerKg;
        }

        if (banyakBarang > 3) {
            biayaTotal *= 0.80;
        }

        return biayaTotal;
    }
}
