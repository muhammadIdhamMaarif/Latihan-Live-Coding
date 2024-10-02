    import java.time.Duration;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;

    /*
    ==================================

        Muhammad Idham Ma'arif
             Anak Tekkom <3

    ==================================

     */

    public class Main {

        public static void main(String[] args) {
            //ini sampel input yang ntar dimasukin ke parseDateTime
            String inputA = "30 aug 14 59";
            String inputB = "2 sep 18 32";

            LocalDateTime dateTimeA = parseDateTime(inputA);
            LocalDateTime dateTimeB = parseDateTime(inputB);

            Duration duration = Duration.between(dateTimeA, dateTimeB);

            long days = duration.toDays();
            duration = duration.minusDays(days);
            long hours = duration.toHours();
            duration = duration.minusHours(hours);
            long minutes = duration.toMinutes();

            System.out.printf("%dd %dh %dm%n", days, hours, minutes);
        }

        private static LocalDateTime parseDateTime(String input) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM HH mm");
            return LocalDateTime.parse(input + " 2024", formatter.withLocale(java.util.Locale.ENGLISH));
        }
    }
