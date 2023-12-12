import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Data apenas
        LocalDate date1 = LocalDate.now();

        //Data e hora Local do computador
        LocalDateTime date2 = LocalDateTime.now();

        //Data hora GNT, data hora global (horário de londres)
        Instant date3 = Instant.now();

        LocalDate date4 = LocalDate.parse("2023-11-29");

        //Data hora com Texto ISO 8601
        LocalDateTime date5 = LocalDateTime.parse("2023-11-29T01:30:26");

        Instant date6 = Instant.parse("2023-11-29T01:30:26Z");

        //Utilizando -03:00 para indicar que o horário (de São Paulo) possui um fuso horário de 03 horas
        Instant date7 = Instant.parse("2023-11-29T01:30:26-03:00");

        //Utilizando o format1 posso passar uma data na hora de instanciar com a formatação do format1
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date8 = LocalDate.parse("20/10/2023", format1);
        LocalDateTime date9 = LocalDateTime.parse("20/10/2023 10:12", format2);
        LocalDate date10 = LocalDate.parse("20-10-2023", format3);

        //Instanciando passando data, mês e ano isoladamente
        LocalDate d1 = LocalDate.of(2023,11,29);
        LocalDateTime d2 = LocalDateTime.of(2023,11,29, 10, 9);

//        System.out.println("Date 1 = " + date1);
//        System.out.println("Date 2 = " + date2);
//        System.out.println("Date 3 = " + date3);
//        System.out.println("Date 4 = " + date4);
//        System.out.println("Date 5 = " + date5);
//        System.out.println("Date 6 = " + date6);
//        System.out.println("Date 7 = " + date7);
        System.out.println("Date 8 = " + date8);
        System.out.println("Date 9 = " + date9);
        System.out.println("Date 10 = " + date10);
        System.out.println("D1 = " + d1);
        System.out.println("D2 = " + d2);
    }
}