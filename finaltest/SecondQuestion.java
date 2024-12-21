2. Calendar 클래스를 활용하여 생일을 입력하면 오늘 이 시간까지 며칠을 살아왔는지 알려주는 프로그램을 작성하라. 며칠을 계산할 때는 오늘을 포함한다. 날짜가 바뀔 때 1일 산 것으로 계산한다.

package finaltest;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        System.out.println("오늘은 " + today + "입니다.");
        
        while (true) {
            System.out.print("생일 입력(년 월 일)>> ");
            String input = scanner.nextLine().trim();
            String[] dateParts = input.split("\\s+");

            if (input.equals("그만")) {break;}

            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);

            LocalDate birthDate = LocalDate.of(year, month, day);

            if (birthDate.isAfter(today)) {
                long daysUntilBirthday = ChronoUnit.DAYS.between(today, birthDate);
                System.out.println(daysUntilBirthday + "일 더 살아야 생일이 됩니다.");
            } else {
                long daysLived = ChronoUnit.DAYS.between(birthDate, today);
                System.out.println("오늘까지 " + daysLived + "일 살아왔습니다.");
            }
        }
        scanner.close();
    }
}
