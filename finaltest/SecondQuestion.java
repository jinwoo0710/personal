2. Calendar 클래스를 활용하여 생일을 입력하면 오늘 이 시간까지 며칠을 살아왔는지 알려주는 프로그램을 작성하라. 며칠을 계산할 때는 오늘을 포함한다. 날짜가 바뀔 때 1일 산 것으로 계산한다.

package finaltest;
import java.util.Calendar;
import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar today = Calendar.getInstance();

        System.out.prrintln("오늘은 날짜는 " + today + "입니다");
        while (true) {
            System.out.print("생일 입력(년 월 일)>> ");
            String input = scanner.nextLine().trim();
            
            if (input.equals("그만")) {
                break;
            }

            String[] dateParts = input.split("\\s+");

            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]) - 1;
            int day = Integer.parseInt(dateParts[2]);

            Calendar birthDate = Calendar.getInstance();
            birthDate.set(year, month, day);

            // 오늘 날짜와 생일 날짜를 비교
            long diffInMillis = today.getTimeInMillis() - birthDate.getTimeInMillis();
            long diffInDays = (diffInMillis / (1000 * 60 * 60 * 24)) + 1;

            if (birthDate.after(today)) {
                long daysUntilBirthday = (birthDate.getTimeInMillis() - today.getTimeInMillis()) / (1000 * 60 * 60 * 24);
                System.out.println(daysUntilBirthday + "일 더 살아야 생일이 됩니다.");
            } else {
                System.out.println("오늘까지 " + diffInDays + "일 살아왔습니다.");
            }
        }
        
        scanner.close();
    }
}
